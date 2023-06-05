package bsu.wot.state;

/*
 * When Tank in "understaffed" user can change crew ammo and go to a battle
 */
public class TankIsUnderstaffedState implements TankState {
	// Status of crew
	private boolean fullCrew;
	// Status of ammunition
	private boolean ammunition;

	public TankIsUnderstaffedState() {
		this(false, false);
	}

	public TankIsUnderstaffedState(boolean ammunition) {
		this(ammunition, true);
	}

	public TankIsUnderstaffedState(boolean ammunition, boolean fullCrew) {
		this.ammunition = ammunition;
		this.fullCrew = fullCrew;
	}

	// Tank can be renovated only in "not ready" state
	public void repair(Tank context) {
		System.out.println("Tank already repaired");
	}

	// Change crew status if ammunition full (ammunition : true) change Tank
	// state to TankReadyState
	public void changeCrew(Tank context) {
		// logic of changing crew
		fullCrew = !fullCrew;
		System.out.println("Crew changed");
		if (ammunition && fullCrew) {
			context.changeState(new TankReadyState());
		}
	}

	@Override
	public void changeState(Tank context) {

	}

	// Go to fight (TankInBattleState) only if crew full (fullCrew : true)
	public void fight(Tank context) {
		if (fullCrew) {
			System.out.println("Bom, tra-ta-ta, wzzzzzz....");
			context.changeState(new TankInBattleState(context, ammunition));
		} else {
			System.out.println("Not full crew");
		}
	}

	// Change ammunition status if crew full (fullCrew : true) change Tank state
	// to TankReadyState
	public void changeAmmunition(Tank context) {
		ammunition = !ammunition;
		System.out.println("Ammo changed");
		if (ammunition && fullCrew) {
			context.changeState(new TankReadyState());
		}
	}

}

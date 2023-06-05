package bsu.wot.state;

/*
 * When Tank in "not ready" user can repair, and change crew of Tank,
 * Tank can be set to "not ready" only after a battle
 * As a default tank damaged in this state
 */
public class TankNotReadyState implements TankState {
	// Status of crew
	private boolean fullCrew;
	// Status of ammunition
	private boolean ammunition;

	// State always initialize with full crew
	public TankNotReadyState(boolean fullAmmo) {
		this.ammunition = fullAmmo;
		this.fullCrew = true;
	}

	// State can be changed only after calling this function which repair tank
	public void repair(Tank context) {
		/*
		 * If ammunition and crew full Tank state changes to TankReadyState otherwise
		 * to TankIsUnderstaffedState
		 */
		if (ammunition && fullCrew) {
			System.out.println("Tank repared and ready for a battle");
			context.changeState(new TankReadyState());
		} else {
			System.out
					.println("Tank repared but your ammunition or crew not full");
			context.changeState(new TankIsUnderstaffedState(ammunition,
					fullCrew));
		}
	}

	public void changeCrew(Tank context) {
		// logic of changing crew
		fullCrew = !fullCrew;
		System.out.println("Crew changed");
	}

	@Override
	public void changeState(Tank context) {

	}

	public void fight(Tank context) {
		System.out.println("Can't fight on non repaired tank");

	}

	public void changeAmmunition(Tank context) {
		ammunition = !ammunition;
		System.out.println("Ammo changed");
	}

}

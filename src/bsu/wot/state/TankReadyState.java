package bsu.wot.state;

// Form this state user can go to battle change crew and ammo
public class TankReadyState implements TankState {

	// Tank can be renovated only in "not ready" state
	public void repair(Tank context) {
		System.out.println("Tank already has repaired");
	}

	// When user change crew Tank state immediately change to
	// TankIsUnderstaffedState
	public void changeCrew(Tank context) {
		// logic of changing crew
		System.out.println("Crew changed");
		context.changeState(new TankIsUnderstaffedState(true, false));
	}

	@Override
	public void changeState(Tank context) {
		
	}

	// When user start fight Tank state immediately change to TankInBattleState
	public void fight(Tank context) {
		System.out.println("Bom, tra-ta-ta, wzzzzzz....");
		context.changeState(new TankInBattleState(context));
	}

	// When user change ammo Tank state immediately change to
	// TankIsUnderstaffedState
	public void changeAmmunition(Tank context) {
		System.out.println("Ammo changed");
		context.changeState(new TankIsUnderstaffedState(false, true));
	}

}

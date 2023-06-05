package bsu.wot.state;

public class Tank {
	private TankState state;

	public Tank() {
		state = new TankIsUnderstaffedState();
	}

	// Go to battle function
	public void rollOut() {
		state.fight(this);
	}

	public void prepareAmmunition() {
		// need mor logic here
		state.changeAmmunition(this);
	}

	public void prepareCrew() {
		// need mor logic here
		state.changeCrew(this);
	}

	public void repair() {
		// need mor logic here
		state.repair(this);
	}

	public void changeState(TankState state) {
		// check for possibility to change state
		this.state = state;
	}
}

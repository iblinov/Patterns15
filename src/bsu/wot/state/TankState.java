package bsu.wot.state;

public interface TankState {
	void repair(Tank context);

	void changeAmmunition(Tank context);

	void changeCrew(Tank context);
	void changeState(Tank context);
	void fight(Tank context);
}

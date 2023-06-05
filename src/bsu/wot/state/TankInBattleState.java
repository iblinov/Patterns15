package bsu.wot.state;

import java.util.Random;

// When Tank in battle user can only fight and after the end of the battle state of tank will be changed 
public class TankInBattleState implements TankState {
	// Random used to generate result of battle
	private Random rand = new Random();
	// Tank can start battle without ammunition, if set to true ammunition full,
	// if false - empty
	private boolean ammunition;

	// Default constructor which initialize state with full ammunition
	public TankInBattleState(Tank context) {
		this(context, true);
	}

	// Constructor which initialize state with ammunition
	public TankInBattleState(Tank context, boolean ammunition) {
		this.ammunition = ammunition;
		this.fight(context);
	}

	// Tank can be renovated only in "not ready" state
	public void repair(Tank context) {
		System.out.println("Tank can't be repaired in battle");
	}

	public void changeCrew(Tank context) {
		System.out.println("Crew can't be changed in battle");
	}

	@Override
	public void changeState(Tank context) {

	}

	/*
	 * Battle here, random emulate result of battle. In real world fight spend
	 * some time and result set after the end of battle
	 */
	public void fight(Tank context) {
		// Get damage property of tank after a battle
		boolean damaged = rand.nextBoolean();
		ammunition = ammunition ? rand.nextBoolean() : ammunition;
		/*
		 * If Tank damaged state always changes to TankNotReadyState, from which
		 * he can be renovated. If Tank didn't have damage but ammunition not
		 * full he goes to TankIsUnderstaffedState If all good (ammunition full
		 * and Tank didn't damaged) Tank goes to TankReadyState
		 */
		if (damaged) {
			System.out
					.println("You a great warrior, your tank was damaged and finished battle with "
							+ (ammunition ? "full ammo" : "no ammo"));
			context.changeState(new TankNotReadyState(ammunition));
		} else if (!ammunition) {
			System.out
					.println("You a lucky guy, your tank wasn't be damaged and finished battle with "
							+ (ammunition ? "full ammo" : "no ammo"));
			context.changeState(new TankIsUnderstaffedState(ammunition));
		} else {
			System.out
					.println("You didn't do anything in battle and tank wasn't damaged and finished battle with full ammo");
			context.changeState(new TankReadyState());
		}
	}

	public void changeAmmunition(Tank context) {
		System.out.println("Ammunition can't be changed in battle");
	}

}

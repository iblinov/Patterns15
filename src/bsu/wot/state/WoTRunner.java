package bsu.wot.state;

public class WoTRunner {
	public static void main(String[] args) {
		Tank ms1 = new Tank();
		ms1.prepareCrew();
		ms1.prepareAmmunition();
		ms1.rollOut();
	}
}

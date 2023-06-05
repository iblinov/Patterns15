package by.compositewar.composite;

public interface TroopComponent {
    void attack(TroopComponent enemy);
    boolean defend(Warrior enemy);
    boolean isAlive();
    int numberOfWarriors();
}

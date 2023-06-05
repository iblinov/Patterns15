package by.compositewar.warriortype;

public class WarriorCharacteristic {
    public final int MAX_HEAL;
    public final int MIN_HEAL;
    public final int MAX_DAMAGE;
    public final int MIN_DAMAGE;
    public final int MAX_DEFENCE;
    public final int MIN_DEFENCE;

    public WarriorCharacteristic(int MAX_HEAL, int MIN_HEAL, int MAX_DAMAGE, int MIN_DAMAGE, int MAX_DEFENCE, int MIN_DEFENCE) {
        this.MAX_HEAL = MAX_HEAL;
        this.MIN_HEAL = MIN_HEAL;
        this.MAX_DAMAGE = MAX_DAMAGE;
        this.MIN_DAMAGE = MIN_DAMAGE;
        this.MAX_DEFENCE = MAX_DEFENCE;
        this.MIN_DEFENCE = MIN_DEFENCE;
    }
}

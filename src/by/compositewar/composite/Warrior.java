package by.compositewar.composite;

import by.compositewar.generator.IdGenerator;
import by.compositewar.warriortype.Race;


public class Warrior implements TroopComponent {

    private long warriorId;
    private Race race;
    private int heal;
    private int fullHeal;
    private int damage;
    private int defence;

    public Warrior(Race race, int heal, int damage, int defence) {
        this.warriorId = IdGenerator.getGenerator().getWarriorId();
        this.race = race;
        this.heal = heal;
        this.fullHeal = heal;
        this.defence = defence;
        this.damage = damage;
    }

    public long getWarriorId() {
        return warriorId;
    }

    public Race getRace() {
        return race;
    }

    public int getFullHeal() {
        return fullHeal;
    }

    public int getDefence() {
        return defence;
    }

    public int getDamage() {
        return damage;
    }

    public int getHeal() {
        return heal;
    }

    @Override
    public boolean isAlive() {
        return heal > 0;
    }

    @Override
    public boolean defend(Warrior enemy) {
        if (defence < enemy.damage) {
         //   LOGGER.info(this + "defend: " + (enemy.damage - defence));
            heal -= enemy.damage - defence;
            if (!isAlive()) {
          //      LOGGER.info(this + "\\dead");
            }
        }
        return isAlive();
    }

    @Override
    public void attack(TroopComponent troop) {
     //   LOGGER.info(this + "attack: " + damage);
        troop.defend(this);
    }

    @Override
    public int numberOfWarriors() {
        return 1;
    }

    @Override
    public String toString() {
        return race + ": " + warriorId + ", heal=" + heal + "/" + fullHeal + ", damage=" + damage + ", defence=" + defence + "\n";
    }
}

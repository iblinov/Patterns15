package by.compositewar.generator;

import by.compositewar.composite.TroopComponent;
import by.compositewar.composite.TroopComposite;
import by.compositewar.composite.Warrior;
import by.compositewar.warriortype.Race;

import java.util.Random;

public class Generator {
    private static Random rand = new Random();

    public static TroopComponent generateTroop(int numberOfWarriors) {
        TroopComposite troop = new TroopComposite();
        int numberOfGenerateWarriors = nextPositiveInt(numberOfWarriors);
        for (int i = 0; i < numberOfGenerateWarriors; i++) {
            troop.add(generateWarrior());
        }
        numberOfWarriors -= numberOfGenerateWarriors;
        while (numberOfWarriors > 0) {
            numberOfGenerateWarriors = nextPositiveInt(numberOfWarriors);
            troop.add(generateTroop(numberOfGenerateWarriors));
            numberOfWarriors -= numberOfGenerateWarriors;
        }
        return troop;
    }

    public static Warrior generateWarrior() {
        Race race = Race.values()[nextInt(Race.values().length)];
        int damage = nextInt(race.getWarriorCharacteristic().MIN_DAMAGE, race.getWarriorCharacteristic().MAX_DAMAGE);
        int heal = nextInt(race.getWarriorCharacteristic().MIN_HEAL, race.getWarriorCharacteristic().MAX_HEAL);
        int defence = nextInt(race.getWarriorCharacteristic().MIN_DEFENCE, race.getWarriorCharacteristic().MAX_DEFENCE);
        return new Warrior(race, heal, damage, defence);
    }

    public static int nextPositiveInt(int bound) {
        int result = rand.nextInt(bound);
        return result + 1;
    }

    public static int nextInt(int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    public static int nextInt(int bound) {
        return rand.nextInt(bound);
    }
}

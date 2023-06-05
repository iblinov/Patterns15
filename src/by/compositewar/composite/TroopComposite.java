package by.compositewar.composite;

import by.compositewar.generator.Generator;
import by.compositewar.generator.IdGenerator;

import java.util.ArrayList;

public class TroopComposite implements TroopComponent {

    private long troopId;
    private ArrayList<TroopComponent> troops;

    public TroopComposite() {
        this.troops = new ArrayList<>();
        troopId = IdGenerator.getGenerator().getTroopId();
    }

    public void add(TroopComponent troop) {
        troops.add(troop);
    }

    @Override
    public boolean isAlive() {
        return !troops.isEmpty();
    }

    @Override
    public boolean defend(Warrior enemy) {
        if (isAlive()) {
            int index = Generator.nextInt(troops.size());
            if (!troops.get(index).defend(enemy)) {
                troops.remove(index);
            }
        }
        return isAlive();
    }

    @Override
    public void attack(TroopComponent enemy) {
        for (TroopComponent troop : troops) {
            troop.attack(enemy);
        }
    }

    @Override
    public int numberOfWarriors() {
        int sum = 0;
        for (TroopComponent troop : troops) {
            sum += troop.numberOfWarriors();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Troop: " + troopId + "\n");
        for (TroopComponent troop : troops) {
            stringBuilder.append(troop);
        }
        stringBuilder.append("\\" + troopId + "\n");
        return stringBuilder.toString();
    }
}

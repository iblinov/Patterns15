package by.compositewar.action;

import by.compositewar.composite.TroopComponent;
import by.compositewar.exception.TroopException;



public class Fight {

    public static void doFight(TroopComponent firstTroop, TroopComponent secondTroop) throws TroopException {
        if(firstTroop == secondTroop){
            throw new TroopException("Cant fight himself");
        }
     //   LOGGER.info("Number of warriors in first troop: " + firstTroop.numberOfWarriors() + "\n" + firstTroop);
     //   LOGGER.info("Number of warriors in second troop: " + secondTroop.numberOfWarriors() + "\n" + secondTroop);
        while (firstTroop.isAlive() && secondTroop.isAlive()) {
            firstTroop.attack(secondTroop);
            secondTroop.attack(firstTroop);
        }
        if (firstTroop.isAlive()) {
      //      LOGGER.info("Winner\nNumber of warriors: " + firstTroop.numberOfWarriors() + "\n" + firstTroop);
        } else {
       //     LOGGER.info("Winner\nNumber of warriors: " + secondTroop.numberOfWarriors() + "\n" + secondTroop);
        }
    }
}

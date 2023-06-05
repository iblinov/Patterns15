package by.compositewar.main;

import by.compositewar.action.Fight;
import by.compositewar.composite.TroopComponent;
import by.compositewar.exception.TroopException;
import by.compositewar.generator.Generator;


public class Main {


    public static void main(String[] args) {
        try {
            TroopComponent troop1 = Generator.generateTroop(5);
            TroopComponent troop2 = Generator.generateTroop(5);
            Fight.doFight(troop1, troop2);
        }catch(TroopException e){
  //          LOGGER.error(e);
        }
    }
}
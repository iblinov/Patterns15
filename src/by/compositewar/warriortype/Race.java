package by.compositewar.warriortype;

public enum Race {
    MAN(new WarriorCharacteristic(300, 20, 30, 10, 30, 5)),
    ORC(new WarriorCharacteristic(500, 50, 40, 20, 10, 0)),
    ELF(new WarriorCharacteristic(300, 30, 70, 30, 15, 5)),
    WIZARD(new WarriorCharacteristic(200, 10, 200, 50, 5, 0));
    private final WarriorCharacteristic warriorCharacteristic;

    Race(WarriorCharacteristic warriorCharacteristic) {
        this.warriorCharacteristic = warriorCharacteristic;
    }

    public WarriorCharacteristic getWarriorCharacteristic() {
        return warriorCharacteristic;
    }
}

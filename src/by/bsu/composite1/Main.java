package by.bsu.composite1;

public class Main {

    public static void main(String[] args) {

        Composite army = new Composite();
        Composite partElf = new Composite();
        Composite partDwarf = new Composite();
        army.add(partElf);
        army.add(partDwarf);
        Elf elf1 = new Elf();
        Elf elf2 = new Elf();
        Elf elf3 = new Elf();
        Elf elf4 = new Elf();
        Elf elf5 = new Elf();
        Dwarf dwarf1 = new Dwarf();
        Dwarf dwarf2 = new Dwarf();
        Dwarf dwarf3 = new Dwarf();
        Dwarf dwarf4 = new Dwarf();
        partElf.add(elf1)
                .add(elf2)
                .add(elf3)
                .add(elf4)
                .add(elf5);
        partDwarf.add(dwarf1);
        partDwarf.add(dwarf2);
        partDwarf.add(dwarf3);
        partDwarf.add(dwarf4);
        army.add(new Dwarf());
        partElf.add(partDwarf);
        int result = army.offence();
        System.out.println(result);

    }
}

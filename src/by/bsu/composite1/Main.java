package by.bsu.composite1;

public class Main {

    public static void main(String[] args) {

        Composite army = new Composite();
        Composite partElf = new Composite();
        Composite partOrcs = new Composite();
        army.add(partElf);
        army.add(partOrcs);
        Elf elf1 = new Elf();
        Elf elf2 = new Elf();
        Elf elf3 = new Elf();
        Elf elf4 = new Elf();
        Elf elf5 = new Elf();
        Orc orc1 = new Orc();
        Orc orc2 = new Orc();
        Orc orc3 = new Orc();
        Orc orc4 = new Orc();
        partElf.add(elf1)
                .add(elf2)
                .add(elf3)
                .add(elf4)
                .add(elf5);
        partOrcs.add(orc1);
        partOrcs.add(orc2);
        partOrcs.add(orc3);
        partOrcs.add(orc4);
        army.add(new Orc());
        partElf.add(partOrcs);
        int result = army.offence();
        System.out.println(result);

    }
}

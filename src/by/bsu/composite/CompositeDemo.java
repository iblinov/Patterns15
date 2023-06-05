package by.bsu.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Code code0 = new Code(700, 100, CodeType.CODE);
        Code code1 = new Code(701, 10, CodeType.CODE);
        Code code2 = new Code(707, 12, CodeType.CODE);
        Code code3 = new Code(777, 9, CodeType.CODE);
        Code code4 = new Code(717, 10, CodeType.CODE);
        Code code5 = new Code(771, 11, CodeType.CODE);
        Code codetest0 = new Code(552, 8, CodeType.TEST);
        Code codetest1 = new Code(522, 7, CodeType.TEST);
        Code codetest2 = new Code(555, 6, CodeType.TEST);
        Code codetest3 = new Code(525, 8, CodeType.TEST);
        Code codetest4 = new Code(558, 9, CodeType.TEST);
        CompositeProject project = new CompositeProject(1);
        CompositeProject task1 = new CompositeProject(55);
        CompositeProject task2 = new CompositeProject(77);

        project.add(task1);
        project.add(task2);
        project.add(code0);
        task1.add(code1);
        task1.add(code2);
        task1.add(code3);
        task1.add(codetest0);
        task1.add(codetest1);
        task1.add(codetest2);
        task1.add(codetest3);
        task2.add(code4);
        task2.add(code5);
        task2.add(codetest4);
        System.out.println("Total time=" + project.defineTimeRequired());
        task1.remove(codetest0);
        task1.remove(codetest1);
        codetest2.setDone(true);
        code0.setDone(true);
        System.out.println("Total time=" + project.defineTimeRequired());
    }
}

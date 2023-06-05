package by.epam;

import java.io.*;

public class Serializator {
    public boolean serialize(Student s, String filename) {
        boolean flag = false;
        File f = new File(filename);
        ObjectOutputStream ostream = null;
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ostream = new ObjectOutputStream(fos);
            ostream.writeObject(s); // сериализация
            flag = true;
        } catch (FileNotFoundException e) {
            System.err.println("Файл не может быть создан: "+ e);
        } catch (NotSerializableException e) {
            System.err.println("Класс не поддерживает сериализацию: " + e);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                if (ostream != null) {
                    ostream.close();
                }
            } catch (IOException e) {
                System.err.println("ошибка  закрытия потока");
            }
        }
        return flag;
    }
    public Student deserialize(String filename) throws  IOException,ClassNotFoundException {
        File fr = new File(filename);
        ObjectInputStream istream = null;
        try {
            FileInputStream fis = new FileInputStream(fr);
            istream = new ObjectInputStream(fis);
            // десериализация
            Student st = (Student)istream.readObject();
            return st;
        } catch (final Exception e) {
            throw e;
        } finally {
            try {
                if (istream != null) {
                    istream.close();
                }
            } catch (IOException e) {
                System.err.println("ошибка закрытия потока ");
            }
        }
    }
}

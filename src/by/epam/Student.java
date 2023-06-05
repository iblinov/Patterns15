package by.epam;
import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    protected static String faculty = "MMF";
    private int id;
    private String name;
    private transient String password;
    private static final long serialVersionUID = 1L;
    /* смысл поля serialVersionUID для класса будет объяснен ниже */
    public Student(int id, String name, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (id != student.id) return false;
        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(password, student.password);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "\nfaculty " + faculty + "\nname " + name + "\nID " + id + 								"\npassword " + password;
    }
}

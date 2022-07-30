package poo.interfaces;

public class Employer {
    String name;
    double salary;
    boolean active;

    public Employer(String name, double salary, boolean active) {
        this.name = name;
        this.salary = salary;
        this.active = active;
    }


    @Override
    public String toString() {
        return "\n" +
                " Employer{" +
                " name='" + name + '\'' +
                "," + "\t" + "salary=" + salary +
                "," + "\t" + "active=" + active +
                '}';
    }
}

package poo.interfaces;

import java.util.List;

public class InterfacesMain {
    public static void main(String[] args) {

        Employer max = new Employer(
                "Max",
                40000,
                true);
        Employer francis = new Employer(
                "Francis",
                45000,
                true);
        Employer joseph = new Employer(
                "Joseph",
                50000,
                false);

        EmployerCRUD employerCRUD = new EmployerCRUD();

        employerCRUD.create(max);
        employerCRUD.create(francis);
        employerCRUD.create(joseph);

        List<Employer> employers = employerCRUD.findAll();
        System.out.println(employers);

    }


}

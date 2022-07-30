package poo.ejerciciosTema5;

public class Main {
    public static void main(String[] args) {
        CocheCrudImpl cocheCrud = new CocheCrudImpl();

        cocheCrud.save();
        cocheCrud.delete();
        cocheCrud.findAll();

        System.out.println(cocheCrud);

    }
}

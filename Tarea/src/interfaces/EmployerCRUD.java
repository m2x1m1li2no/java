package poo.interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmployerCRUD {
    /*
     * Create
     * Retrieve/ Read
     * Update
     * Delete
     */

    //data structure
    List <Employer> employers = new ArrayList<>();

    //CREATE
    public void create(Employer employer){
        employers.add(employer);
    }

    //RETRIEVE
    public List<Employer> findAll(){
        return employers;
    }

}

package poo.interfaces;
import java.util.List;

public interface CrudEmployer {

    void create(Employer employer);

    List<Employer> findAll();

    void delete(Employer employer);
}

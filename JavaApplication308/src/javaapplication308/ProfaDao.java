package javaapplication308;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProfaDao implements Dao<Profa> {

    public List<Profa> profa;

    public ProfaDao() {
        profa = new ArrayList<>();
//        Profa p1 = new Profa(1, "Ahmed", 3000.90);
//        Profa p3 = new Profa("Ahmed", 3000.90);
//        Profa p2 = new Profa(2, "Muhamed", 6000.90);
//        profa.add(p1);
//        profa.add(p2);
//        p3.id++;
//        profa.add(p3);
    }

    @Override
    public Profa get(long id) {
        return profa.get((int) id);
    }

    @Override
    public List<Profa> getAll() {
        return profa;
    }

    @Override
    public void save(Profa t) {
        profa.add(t);
    }

    @Override
    public void update(Profa t) {
        profa.get(t.getId()).setName(t.getName());
        System.out.println("Student: Roll No " + t.getId() + ", updated in the database");

    }

    @Override
    public void delete(Profa t) {
        profa.remove(t.getId());
        System.out.println("succesfull delete");
    }

}

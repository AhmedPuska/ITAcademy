package javaapplication308;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    
    public T get(long id);
    
    public List<T> getAll();
    
    public void save(T t);
    
    public void update(T t);
    
    public void delete(T t);
    
}

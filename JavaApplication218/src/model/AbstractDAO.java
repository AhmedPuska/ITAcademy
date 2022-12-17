package model;

import java.sql.SQLException;
import java.util.List;

public abstract class AbstractDAO<E> {
    public abstract void insert(E e) throws SQLException;
    public abstract void update(E e) throws SQLException;
    public abstract E get(int id) throws SQLException;
    public abstract List<E> getList() throws SQLException;
    public abstract void delete(int id) throws SQLException;
    
}
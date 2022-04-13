package db.dao.util;

import java.util.List;
import java.util.Optional;

public abstract class DataAccessObject <T extends DataTransferObject> {

    public abstract Optional<T> findById(int id);
    public abstract List<T> findAll();
    public abstract T update(T dto);
    public abstract T create(T dto);
    public abstract void delete(int id);

}

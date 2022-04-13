package db.dao;

import db.dao.util.DataAccessObject;
import model.Users;

import java.util.List;
import java.util.Optional;

public class UsersDAO extends DataAccessObject<Users> {
    @Override
    public Optional<Users> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Users> findAll() {
        return null;
    }

    @Override
    public Users update(Users dto) {
        return null;
    }

    @Override
    public Users create(Users dto) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}

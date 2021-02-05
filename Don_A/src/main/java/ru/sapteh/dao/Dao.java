package ru.sapteh.dao;

import java.util.List;

public interface Dao<Entity, Key> {
    void creat(Entity entity);
    Entity read(Key key);
    List<Entity> readByAll();
    void update(Entity entity);
    void delete(Entity entity);
}

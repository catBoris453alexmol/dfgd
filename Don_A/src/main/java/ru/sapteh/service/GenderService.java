package ru.sapteh.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ru.sapteh.dao.Dao;
import ru.sapteh.model.GenderEntity;

import java.util.List;


public class GenderService implements Dao<GenderEntity, char> {
    private final SessionFactory factory;

    public GenderService (SessionFactory factory) {
        this.factory = factory;
    }


    @Override
    public void creat(GenderEntity genderEntity) {

    }

    public GenderEntity read(char code) {
        try(Session session = factory.openSession()){
            GenderEntity entity = session.get(GenderEntity.class, code);
            return entity;
        }
    }

    @Override
    public List<GenderEntity> readByAll() {
        return null;
    }

    @Override
    public void update(GenderEntity genderEntity) {

    }

    @Override
    public void delete(GenderEntity genderEntity) {

    }


}

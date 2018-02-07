package com.cleanarch.application.interfaces.persistance;

import java.util.AbstractList;

public interface IRepository<T> {

    Queryable<AbstractList<T>> getAll();

    Queryable<T> get(int id);

    void add(T entity);

    void remove(T entity);
}

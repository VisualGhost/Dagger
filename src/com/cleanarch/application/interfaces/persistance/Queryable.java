package com.cleanarch.application.interfaces.persistance;

public interface Queryable<T> {

    void subscribe(T t);

}

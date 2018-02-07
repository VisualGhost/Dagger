package com.cleanarch.domain.products;

import com.cleanarch.domain.common.IEntity;

import java.math.BigDecimal;

public class Product implements IEntity {

    private String name;
    private int id;
    private BigDecimal price;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

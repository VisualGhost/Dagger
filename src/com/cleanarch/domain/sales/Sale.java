package com.cleanarch.domain.sales;

import com.cleanarch.domain.common.IEntity;
import com.cleanarch.domain.customers.Customer;
import com.cleanarch.domain.employees.Employee;
import com.cleanarch.domain.products.Product;

import java.math.BigDecimal;
import java.util.Date;

public class Sale implements IEntity {

    private int id;
    private int quantity;
    private BigDecimal totalPrice;
    private BigDecimal unitPrice;
    private Customer customer;
    private Date date;
    private Employee employee;
    private Product product;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private void updateTotalPrice() {
        totalPrice = unitPrice.multiply(BigDecimal.valueOf(quantity));
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        updateTotalPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        updateTotalPrice();
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }
}

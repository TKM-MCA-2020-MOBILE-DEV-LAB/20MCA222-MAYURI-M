package com.example.sqllite;

public class customer {
    @Override
    public String toString() {
        return "customer{" +
                "id=" + id +
                ", CustomerName='" + CustomerName + '\'' +
                ", age=" + age +
                ", active=" + active +
                '}';
    }

    public customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public customer(int id, String customerName, int age, boolean active) {
        this.id = id;
        CustomerName = customerName;
        this.age = age;
        this.active = active;
    }

    private int id;
    private String CustomerName;
    private int age;
    private boolean active;
}

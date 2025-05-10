package view;

import javafx.scene.control.ButtonBar;

public class CustomerTm {
    private String id;
    private String name;
    private String address;
    private double salary;
    private ButtonBar bar;

    public CustomerTm() {
    }

    public CustomerTm(String id, String name, String address, double salary, ButtonBar bar) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.bar = bar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ButtonBar getBar() {
        return bar;
    }

    public void setBar(ButtonBar bar) {
        this.bar = bar;
    }
}
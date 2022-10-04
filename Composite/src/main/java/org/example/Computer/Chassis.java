package org.example.Computer;

public class Chassis implements Euipment{

    int price = 10;

    public Chassis(int price) {
        this.price = price;
    }

    public Chassis() {

    }

    @Override
    public int netPrice() {
        return price;
    }
}

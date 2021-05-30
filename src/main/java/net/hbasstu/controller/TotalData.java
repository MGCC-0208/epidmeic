package net.hbasstu.controller;

import lombok.Data;

@Data
public class TotalData {
    String name;
    int value;

    public TotalData(String name, int value) {
        this.name=name;
        this.value=value;

    }
}

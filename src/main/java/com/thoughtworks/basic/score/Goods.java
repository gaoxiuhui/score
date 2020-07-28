package com.thoughtworks.basic.score;

import java.math.BigDecimal;

public class Goods {
    private String name;
    private BigDecimal price;

    public Goods(String name, BigDecimal price){
        this.name = name;
        this.price = price;
    }
    public Goods(BigDecimal price){
        this.price = price;
    }
    public BigDecimal getPrice(){
        return this.price;
    }
}

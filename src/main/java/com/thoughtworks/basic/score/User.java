package com.thoughtworks.basic.score;

public class User {
    public int getScore(Goods goods){
        return goods.getPrice().intValue();
    }
}

package com.thoughtworks.basic.score;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class User {

    private List<Goods> sumGoods;
    public User(List<Goods> sumGoods){
        this.sumGoods = sumGoods;
    }
    public int getSumScore(){
        int sumScores=0;
        for(int index=0;index<sumGoods.size();index++){
            sumScores+=sumGoods.get(index).getScore();
        }
        return sumScores;
    }

}

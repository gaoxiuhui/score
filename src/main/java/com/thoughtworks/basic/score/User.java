package com.thoughtworks.basic.score;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class User {

    private List<Goods> goods;

    public User(List<Goods> goods){
        this.goods = goods;
    }

    public int getScore(){
        int scores=0;
        for(int index=0;index<goods.size();index++){
            if(goods.get(index).isPromotions()){
                scores+=goods.get(index).getPrice().multiply(BigDecimal.valueOf(2)).intValue();
            }else{
                scores+=goods.get(index).getPrice().intValue();
            }
        }
        return scores;
    }

}

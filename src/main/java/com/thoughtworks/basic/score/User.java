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
        BigDecimal sumPrice=BigDecimal.ZERO;
        BigDecimal oriPrice=BigDecimal.ZERO;
        BigDecimal comPrice=BigDecimal.ZERO;
        for(Goods goods:sumGoods ){
            sumPrice=sumPrice.add(goods.getPrice());
        }
        for(int index=0;index<sumGoods.size();index++){
             oriPrice=sumGoods.get(index).getPrice();
            if(index==0){
                 comPrice=BigDecimal.valueOf(1000)
                         .subtract(BigDecimal.ZERO);
            }else{
                comPrice=BigDecimal.valueOf(1000)
                        .subtract(sumGoods.get(index-1).getPrice());
            }
            sumScores+=sumGoods.get(index).getScore(oriPrice,comPrice);
        }
        return sumScores;
    }
}

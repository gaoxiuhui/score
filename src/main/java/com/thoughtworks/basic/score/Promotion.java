package com.thoughtworks.basic.score;

import java.math.BigDecimal;

//特价商品
public class Promotion extends Goods{

    public Promotion(BigDecimal price) {
        super(price);
    }
    public Promotion(String name, BigDecimal price){
        super(name,price);
    }
    @Override
    public int getScore() {
        if(super.getPrice().intValue()>1000){
            return  super.getPrice().setScale( 0, BigDecimal.ROUND_DOWN ).intValue()+2000;
        }else{
            return super.getPrice().setScale( 0, BigDecimal.ROUND_DOWN )
                    .multiply(BigDecimal.valueOf(2)).intValue();
        }
    }
}

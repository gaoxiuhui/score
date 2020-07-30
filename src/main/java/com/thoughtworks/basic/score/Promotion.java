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
    public int getScore(BigDecimal oriPrice,BigDecimal comPrice) {
        if(comPrice.intValue()>0 && oriPrice.intValue()>1000){
            return  oriPrice
                    .subtract(comPrice)
                    .setScale( 0, BigDecimal.ROUND_DOWN ).intValue()
                    +comPrice.intValue() *2;
        }else{
            return oriPrice.setScale( 0, BigDecimal.ROUND_DOWN )
                    .multiply(BigDecimal.valueOf(2)).intValue();
        }
    }
}

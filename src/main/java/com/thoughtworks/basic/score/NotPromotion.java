package com.thoughtworks.basic.score;

import java.math.BigDecimal;

public class NotPromotion extends  Goods{

    public NotPromotion(BigDecimal price){
        super(price);
    }
    public NotPromotion(String name, BigDecimal price){
        super(name,price);
    }
    @Override
    public int getScore(BigDecimal oriPrice,BigDecimal comPrice) {
        if(comPrice.intValue()>0 && oriPrice.intValue()>1000){
            return  oriPrice.subtract(comPrice)
                   .divide(BigDecimal.valueOf(20))
                   .setScale( 0, BigDecimal.ROUND_DOWN )
                   .intValue()+comPrice.intValue();
        }else{
            return oriPrice.setScale( 0, BigDecimal.ROUND_DOWN ) .intValue();
        }
    }
}

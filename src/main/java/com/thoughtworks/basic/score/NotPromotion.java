package com.thoughtworks.basic.score;

import java.math.BigDecimal;

public class NotPromotion extends  Goods{
    private BigDecimal price;
    private String name;

    public NotPromotion(BigDecimal price){
        super(price);
    }
    public NotPromotion(String name, BigDecimal price){
        super(name,price);
    }
    @Override
    public int getScore() {
        if(super.getPrice().intValue()>1000){
            return  super.getPrice().subtract(BigDecimal.valueOf(1000))
                   .divide(BigDecimal.valueOf(20))
                   .setScale( 0, BigDecimal.ROUND_DOWN )
                   .intValue()+1000;
        }else{
            return super.getPrice().setScale( 0, BigDecimal.ROUND_DOWN ) .intValue();
        }
    }
}

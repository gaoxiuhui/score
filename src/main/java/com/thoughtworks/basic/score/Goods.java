package com.thoughtworks.basic.score;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Goods {
    private String name;
    private BigDecimal price;
    private boolean isPromotion;
    private List<String> promotions=getpromotionGoods();
     //获得特价商品
    private List<String> getpromotionGoods(){
        List<String> promotionGoods=new ArrayList<>();
        for (IsPromotion isPromotion:IsPromotion.values()) {
            promotionGoods.add(isPromotion.toString());
        }
        return promotionGoods;
    }
    
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
    public boolean isPromotions(){
         return promotions.contains(name);
    }
}

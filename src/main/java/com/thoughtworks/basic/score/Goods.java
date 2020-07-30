package com.thoughtworks.basic.score;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Goods {
    private String name;
    private BigDecimal price;
    private List<String> promotions=getpromotionGoods();
    //获得目前所有的特价商品
    private List<String> getpromotionGoods(){
        List<String> promotionGoods=new ArrayList<>();
        for (PromotionGoods isPromotion:PromotionGoods.values()) {
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
    public String  getName(){
        return this.name;
    }
    public boolean isPromotions(){
        return promotions.contains(name);
    }
    public abstract int getScore(BigDecimal oriPrice,BigDecimal comPrice);

}

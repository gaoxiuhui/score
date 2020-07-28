package com.thoughtworks.basic.score;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserTest {
    //需求一
    @Test
    public void should_return_100_score_when_get_100_price(){
        //given
        Goods goods=new Goods(BigDecimal.valueOf(100));
        List<Goods> goodsList=new ArrayList<>();
        goodsList.add(goods);
        User tom=new User(goodsList);

        //when
        int scoreResult=tom.getScore();
        //then
        assertEquals(100,scoreResult);
    }
    //需求二
    @Test
    public void should_return_100_score_when_get_apple_10_water_30_laundry_20(){
        //given
        Goods apple=new Goods("苹果",BigDecimal.valueOf(10));
        Goods water=new Goods("西瓜",BigDecimal.valueOf(30));
        Goods laundry=new Goods("洗衣液",BigDecimal.valueOf(20));
        List<Goods> goodsList=new ArrayList<>();
        goodsList.add(apple);
        goodsList.add(water);
        goodsList.add(laundry);
        User tom=new User(goodsList);
        //when
        int scoreResult=tom.getScore();
        //then
        assertEquals(100,scoreResult);
    }
}

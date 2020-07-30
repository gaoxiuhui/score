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
        Goods goods=new NotPromotion(BigDecimal.valueOf(100));
        List<Goods> goodsList=new ArrayList<>();
        goodsList.add(goods);
        User tom=new User(goodsList);
        //when
        int scoreResult=tom.getSumScore();
        //then
        assertEquals(100,scoreResult);
    }
    //需求二
    @Test
    public void should_return_100_score_when_get_apple_10_water_30_laundry_20(){
        //given
        Goods apple=new Promotion("苹果",BigDecimal.valueOf(10));
        Goods water=new Promotion("西瓜",BigDecimal.valueOf(30));
        Goods laundry=new NotPromotion("洗衣液",BigDecimal.valueOf(20));
        List<Goods> goodsList=new ArrayList<>();
        goodsList.add(apple);
        goodsList.add(water);
        goodsList.add(laundry);
        User tom=new User(goodsList);
        //when
        int scoreResult=tom.getSumScore();
        //then
        assertEquals(100,scoreResult);
    }
    //需求三 step1
    @Test
    public void should_return_1067_score_when_get_fridge_2350(){
        //given
        Goods fridge=new NotPromotion("冰箱",BigDecimal.valueOf(2350));
        List<Goods> goodsList=new ArrayList<>();
        goodsList.add(fridge);
        User tom=new User(goodsList);
        //when
        int scoreResult=tom.getSumScore();
        //then
        assertEquals(1067,scoreResult);
    }
    //需求三 step2
    @Test
    public void should_return_3000_score_when_get_TvSet_2000(){
        //given
        Goods tvSet=new Promotion("电视机",BigDecimal.valueOf(2000));
        List<Goods> goodsList=new ArrayList<>();
        goodsList.add(tvSet);
        User tom=new User(goodsList);
        //when
        int scoreResult=tom.getSumScore();
        //then
        assertEquals(3000,scoreResult);
    }
    //需求三 step3
    @Test
    public void should_return_1890_score_when_get_TvSet_800_and_washing_2000(){
        //given
        Goods tvSet=new Promotion("电视机",BigDecimal.valueOf(800));
        Goods washing=new NotPromotion("洗衣机",BigDecimal.valueOf(2000));
        List<Goods> goodsList=new ArrayList<>();
        goodsList.add(tvSet);
        goodsList.add(washing);
        User tom=new User(goodsList);
        //when
        int scoreResult=tom.getSumScore();
        //then
        assertEquals(1890,scoreResult);
    }

}

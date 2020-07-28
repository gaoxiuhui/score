package com.thoughtworks.basic.score;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void should_return_100_score_when_get_100_price(){
        //given
        User tom=new User();
        Goods goods=new Goods(BigDecimal.valueOf(100));
        //when
        int scoreResult=tom.getScore(goods);
        //then
        assertEquals(100,scoreResult);
    }
}

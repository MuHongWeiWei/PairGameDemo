package com.fly.demo;

import java.util.List;

public class Game {
    public void start(){
        List<Card> cards = new Card().getResource();//取得卡片資源
        new PairCard().pair(cards);//配對卡片
    }
}

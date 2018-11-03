package com.fly.demo;

import java.util.List;

public class PairCard {

    public void pair(List<Card> cards) {
        //從所有卡片中取5個
        for (int i = 1; i <= 5; i++) {
            Card card = cards.get(i);//取得每一個卡片資料

            //取得圖片
            String image = card.getCardImage();
            String[] images = image.split("image");//取出image
            String imageBingo = images[1];//得到數字用來判斷
            System.out.println(imageBingo);

            //取得文字
            String text = card.getCardText();
            String[] texts = text.split("text");//取出text
            String textBingo = texts[1];//得到數字用來判斷
            System.out.println(textBingo);

            //判斷是否同圖片與文字
            if (imageBingo.equals(textBingo)) {
                System.out.println(card.getCardImage() + card.getCardText());
                System.out.println("配對成功");
            } else {
                return;
            }
        }
    }
}


配對遊戲的邏輯

目前把圖片與音檔 都設成String類型 

完成此專案 也必須要有一個Frame 可以顯示

  public class Card {
    String cardImage;
    String cardText;
    String music;
    List<Card> cards = new ArrayList<>();

    public Card() {
    }

    public Card(String cardImage, String cardText, String music) {
        this.cardImage = cardImage;
        this.cardText = cardText;
        this.music = music;
    }


    public String getCardImage() {
        return cardImage;
    }

    public void setCardImage(String cardImage) {
        this.cardImage = cardImage;
    }

    public String getCardText() {
        return cardText;
    }

    public void setCardText(String cardText) {
        this.cardText = cardText;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public List<Card> getResource(){
        //加入卡片資料
        cards.add(new Card("image1","text1","music1"));
        cards.add(new Card("image2","text2","music2"));
        cards.add(new Card("image3","text3","music3"));
        cards.add(new Card("image4","text4","music4"));
        cards.add(new Card("image5","text5","music5"));
        cards.add(new Card("image6","text6","music6"));
        cards.add(new Card("image7","text7","music7"));
        cards.add(new Card("image8","text8","music8"));

        //打亂順序
        Collections.shuffle(cards);

        return cards;
    }
}

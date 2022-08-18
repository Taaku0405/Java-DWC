public enum Dessert {
  APPLE(100) {
    @Override
    void advertise() {
      // りんご用のadvertiseの実装
      System.out.println("まっかなりんごが" + getPrice() + "円！"); // getPriceメソッドも活用できる
      Dessert.APPLE.advertise();
    }
  },

  ICE_CREAM(200) {
    @Override
    void advertise() {
      // アイスクリーム用のadvertiseの実装
      System.out.println("夏にぴったりアイスクリームが" + getPrice() + "円！");
      Dessert.ICE_CREAM.advertise();
    }
  },

  CAKE(300) {
    @Override
    void advertise() {
      // ケーキ用のadvertiseの実装
      System.out.println("皆大好き甘いケーキが" + getPrice() + "円！");
      Dessert.CAKE.advertise();
    }
  },
  ;

  private int price;

  private Dessert(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  // 宣伝文句を出力する抽象メソッド。各インスタンスで実装する
  abstract void advertise();
}
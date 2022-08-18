public enum Dessert {
	public static void main(String[] args) {

  // それぞれに値段を指定する
    APPLE(100), ICE_CREAM(200), CAKE(300),;

  // 値段を保持するフィールド
	private int price;
	System.out.println(Dessert.APPLE.getPrice());

	// コンストラクタを追加。引数はint型の値段。
	private Dessert(int price) {
		this.price = price;
	}

	// 値段を取得するメソッドを追加
	public int getPrice() {
		return price;
	}
}}
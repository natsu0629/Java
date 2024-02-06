package example;

public class Name {
	// フィールド宣言
	private String name;
	private double size;
	private int speed;
	
	// 名前を格納するメソッド
	public void setName(String animal_name) {
		this.name = animal_name;
	}
	
	// 名前を取得するメソッド
	public String getName() {
		return this.name;
	}
	
	// 体長を格納するメソッド
	public void setSize(double animal_size) {
		this.size = animal_size;
	}
	
	// 体長を取得するメソッド
	public double getSize() {
		return this.size;
	}

	// 速度を格納するメソッド
	public void setSpeed(int animal_speed) {
		this.speed = animal_speed;
	}
	
	// 速度を取得するメソッド
	public int getSpeed() {
		return this.speed;
	}
	
	
	// メイン処理
	public static void main(String[] args) {
		// Nameインスタンスを生成する
		Name name = new Name();
		
		// 動物名と体長、速度を格納する
		name.setName("ライオン");
		name.setSize(2.1);
		name.setSpeed(80);
		
		
		// 名前、体長、速度を取得
		System.out.println("動物名：" + name.getName());
		System.out.println("体長：" + name.getSize() + "m");
		System.out.println("速度：" + name.getSpeed() + "km/h");
	}
	
}

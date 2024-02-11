package self_introduction2;

public class Person{
	public String name;
	public int age;
	public double height;
	public double weight;
	public static int count = 0; // 問1

	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;  // 問2 コンストラクタ内でcountに1を足す
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public void print(){
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println();
	}
	

	// 問4-5　クラスフィールドcountを用いて合計人数出力するメソッドprintCountの定義
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}

}
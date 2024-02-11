package self_introduction;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name,int age, double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 問6-7　インスタンスメソッドbmiの定義、返り値を指示。
	public double bmi() {
		double bmi = this.weight/(height*height);
		return bmi;
	}
	
	// 問8-9　インスタンスメソッドprintを定義、表示内容を指示する。
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + String.format("%.1f",bmi()) + "です");
		System.out.println();
		
		// 問10？？
	}
}

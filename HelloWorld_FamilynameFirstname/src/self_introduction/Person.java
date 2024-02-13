package self_introduction;

class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	public static int count = 0;
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name,int age, double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
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
		System.out.println("BMIは" + Math.floor(bmi()) + "です");
		System.out.println();
		
	}
		// 問10
		public static void printCount(){
			System.out.println("合計" + count + "人です");
		}
	}

package self_introduction3;

class Person{
	public static int count = 0;
	public String firstName;
	public int age;
	public double height, weight;
	public String lastName;  // 問1　インスタンスフィールドにlastNameを追加

	Person(String firstName, int age, double height, double weight){
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 問2　lastNameの値を引数で受け取るコンストラクタを追加で定義してください
	Person(String firstName,String lastName, int age, double height, double weight){
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
		this.lastName = lastName;
	}

	public String fullName(){
		return this.firstName + this.lastName;
	}

	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
	
	
	// インスタンスメソッド「buy」を定義する（仮引数：car）
	public void buy(Car car) {
		// setOwnerメソッドとthisを用いてownerフィールドの値をセットする。
		car.setOwner(this.fullName());
		// 「〇〇が購入しました」と出力する処理を追加
		System.out.println(this.fullName() + "が購入しました");
	}
	
	// 引数の型が異なるbuyメソッドを定義（仮引数：bicycle）
	public void buy(Bicycle bicycle) {
		// setOwnerメソッドとthisを用いてownerフィールドの値をセットする。
		bicycle.setOwner(this.fullName());
		// 「〇〇が購入しました」と出力する処理を追加
		System.out.println(this.fullName() + "が購入しました");
	}
	
}
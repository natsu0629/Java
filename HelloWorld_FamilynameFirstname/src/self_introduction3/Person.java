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
}
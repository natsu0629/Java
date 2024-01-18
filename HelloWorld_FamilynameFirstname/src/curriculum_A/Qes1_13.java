package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 問題1
		 *【概要】ローカル変数宣言
		 *【詳細】ローカル変数として宣言のみ、実施する。
		 */
		// バイト型
		byte a;
		// 短整数型
		short b;
		// 整数型
		int c;
		// 長整数型
		long d;
		// 単精度浮動小数点数型
		float e;
		// 倍精度浮動小数点数型
		double f;
		// 文字型
		char g;
		// 文字列型
		String h;
		// ブーリアン型
		boolean i;


		/*
		 * 問題2
		 *【概要】ローカル変数の初期化
		 *【詳細】ローカル内でそれぞれの初期値を代入して初期化する。
		 */
		// バイト型
		a = 0;
		// 短整数型
		b = 0;
		// 整数型
		c = 0;
		// 長整数型
		d = 0L;
		// 単精度浮動小数点数型
		e = 0.0f;
		// 倍精度浮動小数点数型
		f = 0.0d;
		// 文字型
		g = '\0';
		// 文字列型
		h = "";
		// ブーリアン型
		i = false;


		/*
		 * 問題3
		 *【概要】変数を代入する
		 */
		// バイト型
		a = 10;
		// 短整数型
		b = 100;
		// 整数型
		c = 1000;
		// 長整数型
		d = 10000;
		// 単精度浮動小数点数型
		e = 9.5f;
		// 倍精度浮動小数点数型
		f = 10.5d;
		// 文字型
		g = 'a';
		// 文字列型
		h = "ハロー";
		// ブーリアン型
		i = true;


		/*
		 * 問題4
		 *【概要】指示通りのータをコンソールに表示する
		 *【詳細】上記で宣言した変数を使用し、コンソールに指示通りのデータを表示する。】
		 */
		// 11110
		System.out.println(a + b + c + d);
		// 20
		System.out.println(2*a);
		// a ハロー true
		System.out.println(g + h + i);
		// 11130
		System.out.println(a + b + c + d + e + f);
		// 10000000000
		System.out.println(a*b*c*d);
		// 0.105
		System.out.println(f/b);
		// -90
		System.out.println(a-b);
		// 改行を入れる！
		System.out.println("");


		/*
		 * 問題5
		 *【概要】指示通りのデータをコンソールに出力する
		 *【詳細】上記で宣言した変数を使用し、コンソールに指示通りのデータを表示する。】
		 */
		// どちらも文字列型に変換してから計算するように修正！
		String num = "20";
		String num1 = "23";
		System.out.println("ハローJAVA"+(num+num1));
		System.out.println("");


		/*
		 * 問題6
		 *【概要】formatの通りコンソールに出力する
		 *【詳細】下記情報をローカル変数に代入し、使用する。
		 *『山田太郎 18歳 170.5cm 62.2kg 寿司』
		 */
		// データを変数に代入する
		String name = "山田太郎";
		int age = 18;
		double height = 170.5d;
		double weight = 62.2d;
		String favoriteFood = "寿司";
		// コンソールに表示する内容を指示する
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"です");
		System.out.println("身長は"+height+"です");
		System.out.println("体重は"+weight+"です");
		System.out.println("好きな食べ物は"+favoriteFood+"です");
		System.out.println("");


		/*
		 * 問題7
		 *【概要】BMIの出力
		 *【詳細】数値を直書きせずにすべて変数を用いてBMIを出力する
		 */
		// 身長をm換算する
		double meter = height*0.01;
		// BMIを計算する
		double bmi = weight/(meter*meter);
		// 計算結果を小数点第一位までに丸める
		System.out.println("BMIは"+String.format("%.1f",bmi)+"です");
		System.out.println("");


		/*
		 * 問題8
		 *【概要】指示通りのデータをコンソールに出力する
		 *【詳細】問題６で宣言した変数に再代入してコンソールに出力する
		 */
		// 再代入の実施
		name = "鈴木一郎";
		age = 24;
		height = 168.5d;
		weight = 64.2d;
		favoriteFood = "オムライス";
		// 身長をm換算する
		meter = height*0.01;
		// BMIを計算する
		bmi = weight/(meter*meter);
		// コンソールに表示する内容を指示する
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"です");
		System.out.println("身長は"+height+"です");
		System.out.println("体重は"+weight+"です");
		System.out.println("好きな食べ物は"+favoriteFood+"です");
		System.out.println("BMIは"+String.format("%.1f",bmi)+"です");
		System.out.println("");


		/*
		 * 問題9
		 *【概要】指示通りのデータをコンソールに出力する
		 *【詳細】問題8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、指示通りコンソールに出力。
		 */
		// 【年齢・身長・体重】を和算で自己代入
		age = age + age;
		height = height + height;
		weight = weight + weight;
		// 身長をm換算する
		meter = height*0.01;
		// BMIを計算する
		bmi = weight/(meter*meter);
		// コンソールに表示する内容を指示する
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"です");
		System.out.println("身長は"+height+"です");
		System.out.println("体重は"+weight+"です");
		System.out.println("好きな食べ物は"+favoriteFood+"です");
		System.out.println("BMIは"+String.format("%.1f",bmi)+"です");
		System.out.println("");
		
		
		/*
		 * 問題10
		 *【概要】数値によりtrueを出力する
		 *【詳細】boolean型を用い、25歳を基準としたtrue,false判定を行う。
		 */
		// boolean型の変数を宣言する
		boolean isOverTeenage; 
		// 問題8の年齢(=24)を基準とする
        int yourAge = 24;
        // 条件式(yourAgeが25歳以上ならtrueが出力されるようにする
        isOverTeenage = (yourAge >= 25);
        System.out.println(isOverTeenage);
        System.out.println("");
        
        
        /*
		 * 問題11
		 *【概要】文字列型に型変換し、つなげて出力する。
		 *【詳細】問題8で使用した【年齢・身長・体重】を文字列型に型変換し繋げる。
		 */
        // 型を変換する！
        age = 24;
        String ageSt = age + "";
        height = 168.5d;
        String heightSt = height + "";
        weight = 64.2d;
        String weightSt = weight + "";
        // コンソールに出力する
        System.out.println(ageSt + heightSt + weightSt);
        System.out.println("");
        
        
        /*
		 * 問題12
		 *【概要】整数型に変換して出力する。
		 *【詳細】問題11で使用した【年齢・身長】を整数型に変換して出力する。
		 */
        // 身長は一度double型に変換し、整数型に再変換する。
		int ageInt = Integer.parseInt(ageSt);
		double heightDb = Double.parseDouble(heightSt);
		int heightInt = (int)heightDb;
		System.out.println(ageInt);
		System.out.println(heightInt);
		System.out.println("");
		
        
        /*
		 * 問題13
		 *【概要】条件一致の場合trueを出力。
		 *【詳細】問題12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力。
		 */
		// boolean型の変数を宣言する
		boolean isOverTeenage1;
		// 問題12で使用した【年齢・身長】を基準に、【年齢が25もしくは身長が160以上】であればtrueを出力する条件式。
		 isOverTeenage1 = (ageInt >= 25 || heightInt >= 160);
	        System.out.println(isOverTeenage1);
	        System.out.println("");
	}

}

package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void Hello(String hello,int a) {
		System.out.println(hello + a);
		System.out.println();
	}
	
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void times(int b) {
		System.out.println(b*b);
		System.out.println();
	}
	
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void indication(int[] array) {
		for(int str : array) {
			System.out.println(str);
		}
		System.out.println();
	}

	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void times(double b,double c) {
		System.out.println(b+c);
		System.out.println();
	}
	

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] randomNumber(int count) {
		// 渡された引数count分の数字を格納できる配列を宣言する
		int[] arr = new int[count];
		// Randomクラスのインスタンスを初期化し、1～100の値をランダムに出力する。
		Random random = new Random();
		// for文を用いて、配列arrにcountの回数分ランダムな数字を格納し、コンソールに出力させる。
		for(int i = 0 ; i < count ; i++) {
			arr[i] = random.nextInt(100) + 1;
			System.out.println(arr[i]);
		}
		System.out.println();
		// 返り値を設定する
		return arr;
		
	}
	

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double average(int[] arr) {
		// 整数intを宣言
		int sum = 0;
		// for文を用いて配列arrの合計値をsumに代入する
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		// sumを配列の個数で割り、aveへ代入する。
		// 小数点が表示されるように型をdoubleにする。
		double ave = (double)sum / arr.length;
		System.out.println(ave);
		System.out.println();
		return ave;
	}
	

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void fifty(double avg) {
		boolean result ;
		if(avg >= 50) {
			result = true;
		}else {
			result = false;
		}
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		// Q1の呼び出し
		Hello("Hello JavaSE ", 11);
		// Q2の呼び出し
		times(10);
		// Q3の呼び出し
		int[] array = {1,2,3,4,5};
		indication(array);
		// Q4の呼び出し
		times(10.2,10.2);
		// Q5の呼び出し
		randomNumber(3);
		// Q6の呼び出し
		int[] arr = randomNumber(3);
		average(arr);
		// Q7の呼び出し
		double avg = average(arr);
		fifty(avg);
	}

}

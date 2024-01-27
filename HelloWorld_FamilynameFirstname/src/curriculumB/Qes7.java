package curriculumB;

import java.util.Scanner;

public class Qes7 {
	//	N人の生徒の成績を管理するプログラムを下記条件で作成してください	
	//	・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください	
	//	・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください	
	//	・このプログラムの実行は必ず1回以上行われるようにしてください	
	//	・出力例を参考にプログラミングを作成してください	
	public static void main(String[] args) {
		// 生徒数の入力を求める
		System.out.println("生徒の人数を入力して下さい（2以上）");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		// 生徒の人数に応じて成績を入力させる(英語、数学、理科、社会)
		// 繰り返し回数を指示するための変数を宣言
		int i = 0;
		// 各教科ごとの点数を入れるための配列を宣言する
		int[] english = new int[number];
		int[] math = new int[number];
		int[] science = new int[number];
		int[] socialStudies = new int[number];
		// 最低一回はプログラムが実行されるようにするため、do...while文を使用
		do {
			System.out.println((i+1) + "人目の『英語』の点数を入力してください：");
			Scanner scEnglish = new Scanner(System.in);
			english[i] = scEnglish.nextInt();

			System.out.println((i+1) + "人目の『数学』の点数を入力してください：");
			Scanner scMath = new Scanner(System.in);
			math[i] = scMath.nextInt();

			System.out.println((i+1) + "人目の『理科』の点数を入力してください：");
			Scanner scScience = new Scanner(System.in);
			science[i] = scScience.nextInt();

			System.out.println((i+1) + "人目の『社会』の点数を入力してください：");
			Scanner scSS = new Scanner(System.in);
			socialStudies[i] = scSS.nextInt();
			
			System.out.println();
			i++;
		}while(number > i);

		// 入力された成績の各平均値を求める
		// 各生徒の平均
		// for文を用いて各生徒の平均点を求める
		for(int j = 0 ; j < number ; j++) {
			double ave = ((float)(english[j]) + (float)(math[j]) + (float)(science[j]) + (float)(socialStudies[j]))/4;
			System.out.println((j+1) + "人目の平均点は" + String.format("%.2f",ave) + "です" );
		}
		
		System.out.println();
		
		// 各科目の合計点数を求める
		int sumEnglish = 0;
		int sumMath = 0;
		int sumScience = 0;
		int sumSS = 0;
		for(int j = 0 ; j < number ; j++) {
			sumEnglish = sumEnglish + english[j];
			sumMath = sumMath + math[j];
			sumScience = sumScience + science[j];
			sumSS = sumSS + socialStudies[j];
		}
		
		// 各科目の平均
		double aveEnglish = (float)(sumEnglish)/number;
		double aveMath =  (float)(sumMath)/number;
		double aveScience =  (float)(sumScience)/number;
		double aveSS =  (float)(sumSS)/number;
		
		System.out.println("英語の平均点は" + String.format("%.2f",aveEnglish) + "点です");
		System.out.println("数学の平均点は" + String.format("%.2f",aveMath) + "点です");
		System.out.println("理科の平均点は" + String.format("%.2f",aveScience) + "点です");
		System.out.println("社会の平均点は" + String.format("%.2f",aveSS) + "点です");
		System.out.println();
		
		// 全体平均
		double ave = (((float)(sumEnglish) + (float)(sumMath) + (float)(sumScience) + (float)(sumSS))/4)/number;
		System.out.println("全体の平均点は" + String.format("%.2f",ave) + "点です");
		
		
		// Scannerを閉じる
		scanner.close();
	}
}


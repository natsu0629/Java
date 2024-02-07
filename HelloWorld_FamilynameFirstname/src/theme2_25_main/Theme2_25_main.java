/*
 課題！！！！！！！

 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	名前は入力値を受け取るだけ！！

	ステータス
	ステータスはランダムな数値をフィールド、コンストラクタで代入していく！！
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

 */


// メイン処理実行用のパッケージ
package theme2_25_main;

import java.util.Scanner;

import theme2_25_sub.Theme2_25_sub;
import theme2_25_sub.Theme2_25_sub.SubClass;

public class Theme2_25_main {

	public static void main(String[] args) {
		Theme2_25_sub theme2_25_sub = new Theme2_25_sub();
		SubClass sub = theme2_25_sub.new SubClass();

		// 名前を受け取るための処理
		Scanner scanner = new Scanner(System.in);
		// String型でnameを定義
		String playerName = scanner.nextLine();
		sub.setName(playerName);
		// Scannerを閉じる
		scanner.close();
		
		// コンソールに出力する内容を記述
		System.out.println("こんにちは 「 " + sub.getName() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP:" + sub.getHp());
		System.out.println("MP:" + sub.getMp());
		System.out.println("攻撃力:" + sub.getAttack());
		System.out.println("素早さ:" + sub.getSpeed());
		System.out.println("防御力:" + sub.getDefense());
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
	}
}
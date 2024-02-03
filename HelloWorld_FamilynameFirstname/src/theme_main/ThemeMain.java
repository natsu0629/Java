/*
	下記がコンソールに出力されるように作成してください

		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です
	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。	
 */
package theme_main;

import theme_sub.Say;

public class ThemeMain{
// ここは処理用のpackage!!
	public static void main(String[] args) {
	    Say say = new Say();
		System.out.println("こんにちは！ここは" + say.return1() + "です");
		System.out.println("この" + say.return2() + "はうまい");
		System.out.println(say.return2() + "は和食です");
		System.out.println("今の現在日時は" + say.return3() + "です");
}
}
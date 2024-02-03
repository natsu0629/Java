/*
	下記がコンソールに出力されるように作成してください

		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です
	【条件】
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。	
 */
package theme_sub;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// ここは処理用のpackage!!
public class Say {
	private String place;
	private String food;
	private LocalDateTime currentDateTime;
	
	public  Say() {
		this.place = "日本";
		this.food = "寿司";
		this.currentDateTime = LocalDateTime.now();
	}
	
	public String return1() {
		return place;
	}
	
	public String return2() {
		return food;
	}
	
	public String return3() {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	        return currentDateTime.format(formatter);
	
	}
}

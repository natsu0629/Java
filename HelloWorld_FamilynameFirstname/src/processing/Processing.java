package processing;

// 現在日時取得のためjava.time.LocalDateTime,java.time.format.DateTimeFormatterをインポート
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Processing {
	// フィールド宣言
	public String place;
	public String food;
	public LocalDateTime date;
	
	
	public void processing1() {
		System.out.println("こんにちは！ここは" + this.place + "です");
	}
	
	public void processing2() {
		System.out.println("この" + this.food + "はうまい");
		System.out.println(this.food + "は和食です");
	}
	
	public void processing3() {
		this.date = LocalDateTime.now();
		DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String fdformat = dtformat.format(date);
		System.out.println("今の現在日時は" + fdformat);
	}
}

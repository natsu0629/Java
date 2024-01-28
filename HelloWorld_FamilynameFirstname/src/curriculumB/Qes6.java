package curriculumB;
import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	//	・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可	
	//	・Switch文内でテレビとディスプレイは続けて書くようにしてください、
	// 条件演算子で出力される値を変更してください	
	//	・テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力してください 	
	//	・例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」※〇〇はランダムで出た数字	
	//	・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません	
	//	・入力された値は「、」区切りで指定してください	
	//	・そのほかの値が入力された場合下記を出力されるようにしてください	
	//		『受け取った値』は指定の商品ではありません
	//	・残り台数は0〜11までのランダムな値が出力されるようにしてください	
	//	商品一覧
	//	パソコン
	//	冷蔵庫
	//	扇風機
	//	洗濯機
	//	加湿器
	//	テレビ
	//	ディスプレイ

	public static void main(String[] args) {
		// 商品一覧を配列に格納する
		//		String[] products = {"パソコン","冷蔵庫","扇風機","洗濯機","加湿器","テレビ","ディスプレイ"};
		// 商品の入力を受け付ける
		System.out.println("商品を入力してください。");
		Scanner scanner = new Scanner(System.in);
		String product = scanner.nextLine();
		// String型の文字列を"、"で区切って受け取る（tokens配列に入力値が入る）
		String[] tokens = product.split("、");


		// 拡張for文を用い、productsに入っている商品と入力されたtokensの商品を比較する。
		for (String token : tokens)
			switch(token) {
			// 入力された商品がパソコンだった場合の処理
			case "パソコン":
				// 入力された商品の残り台数は0~11のランダムな値を出力する
				Random random0 = new Random();
				int stock0 = random0.nextInt(12);
				System.out.println ("パソコンの残り台数は" + stock0 + "台です");
				break;
				// 入力された商品が冷蔵庫だった場合の処理
			case "冷蔵庫":
				Random random1 = new Random();
				int stock1 = random1.nextInt(12);
				System.out.println("冷蔵庫の残り台数は" + stock1 + "台です");
				break;
				// 入力された商品が扇風機だった場合の処理
			case "扇風機":
				Random random2 = new Random();
				int stock2 = random2.nextInt(12);
				System.out.println("扇風機の残り台数は" + stock2 + "台です");
				break;
				// 入力された商品が洗濯機だった場合の処理
			case "洗濯機":
				Random random3 = new Random();
				int stock3 = random3.nextInt(12);
				System.out.println("洗濯機の残り台数は" + stock3 + "台です");
				break;
				// 入力された商品が加湿器だった場合の処理
			case "加湿器":
				Random random4 = new Random();
				int stock4 = random4.nextInt(12);
				System.out.println("加湿器の残り台数は" + stock4 + "台です");
				break;
				// 入力された商品がテレビ、ディスプレイだった場合の処理
			case "テレビ","ディスプレイ":
				Random random5 = new Random();
			    int stock5 = random5.nextInt(12);
			    int displayStock = 11- stock5;
		      	// テレビ＋ディスプレイ＝11になるように設定する
				String str = (token == "テレビ") ? "テレビの残り台数は" + stock5 + "台です":
		        "ディスプレイの残り台数は" + displayStock + "台です";
		     	System.out.println(str);
			    break;
			default:
				// 商品一覧以外の商品が入力された場合、『受け取った値』は指定の商品ではありません、と出力する。
				System.out.println("『受け取った値』は指定の商品ではありません");
				break;
			}
		// Scannerを閉じる
		scanner.close();
	}}

package curriculumB;

// Scacnnerをインポート
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// ユーザー名をコンソールに入力するように指示
		System.out.println("「ユーザー名」");
		Scanner scanner = new Scanner(System.in);
		// String型でnameを定義
		String name = scanner.nextLine();
		// 入力条件をつける
		// nullチェック
		if(name != null) {
			// 半角英数字チェック
			if(isHalfWidthCharacters(name)) {
				// 文字数チェック
				if(name.length() < 11) {
					// すべてクリアした場合の表示内容
					System.out.println("ユーザー名「" + name + "」を登録しました");
				}else {
					System.out.println("「名前を10文字以内にしてください」");
				}}else{
					System.out.println("「半角英数字のみで名前を入力してください」");
				}
			}else{
					System.out.println("「名前を入力してください」");
				}
		scanner.close();
	}

	private static boolean isHalfWidthCharacters(String name) {
		return name.matches("^[\\x00-\\x7F]+$");
	}

}

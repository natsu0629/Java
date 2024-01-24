package curriculumB;
// Randomをインポート
import java.util.Random;
// Scacnnerをインポート
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 【問題1-3】
		// ユーザー名をコンソールに入力するように指示
		System.out.println("「ユーザー名」");
		Scanner scanner = new Scanner(System.in);
		// String型でnameを定義
		String name = scanner.nextLine();

		// 入力チェック
		// nullチェック
		if(name != null) {
			// 半角英数字チェック
			if(isHalfWidthCharacters(name)) {
				// 文字数チェック
				if(name.length() < 11) {
					// すべてクリアした場合の表示内容
					// 結果の変数を用意する
					int result = 0;
					// 繰り返し処理した回数をカウントするための変数を用意する
					int count = 0;
					// do...while構文であいこ、負けのときの繰り返し処理を行う。
					do {
						System.out.println("");
						// 入力されたユーザー名をコンソールに出力する
						System.out.println("ユーザー名「" + name + "」を登録しました");
						// ユーザーのじゃんけんの手を準備
						Random random1 = new Random();
						// 0~2の数字をランダムに出力する
						int userHands = random1.nextInt(3);
						if(userHands == 0){
							String userJanken = "グー";
							System.out.println(name + "の手は「" + userJanken + "」");
						}else if(userHands == 1){
							String userJanken = "チョキ";
							System.out.println(name + "の手は「" + userJanken + "」");
						}else {
							String userJanken = "パー";
							System.out.println(name + "の手は「" + userJanken + "」");
						}

						// PCのじゃんけんの手を準備
						Random random2 = new Random();
						// 0~2の数字をランダムに出力する
						int pcHands = random2.nextInt(3);
						if(pcHands == 0){
							String pcJanken = "グー";
							System.out.println("相手の手は「" + pcJanken + "」");
						}else if(pcHands == 1){
							String pcJanken = "チョキ";
							System.out.println("相手の手は「" + pcJanken + "」");
						}else {
							String pcJanken = "パー";
							System.out.println("相手の手は「" + pcJanken + "」");
						}

						// じゃんけんの結果判定
						result = (userHands - pcHands + 3) % 3;
						// 自分がじゃんけんに勝った場合
						if ((userHands == 0 && pcHands == 1) ||
								(userHands == 1 && pcHands == 2) ||
								(userHands == 2 && pcHands == 0)){
							// 繰り返し回数をカウントする
							count++;
							// 問題に指定されている文を出力する
							System.out.println("");
							System.out.println("やるやん。");
							System.out.println("次は俺にリベンジさせて");
							System.out.println("");
							System.out.println("勝つまでにかかった合計回数は"+ count + "回です");
							// 自分がじゃんけんでグーに負けた場合
						}else if(userHands == 1 && pcHands == 0){
							count++;
							System.out.println("");
							System.out.println("俺の勝ち！");
							System.out.println("負けは次につながるチャンスです！");
							System.out.println( "ネバーギブアップ！");
							System.out.println("");
							// 自分がじゃんけんでチョキに負けた場合
						}else if(userHands == 2 && pcHands == 1) {
							count++;
							System.out.println("");
							System.out.println("俺の勝ち！");
							System.out.println("たかがじゃんけん、そう思ってないですか？");
							System.out.println("それやったら次も、俺が勝ちますよ");
							System.out.println("");
							// 自分がじゃんけんでパーに負けた場合
						}else if(userHands == 0 && pcHands == 2){
							count++;
							System.out.println("");
							System.out.println("俺の勝ち！");
							System.out.println("なんで負けたか、明日まで考えといてください。");
							System.out.println("そしたら何かが見えてくるはずです");
							System.out.println("");
							// あいこの場合
						}else if(result == 0){
							count++;
							System.out.println("");
							System.out.println("DRAW あいこ もう一回しましょう！");
							System.out.println("");
						}
						// あいこ、負けの場合は処理を繰り返す
					}while(result == 0 || result == 1);
				}else {
					System.out.println("「名前を10文字以内にしてください」");
				}}else{
					System.out.println("「半角英数字のみで名前を入力してください」");
				}
		}else{
			System.out.println("「名前を入力してください」");
		}
		// Scannerを閉じる
		scanner.close();
	}
	private static boolean isHalfWidthCharacters(String name) {
		return name.matches("^[\\x00-\\x7F]+$");
	}




}




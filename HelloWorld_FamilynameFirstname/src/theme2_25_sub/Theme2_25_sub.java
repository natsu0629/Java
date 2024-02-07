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

// 処理用のパッケージ
package theme2_25_sub;

import java.util.Random;

public class Theme2_25_sub {
	// 継承元＝SuperClassを宣言する
	public class SuperClass{
		// フィールド宣言
		private String name;
		private int hp;
		private int mp;
		private int attack;
		private int speed;
		private int defense;

		// getter,setterメソッドを宣言する
		// 名前を格納するメソッド
		public void setName(String player_name) {
			this.name = player_name;
		}
		// 名前を取得するメソッド
		public String getName() {
			return this.name;
		}
		
		public int getHp() {
			return hp;
		}
		public void setHp(int hp) {
			this.hp = hp;
		}
		public int getMp() {
			return mp;
		}
		public void setMp(int mp) {
			this.mp = mp;
		}
		public int getAttack() {
			return attack;
		}
		public void setAttack(int attack) {
			this.attack = attack;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public int getDefense() {
			return defense;
		}
		public void setDefense(int defense) {
			this.defense = defense;
		}
	}


	// SuperClassをSubClassに継承する
	public class SubClass extends SuperClass{
		//　コンストラクタを使用する
		public SubClass() {
			Random random = new Random();   // ランダムインスタンスを生成
			this.setHp(random.nextInt(100) + 800);    // hpに800~899をランダムに代入
			this.setMp(random.nextInt(100) + 800);    // mpに800~899をランダムに代入
			this.setAttack(random.nextInt(100) + 300);    // 攻撃力に300~399をランダムに代入
			this.setSpeed(random.nextInt(1000) + 1);    // 素早さに1~1000をランダムに代入
			this.setDefense(random.nextInt(50) + 1);    // 防御力に1~50をランダムに代入
		}
	}


}

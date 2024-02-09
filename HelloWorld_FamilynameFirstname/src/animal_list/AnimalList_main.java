/*

 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50

  	コンソール出力結果

  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ

	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス

	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ

	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス

	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ

	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明


 */
package animal_list;

import java.util.Scanner;

public class AnimalList_main {
	public static void main(String[] args) {
		// ①スキャナーで指示文の入力を受け付ける。
		System.out.println("コンソールに文字を入力してください。");
		Scanner scanner = new Scanner(System.in);
		String animalLists = scanner.nextLine();

		// ②受け取った文を動物ごと(,)に区切って配列に入れる。
		String[] animalList = animalLists.split(",");


		// ③for文を用いて、配列iの中身を：で区切って、さらに配列に入れる。
		for(int i = 0 ; i < animalList.length ; i++) {
			String[] animal = animalList[i].split(":");
			String name = animal[0];
			// ④String型から適切な型に変換する。
			double length = Double.parseDouble(animal[1]);
			int speed = Integer.parseInt(animal[2]);

			// ⑤switch文を用いて、それぞれの動物の学名を指示する。
			String scientific = null;
			switch(name) {
			case "ライオン" -> {
				scientific = "パンテラ レオ";
			}
			case "ゾウ" -> {
				scientific = "ロキソドンタ・サイクロティス";
			}
			case "パンダ" -> {
				scientific = "アイルロポダ・メラノレウカ";
			}
			case "チンパンジー" -> {
				scientific = "パン・トゥログロディテス";
			}
			case "シマウマ" -> {
				scientific = "チャップマンシマウマ";
			}
			case "インコ" -> {
				scientific = "不明";
			}
			}
			// ⑥表示内容を指示する。
			System.out.println("動物名：" + name);
			System.out.println("体長：" + length + "m");
			System.out.println("速度：" + speed + "km/h");
			System.out.println("学名：" + scientific);
			System.out.println();
		}
		// スキャナーを閉じる
		scanner.close();
	}
}

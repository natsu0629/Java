/*

 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"

 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください

   	例:
   	8,5,9,.....
   	と入力された場合（昇順）

   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2

   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2

 */

package prefecture_main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

import prefecture_sub.Prefecture_sub;



public class Prefecture_main {
	public static void main(String[] args) {
		// 都道府県の情報を配列prefecturesに入れる。
		String[] prefectureLists = {"北海道:札幌市:83424","青森県:青森市:9646","岩手県:盛岡市:15275","宮城県:仙台市:7282","秋田県:秋田市:11638","山形県:山形市:9323","福島県:福島市:13784","茨城県:水戸市:6097","栃木県:宇都宮市:6408","群馬県:前橋市:6362","埼玉県:さいたま市:3798"};

		// コンソールに数字の入力を求める
		System.out.println("コンソールに数字を入力してください");
		Scanner scanner = new Scanner(System.in);
		String numbers = scanner.nextLine();
		// 受け取った数字を(,)で区切って配列に入れる。
		String[] number = numbers.split(",");
		// int型配列に変換する。
		int[] num = Stream.of(number).mapToInt(Integer::parseInt).toArray();
		// コンソールに昇順・降順の入力を求める。
		System.out.println("コンソールに昇順・降順を入力してください");
		String order = scanner.nextLine();


		if(order.equals("昇順")) {
			Arrays.sort(num);  //昇順に並び替え
			// numberの数字と都道府県の情報を比較する
			for(int j = 0 ; j < num.length ; j++) {
				// numberに入力された値を用いて、purefectureList配列の都道府県を呼び出す
				String[] prefectureList = prefectureLists[num[j]].split(":"); // :で区切り、purefectureListに格納する
				String prefecture = prefectureList[0];                   // 配列の中身を変数にそれぞれ代入していく
				String prefecturalCapital = prefectureList[1];
				// 型を変換する。
				double area = Double.parseDouble(prefectureList[2]);
				
				// prefecture_subを呼び出す
				Prefecture_sub sub = new Prefecture_sub(prefecture,prefecturalCapital,area);
				System.out.println("都道府県名：" + sub.getPrefecture());
				System.out.println("県庁所在地：" + sub.getprefecturalCapital());
				System.out.println("面積：" + sub.getArea());
				System.out.println();

			}
		}else {
			// 降順に並べ替え
			Integer[] integer = new Integer[num.length];
			for (int i = 0; i < num.length; i++) {
				integer[i] = Integer.valueOf(number[i]);
			}
			Arrays.sort(integer, Collections.reverseOrder());  // 降順に並べ替え
			for(int j = 0 ; j < num.length ; j++) {
			// 降順に並べ替えした値を用いて、purefectureList配列の都道府県を呼び出す
			String[] prefectureList = prefectureLists[integer[j]].split(":"); // :で区切り、purefectureListに格納する
			String prefecture = prefectureList[0];                   // 配列の中身を変数にそれぞれ代入していく
			String prefecturalCapital = prefectureList[1];
			// 型を変換する。
			double area = Double.parseDouble(prefectureList[2]);
			// prefecture_subを呼び出す
			Prefecture_sub sub = new Prefecture_sub(prefecture,prefecturalCapital,area);
			System.out.println("都道府県名：" + sub.getPrefecture());
			System.out.println("県庁所在地：" + sub.getprefecturalCapital());
			System.out.println("面積：" + sub.getArea());
			System.out.println();
			}
		}
		// スキャナーを閉じる
		scanner.close();
	}
}

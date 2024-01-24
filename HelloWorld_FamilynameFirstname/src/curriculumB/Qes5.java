package curriculumB;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 配列numsに1~20までの数値を入れる
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		// for文を用いて順番に計算するように指示する
		for(int j = 0 ; j < 20 ; j++) {
			for(int i = 0 ; i < 20 ; i++) {
				int x = nums[i];
				int y = nums[j];
				// x､yは0を追加し、3桁表示にする。
				System.out.print(String.format("%03d",x) + "*" + String.format("%03d",y) + "=");
				// x*yも0を追加し、3桁表示にする。
				System.out.print(String.format("%03d",x * y) + " || ");
			}
			// 改行を入れる
			System.out.println();
			System.out.println();
		}

	}
}


package curriculumB;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// for文を用いて九九の計算を一覧表示する
		
		// 配列numsに1~9までの数値を入れる
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// 九九の計算をfor文を用いて表示する
		for(int x: nums) {
		    for(int y: nums) {
		    	// x､yは0を追加し、2桁表示にする。
		        System.out.print(String.format("%02d",x) + "*" + String.format("%02d",y) + "=");
		        if(x*y < 10) {
		        	// x*yが10未満の時、0を追加し、2桁表示にする。
		            System.out.print("0");
		        }
		        System.out.print(x * y + " || ");
		    }
		    System.out.println();
		    System.out.println();
		}
	}

}

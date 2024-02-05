package execution;
import processing.Processing;

public class Execution {

	public static void main(String[] args) {
		Processing pr = new Processing();
		pr.place = "日本";
		pr.food = "寿司";
		
		pr.processing1();
		pr.processing2();
		pr.processing3();
	}

}

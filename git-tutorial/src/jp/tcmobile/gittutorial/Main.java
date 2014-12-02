package jp.tcmobile.gittutorial;

public class Main {

	public static void main(String[] args) {
		System.out.println("version 3");
		
		Development dev = new Development();
		dev.print();
		
		Feature1 feature1 = new Feature1();
		feature1.print();
	}

}

package com.human;

public class HUMAN {
	public static String sei;
	public static String mei;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("HelloWorld");
		sei = "baba";
		mei ="hanae";

		System.out.println(sei + mei);

		HumanName humanName = new HumanName();

		System.out.println(humanName.getname());

		String sei1=humanName.sei;
		String mei1=humanName.getmei();

		HumanName humanName2 = new HumanName("tanaka","taro");
		System.out.println(humanName2.getname());

	}

}

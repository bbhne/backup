package com.human;

public class HumanName {
	public String sei;
	private String mei;
	public  HumanName() {

		sei="baba";
		mei="hana";
	}

	public HumanName(String sei,String mei ) {
		this.sei=sei;
		this.mei=mei;
	}

	public String getname() {
		return sei + mei;

	}
	public String getmei() {
		return mei;
	}

}

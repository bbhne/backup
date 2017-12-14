/**
 *
 */

/**
 * @author internousdev
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ




		Person hanako = new Person(0);
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="090-0000-0000";
		hanako.address="hanako16@yahoo.co.jp";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);


		Person jiro = new Person(0);
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="080-0000-0000";
		jiro.address="jiro18@yahoo.co.jp";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);

		Person taro = new Person(0);
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="080-1234-0000";
		taro.address="taro20@yahoo.co.jp";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);

		Person saburo = new Person("saburo");

		System.out.println(saburo.name);
		System.out.println(saburo.age);

		Person non = new Person(25);
		System.out.println(non.name);
		System.out.println(non.age);


		Person no = new Person(27,"iida");
		System.out.println(no.name);
		System.out.println(no.age);

	}

}

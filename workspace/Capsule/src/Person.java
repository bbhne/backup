/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Person {

	/**
	 * @param args
	 */

	public String name = null;
	public int age = 0;


	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public Person (String name,int age){
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

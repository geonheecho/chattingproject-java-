package _11_useful_class.object;

import java.util.Arrays;

//java.lang.Object
//Object : 모든 객체의 조상
/*
 * clone()
 * equals()
 * getClass()
 * hashCode()
 * toString()
 */
class Lion implements Cloneable{
	private String name;
	private int age;
	private int[] dna;

	Lion(){
		System.out.println("사자가 생겨났습니다.");
	}

	//getter//setter
	public String getName() {
		return name;
	}

	public Lion setName(String name) {
		this.name = name;
		return this;
	}

	public int getAge() {
		return age;
	}

	public Lion setAge(int age) {
		this.age = age;
		return this;
	}

	public int[] getDna() {
		return dna;
	}

	public Lion setDna(int[] dna) {
		this.dna = dna;
		return this;
	}

	@Override
	public String toString() {
		return "사자이름 : "+ this.getName()
		+"\n사자나이 : "+this.getAge()
		+"\nDna : "+ Arrays.toString(this.getDna());
	}

	//protected --> public
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Lion deepCopy() throws CloneNotSupportedException {
//		Lion tmp = (Lion)this.clone();
//		int len = tmp.getDna().length;
//		int[] tmpArr = new int[len];
//		for(int i = 0; i<len; i++) {
//			tmpArr[i] = tmp.getDna()[i];
//		}
//		return tmp.setDna(tmpArr);
		//////////////////////////////////////////////////////////////
//		Lion tmp = (Lion)this.clone();
//		int[] origin = tmp.getDna();
//		int[] tmpArr = Arrays.copyOfRange(origin,0,origin.length);
//		return tmp.setDna(tmpArr);
		//////////////////////////////////////////////////////////////
		Lion tmp = (Lion)this.clone();
		int[] origin = tmp.getDna();
		return tmp.setDna(Arrays.copyOfRange(origin,0,origin.length));
		//////////////////////////////////////////////////////////////
	}
}

public class _00_ObjectEx{
	public static void main(String[] args) throws CloneNotSupportedException {
		Object obj;
		Lion a = new Lion();
		a.setName("a").setAge(5).setDna(new int[] {10,20,30}); //디자인 패턴 : Factoring 
		System.out.println(a);
		
		Lion b = (Lion)a.clone(); //깊은 복사
		b.setName("b");
		b.getDna()[0] = 50; //얕은 복사
		System.out.println(b);
		System.out.println(a);
		
		System.out.println("===============");
		Lion c = a.deepCopy().setName("c");
		c.getDna()[0] = 33;
		System.out.println(c);
		System.out.println(a);
	}
}
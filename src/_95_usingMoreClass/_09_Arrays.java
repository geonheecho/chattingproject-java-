package _95_usingMoreClass;

import java.util.Arrays;

public class _09_Arrays {
	public static void ArraysCopyTest() {
		//	배열 복사를 위해 사용할 수 있는 메소드는 copyOf() 와 copyOfRange() 이다. 
		//	다음은 arr1[] 배열의 전체 항목을 복사해서 arr2[] 배열을 생성
		// method copyOf
		char[] arr1 = {'A', 'P', 'P', 'L', 'E'};
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);	
		System.out.println(Arrays.toString(arr2));
		//	copyOfRange() 는 원본 배열의 시작 인덱스에서 끝 인덱스까지 복사한 배열을 리턴함. 
		//	이때 주의사항은 끝 인덱스는 포함하지 않음.
		//method copyOfRange
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 4);	
		System.out.println(Arrays.toString(arr3));

		//method System.arraycopy
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i = 0; i <arr4.length; i++) {
			System.out.print(arr4[i]);
		}
	}

	public static void ArraysEqualTest() {
		//		Arrays의 equals()와 deepEquals()는 항목을 비교함
		//Example
		int[][] origin = {{1, 3},{5, 7}};

		System.out.println("[얕은 복제 후 비교]");
		int[][] clone1 = Arrays.copyOf(origin, origin.length);
		System.out.println("배열 번지 비교: "+origin.equals(clone1));
		System.out.println("1차 배열 항목값 비교: "+Arrays.equals(origin, clone1));
		System.out.println("중첩 배열 항목값 비교: "+Arrays.deepEquals(origin, clone1));

		System.out.println("[깊은 복제 후 비교]");
		int[][] clone2 = Arrays.copyOf(origin, origin.length);
		clone2[0] = Arrays.copyOf(origin[0], origin[0].length);
		clone2[1] = Arrays.copyOf(origin[1], origin[1].length);
		System.out.println("배열 번지 비교: "+origin.equals(clone2));
		System.out.println("1차 배열 항목값 비교: "+Arrays.equals(origin, clone2));
		System.out.println("중첩 배열 항목값 비교: "+Arrays.deepEquals(origin, clone2));		
	}

	public static void ArraysSortTest() {
		//	기본 타입 또는 String 배열은 Arrays.sort() 메소드의 파라미터로 지정해주면 자동으로 오름차순 정렬이 됨.
		//	사용자 정의 클래스 타입이면 Comparable 인터페이스를 구현한 클래스가 있으면 됨. 
		//	Member 배열에서 Member 객체들을 name 필드값으로 정렬하고 싶다면 다음과 같이 Member 클래스를 작성하면 됨.
		class Member implements Comparable<Member>{
			String name;

			public  Member(String name) {
				this.name = name;	
			}
			@Override
			public int compareTo(Member o) {
				return name.compareTo(o.name);
			}
			//Comparator<Member> 는 Member 타입만 비교하기 위해 Generic <>을 사용하였고,
			//compareTo() 메소드는 비교값을 리턴하도록 오버라이딩했습니다. 
			//compareTo() 메소드의 리턴값은 오름차순 일 때 자신이 파라미터보다 낮을 경우 음수, 
			//같을 경우 0, 높을 경우 양수를 리턴하면 됨.
			// 내림차순일 때는 자신이 파라미터보다 낮을 경우 양수, 같을 경우 0, 높을 경우 음수를 리턴하면 됨.
		}	//inner class
	
		//배열 항목을 정렬하는 방법
		int[] scores = {100, 95, 90};
		Arrays.sort(scores);
		
		for(int score : scores) {
			System.out.println(score);
		}
		
		Member m1 = new Member("Apple");
		Member m2 = new Member("iOS10");
		Member m3 = new Member("Good Lock");
		Member m4 = new Member("S7");
		Member m5 = new Member("Samsung");
		
		Member[] members = {m1, m2, m3, m4, m5};
		System.out.println("[정렬 전 멤버 이름 출력]");
		for(Member mem : members) {
			System.out.println(mem.name);
		}
		
		Arrays.sort(members);
		System.out.println("\n[정렬 후 멤버 이름 출력]");
		for(Member mem : members) {
			System.out.println(mem.name);
		}
	}

	public static void main(String[] args) {
		ArraysCopyTest();
		System.out.println("\n-------------------");
		ArraysEqualTest();
		System.out.println("-------------------");
		ArraysSortTest();
	}
}

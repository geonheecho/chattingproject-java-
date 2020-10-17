package _93_smallProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class Lotto {

	String defaultName = "우리반명단.txt"; //기본 파일
	String filename = ""; //사용자 위치 지정 파일
	int size = 0; //사람 수
	String[] names = null;
	BufferedReader keyboard = null;
	boolean isTerminated = false;

	Lotto(){
		try {
			this.keyboard = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("파일경로 입력(없으면 그냥 Enter키) : ");
			setFilename((this.keyboard.readLine()).trim());
			getSize();
			getNames();
		}catch(IOException e) {
			System.out.println(e);
			System.out.println("파일을 불러오는데 실패했습니다.");
			this.isTerminated = true;
		}
	}
	
	/**
	 * 읽어올 파일 경로를 설정해 준다.
	 */
	void setFilename(String filename) {
		if(filename.equals("") || filename == null) {
			this.filename = defaultName;
		}else {
			this.filename = filename;
		}
	}
	
	/**
	 * 우리반 명단의 갯수에 맞는 배열 크기 설정한다.
	 */
	void getSize() throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader(filename)); //파일 읽어오기
		int count = 0; //배열 크기
		while(readFile.readLine()!=null) {
			count++;
		}
		if(readFile != null) { 
			readFile.close(); 
		}
		this.size = count;
	}

	/**
	 * 우리반 명단의 모든 사람을 담은 배열을 설정한다.
	 */
	void getNames() throws IOException {
		String[] names = new String[size];
		BufferedReader readFile = new BufferedReader(new FileReader(filename)); //파일 읽어오기
		int index = 0;
		String name = null;
		while((name = readFile.readLine())!=null) {
			names[index] = name;
			index++;
		}
		if(readFile != null) { 
			readFile.close(); 
		}
		this.names = names;
	}

	/**
	 * 당첨자를 출력한다.
	 */
	void peekNames(int peekCount){
		Random rand = new Random();
		int[] rands = new int[peekCount]; //당첨자 고르기
		
		//당첨자가 겹치지 않게 랜덤하게 당첨자를 고르기 위한 연산
		for(int i = 0; i < peekCount; i++) {
			rands[i] =rand.nextInt(size);
			if(i != 0) {
				for(int j = 0; j < i; j++) {
					if(rands[j] == rands[i]) {
						i--;
						break;
					}
				}//for j
			}//if
		}//for i
		
		//당첨자 출력
		for(int i = 0; i < rands.length; i++) {
			System.out.println(names[rands[i]]);
		}
	}
	
	/**
	 * 프로그램 실행 메서드
	 */
	void mainService() {
		while(!isTerminated) {
			try {
				System.out.println("당첨할 사람 수를 입력하세요(0 입력시 종료) : ");
				int peekCount = Integer.parseInt(keyboard.readLine());
				if(peekCount < 0 || peekCount > this.size) {
					System.out.println("0 이상 " + this.size + " 이하를 입력해주세요");
					continue;
				}
				if(peekCount == 0) {
					keyboard.close();
					break;
				}
				peekNames(peekCount);
			}catch(Exception e) {
				System.out.println("숫자를 입력해주세요~");
			}
		}
	}

	public static void main(String[] args){
		new Lotto().mainService();
		System.out.println("프로그램 종료");
	}
}
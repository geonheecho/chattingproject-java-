package _93_lottoProject.repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class DB {
	private ArrayList<Student> listOfStudent = new ArrayList<Student>();
	private String defaultFileName = "우리반명단.txt";
	private String inputFileName = "";
	private static boolean isCreatedOnce = false;
	private static DB database = null;
	private BufferedReader readFile;
	
	private DB(String inputFileName){
		this.inputFileName = inputFileName;
		try {
			setFileName();
			saveNamesAndRates();
			System.out.println("["+this.inputFileName+"] 파일 경로 설정 완료");
		}catch(FileNotFoundException fn) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
			System.out.println("프로그램을 시작 할 수 없습니다. 파일을 다시 확인해 주세요.");
			System.exit(0);
		}catch(IOException io) {
			System.out.println(io);
		}catch(NumberFormatException nf) {
			System.out.println("해당 파일에 설정된 데이터 중 확률이 숫자가 아닌 데이터가 있습니다.");
			System.out.println("프로그램을 시작 할 수 없습니다. 파일을 다시 확인해 주세요.");
			System.exit(0);
		}
	}
	
	//singleton 패턴
	public static DB createDB(String inputFileName) {
		if(!isCreatedOnce) {
			System.out.println("새로운 DB를 설정했습니다.");
			database = new DB(inputFileName);
			isCreatedOnce = true;
			return database;
		}else{
			System.out.println("이미 DB를 설정했습니다.");
			return database;
		}
	}

	private void setFileName() throws FileNotFoundException {
		if(inputFileName.equals("") || inputFileName == null) {
			inputFileName = defaultFileName;
			readFile = new BufferedReader(new FileReader(inputFileName));
		}else {
			readFile = new BufferedReader(new FileReader(inputFileName));
		}
	}

	private void saveNamesAndRates() throws IOException, NumberFormatException{
		String tmp = null;
		String name = null;
		int idx = 0;
		String rateStr = null;
		while((tmp=readFile.readLine())!=null) {
			tmp = tmp.trim();
			idx = tmp.indexOf(" ");
			float rate = 0.0f;
			if(idx != -1) {
				name = tmp.substring(0, idx);
				rateStr = tmp.substring(idx);	
				rate = Integer.parseInt(rateStr.trim());
			}
				else if(idx == -1) {
				name = tmp.substring(0);
			}
			if(rate < 0) rate = 0.0f;
			else if(rate > 100) {
				System.out.println("확률이 100을 넘긴 데이터가 있습니다. 파일을 다시 확인해 주세요.");
				System.exit(0); //프로그램 종료
			}else {
				listOfStudent.add(new Student(name, rate));
			}
		}

		if(readFile != null) {
			readFile.close();
		}
	}

	public ArrayList<Student> getListOfStudent() {
		return listOfStudent;
	}
}

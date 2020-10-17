package _91_quizProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.TreeSet;

public class Repository {
	Page view = new Page();
	String defaultFileName = "datas.txt"; //기본 설정 파일
	String inputFileName = ""; //입력 파일
	private TreeSet<String> questionSet = new TreeSet<String>();
	private ArrayList<String> questionList = new ArrayList<String>();
	FileReader fr;
	BufferedReader br;
	FileWriter fw;
	PrintWriter pw;

	Repository(String inputFileName){
		try {
			this.inputFileName = inputFileName;
			setFileName();
			view.completeSetFilePage(this.inputFileName);
			saveQuestions();
		} catch (FileNotFoundException e) {
			view.showFileNotFoundMsg();
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void setFileName() throws FileNotFoundException {
		if(inputFileName.equals("") || inputFileName == null){ //아무것도 입력 안할시 기본 설정 파일을 입력 파일로 설정
			inputFileName = defaultFileName;
			br = new BufferedReader(new FileReader(inputFileName));
		}else {
			br = new BufferedReader(new FileReader(inputFileName));
		}
	}
	
	void saveQuestions() throws IOException {
		String line = "";
		while((line=br.readLine()) != null) {
			if(line != null) line = line.trim(); //line이 null이 아닐때 양옆의 공백을 지워주고 line 초기화
			if(line.length() != 0)questionSet.add(line); //line이 갖고 있는 데이터 문자열의 길이가 0이 아닐때 line을 tSet에 추가(+중복제거)
		}
		for(String item: questionSet) questionList.add(item); // !!! 굳이 ArrayList에 담는 이유를 모르겠음.
//		confirmList;
	}

	
	//getter&Setter
	public String getInputFileName() {
		return inputFileName;
	}

	public void setInputFileName(String inputFileName) {
		this.inputFileName = inputFileName;
	}

	public TreeSet<String> getQuestionSet() {
		return questionSet;
	}
	public void setQuestionSet(TreeSet<String> questionSet) {
		this.questionSet = questionSet;
	}
	
	
	
	/*int calTotalDatas() { // !!! 굳이 totalDatas를 구하는 로직을 짜는 이유 이해못하겠음.
		int totalDatas = 0;
		for(String item : questionList) totalDatas++;
		System.out.println("총 문제 갯수 : "+totalDatas);
		return totalDatas;
	}
	*/
}	

package _91_quizQuickStart;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class Repository {
	Page view = new Page();
	private String defaultFileName = "datas.txt"; //기본 설정 파일
	private String inputFileName = ""; //입력 파일
	private TreeSet<String> questionSet = new TreeSet<String>();
	private ArrayList<String> questionList = new ArrayList<String>();

	FileReader fr;
	BufferedReader br;

	Repository(){
		try {
			this.inputFileName = readFileName();
			checkFileName();
			view.completeSetFilePage(this.inputFileName);
			saveQuestions();
		} catch (FileNotFoundException e) {
			view.showFileNotFoundMsg(this.inputFileName);
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	String readFileName() {
		view.showSetFilePage(defaultFileName);
		String inputFileName = new Input().inputString();
		return inputFileName; 
	}
	
	
	void checkFileName() throws FileNotFoundException {
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
		for(String item: questionSet) questionList.add(item); 
	}

	
	//getter&Setter
	public String getInputFileName() {
		return inputFileName;
	}

	public void setInputFileName(String inputFileName) {
		this.inputFileName = inputFileName;
	}

	public ArrayList<String> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(ArrayList<String> questionList) {
		this.questionList = questionList;
	}
	
	public TreeSet<String> getQuestionSet() {
		return questionSet;
	}
}	

package _93_lottoProject.service;

import java.util.ArrayList;
import java.util.Random;

import _93_lottoProject.repository.DB;
import _93_lottoProject.repository.Student;

public class ServiceMenu3Util {
	int numberOfStudentHasRate = 0;
	static final float MAX_RATE = 100.0f;
	Random r = new Random();
	float totalRate = 0.0f;
	ServiceMenu2Util sm2u;
	int counts;


	ServiceMenu3Util(){
	}

	ServiceMenu3Util(DB db){
		this.sm2u = new ServiceMenu2Util();
	}

	void checkNotOverMAX_RATE(ArrayList<Student> listOfStudent) {
		System.out.println(listOfStudent); 
		for(int i=0; i<listOfStudent.size(); i++) {
			totalRate += listOfStudent.get(i).rate;
			if(listOfStudent.get(i).rate != 0) numberOfStudentHasRate++;
		}
		if(totalRate > MAX_RATE) { //총 확률값이 100을 넘을때
			System.out.println("<!!!WrongTotalRate!!!> 이 서비스은 해당 파일의 총 확률값이 100이 넘는 데이터를 설정 할 수 없습니다.");			
			System.out.println("프로그램을 진행 할 수 없습니다. 파일을 다시 확인해 주세요.");
			System.out.println("프로그램이 강제 종료됩니다.");
			System.exit(0); //프로그램 종료
		}
	}//checkNotOverMAX_RATE()

	ArrayList<String> getFullResult(ArrayList<Student> listOfStudent) {
		int counts = sm2u.getPickingCountsByClient(listOfStudent);
		ArrayList<String> result = new ArrayList<String>();
		float extraRate = 100.0f;
		float avgExtraRate = 100.0f;

		if(totalRate < MAX_RATE) { //총 확률값이 100을 못 넘을때 
			extraRate = MAX_RATE - totalRate;
			try {
				avgExtraRate = extraRate/(float)(listOfStudent.size()-numberOfStudentHasRate);
			}catch(ArithmeticException ae) {
				avgExtraRate = extraRate/(float)listOfStudent.size();
			}
			for(int i=0; i<listOfStudent.size(); i++) {
				if(listOfStudent.get(i).rate == 0) {
					listOfStudent.get(i).rate=(int)(avgExtraRate*100)/100.00f; //!!!
				}
			}
			result = getUnreaptedResult(listOfStudent, counts);
		}else {
			result = getUnreaptedResult(listOfStudent, counts);
		}
		return result;
	}

	ArrayList<String> getUnreaptedResult(ArrayList<Student> listOfStudent, int counts) {
		ArrayList<String> result = new ArrayList<String>();
		for(int i=0; i<counts; i++) {
			if(i!=0) {
				result.add(getProbabilityAppliedResult(listOfStudent, counts));		
				for(int j=0; j<i; j++) {
					if(result.get(i)==result.get(j)) {
						result.remove(i);
						i--;
						break;
					}
				}
			}else if(i == 0){
				result.add(getProbabilityAppliedResult(listOfStudent, counts));		
			}
		}
		return result;
	}

	String getProbabilityAppliedResult(ArrayList<Student> listOfStudent, int counts) {
		String returnResult = null;
		boolean isResult = false;
		float hundred = 0.0f;
		int k = 1;
		while(!isResult) {
			float maxRate = 100.0f;
			for(int i = 0; i<listOfStudent.size(); i++) {
				if(maxRate>0.0f) {
					hundred = (int)(r.nextInt((int)(maxRate*100.00f+100.0f))/100.00f);
					if(hundred>0 && hundred<=listOfStudent.get(i).rate) {
						returnResult = listOfStudent.get(i).name;
						System.out.println(k++ +" <check>당첨자 : "+returnResult+" 확률 : "+listOfStudent.get(i).rate);
						isResult = true;
						break;
					}else {
						maxRate = maxRate - listOfStudent.get(i).rate;
						if(i==listOfStudent.size()-1) break; //for문 파괴
						continue;
					}
				}else break;
			}//for
		}//while
		return returnResult;
	}
}//class


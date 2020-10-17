package _93_lottoProject.service;

import java.util.ArrayList;
import java.util.Random;

import _93_lottoProject.repository.DB;


public class Service{
	DB db;
	Random random = new Random();
	ServiceMenu2Util sm2u = new ServiceMenu2Util();
	int randNum;
 	ServiceMenu3Util sm3u;
 	
	public Service(DB db){
		this.db = db;
	}
	
	public Service() {
	}

	public void serviceMenu1() {
		randNum = random.nextInt(db.getListOfStudent().size());
		System.out.println(" ★ 당첨자 : "+db.getListOfStudent().get(randNum).name);
	}

	public void serviceMenu2() {
		int counts = sm2u.getPickingCountsByClient(db.getListOfStudent());
		int[] result = sm2u.makeRandomIndexOfArray(counts, db.getListOfStudent().size());
		for(int i=0; i<result.length; i++) {
			System.out.println(" ★ 당첨자 : "+db.getListOfStudent().get(result[i]).name);
		
		}
	}

	public void serviceMenu3() {
		this.sm3u = new ServiceMenu3Util(db);
		sm3u.checkNotOverMAX_RATE(db.getListOfStudent());
		ArrayList<String> result = sm3u.getFullResult(db.getListOfStudent());
		for(int i=0; i<result.size(); i++) {
			System.out.println(" ★ 당첨자 : "+result.get(i));
		}
	}



} // class

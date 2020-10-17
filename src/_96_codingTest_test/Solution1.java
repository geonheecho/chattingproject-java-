package _96_codingTest_test;

import java.util.regex.Pattern;

public class Solution1 {
    public String solution(String new_id) {
        String answer = "";
        answer = replaceId(new_id);
        return answer;
    }
    
    public String replaceId(String new_id){
        //1단계
        new_id = new_id.toLowerCase();
        //2단계
        String postString = "";
        for(int i=0; i<new_id.length(); i++){
            char letter = new_id.charAt(i);
            if(checkLetter(String.valueOf(letter))==true || letter=='-' || letter=='.' || letter=='_')
                postString += letter;
        }
        //3단계, 4단계, 5단계
        postString = replaceFullStop(postString);
        //6, 7단계
		int length = postString.length();
		if(length > 15) {
			postString = postString.substring(0, 15);
			if(postString.substring(postString.length()-1).equals(".")) {
				postString = postString.substring(0, postString.length()-1);
			}
		} else if(length <= 2) {
			String repeatString = postString.substring(length-1, length);
			while(true) {
				if(postString.length() > 2) break;
				postString += repeatString;
			}
		}
        return postString;
    }
    
    public String replaceFullStop(String postString){
        String replaceString = "";
        char prevLetter = 0;
        for(int i=0; i<postString.length(); i++){
			if(postString.charAt(i) == '.') {
				if(postString.charAt(i) == prevLetter) {
					prevLetter = postString.charAt(i);
					continue;
				} else {
					prevLetter = postString.charAt(i);
					replaceString += postString.charAt(i);
				}
			} else {
				prevLetter = postString.charAt(i);
				replaceString += postString.charAt(i);
			}
        }
        if(replaceString.equals(".")){
            replaceString = "a";
        } else {
            if(replaceString.substring(0, 1).equals(".")) 
                replaceString = replaceString.substring(1, replaceString.length());
            if(replaceString.substring(replaceString.length()-1).equals(".")) 
                replaceString = replaceString.substring(0, replaceString.length()-1);    
        }
        return replaceString;
    }
    
    public boolean checkLetter(String letter){
//    	int check = letter.charAt(0);
//    	if(check > 47 && check < 58) return true;
//    	if(check > 96 && check <123) return true;
 //       return false;
    	return Pattern.matches("^[0-9a-zA-Z]*$", letter);
    }
    public static void main(String[] args) {
		Solution1 solution = new Solution1();
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String answer = solution.solution(new_id);
		System.out.println("answer : "+answer);
	}
}

/*
 no	new_id	result
예1	"...!@BaT#*..y.abcdefghijklm"	"bat.y.abcdefghi"
예2	"z-+.^."	"z--"
예3	"=.="	"aaa"
예4	"123_.def"	"123_.def"
예5	"abcdefghijklmn.p"	"abcdefghijklmn"
 */

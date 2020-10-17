package _96_codingTest_4_search_lyrics;

public class Solution {
	 public int[] solution(String[] words, String[] queries) {
	        int[] answer = {};
	        Tri[] root = new Tri[10001];
	        for(int i = 0; i < words.length; i++) {
	            int length = words[i].length();
	            if(root[length] == null) {
	                root[length] = new Tri();
	            }
	            root[length].add(words[i]);
	        }

	        answer = new int[queries.length];
	        for(int i = 0; i < queries.length; i++) {
	            int len = queries[i].length();
	            if(root[len] == null) answer[i] = 0;
	            else answer[i] = root[queries[i].length()].find(queries[i]);
	        }
	        return answer;
	    }

	    class Tri {
	        int cnt;
	        Tri[] frontNext;
	        Tri[] backNext;

	        Tri() {
	            this.cnt = 0;
	            frontNext = new Tri[26];
	            backNext = new Tri[26];
	        }

	        public void add(String s) {
	            this.cnt++;
	            addFront(s);
	            addBack(s);
	        }

	        private void addFront(String s) {
	            Tri cur = this;
	            for(char ch : s.toCharArray()) {
	                if(cur.frontNext[ch-'a'] == null) {
	                    cur.frontNext[ch-'a'] = new Tri();
	                    cur.frontNext[ch-'a'].cnt = 1;
	                }
	                else {
	                    cur.frontNext[ch-'a'].cnt++;
	                }
	                cur = cur.frontNext[ch-'a'];
	            }
	        }

	        private void addBack(String s) {
	            Tri cur = this;
	            for(int i = s.length()-1; i >= 0; i--) {
	                char ch = s.charAt(i);
	                if(cur.backNext[ch-'a'] == null) {
	                    cur.backNext[ch-'a'] = new Tri();
	                    cur.backNext[ch-'a'].cnt = 1;
	                }
	                else {
	                    cur.backNext[ch-'a'].cnt++;
	                }
	                cur = cur.backNext[ch-'a'];
	            }
	        }

	        public int find(String s) {
	            if(s.startsWith("?")) {
	                return findBack(s);
	            }
	            else {
	                return findFront(s);
	            }
	        }

	        private int findFront(String s) {    
	            Tri t = this;           
	            for(int i = 0; i < s.length(); i++) {
	                char ch = s.charAt(i);
	                if(ch == '?') return t.cnt;
	                if(t.frontNext[ch-'a'] == null) return 0;
	                t = t.frontNext[ch-'a'];                
	            }
	            return 0;
	        }

	        private int findBack(String s) {   
	            Tri t = this;
	            for(int i = s.length()-1; i >= 0; i--) {
	                char ch = s.charAt(i);
	                if(ch == '?') return t.cnt;
	                if(t.backNext[ch-'a'] == null) return 0;
	                t = t.backNext[ch-'a'];             
	            }
	            return 0;
	        }
	    }
	    
	    public static void main(String[] args) {
			String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
			String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};
			Solution solution = new Solution();
			int[] answer = solution.solution(words, queries);
			for(int i : answer) {
				System.out.println("#> answer : "+i);
			}
		}
}

/*
문제 설명
[본 문제는 정확성과 효율성 테스트 각각 점수가 있는 문제입니다.]

친구들로부터 천재 프로그래머로 불리는 프로도는 음악을 하는 친구로부터 자신이 좋아하는 노래 가사에 사용된 단어들 중에 특정 키워드가 몇 개 포함되어 있는지 궁금하니 프로그램으로 개발해 달라는 제안을 받았습니다.
그 제안 사항 중, 키워드는 와일드카드 문자중 하나인 '?'가 포함된 패턴 형태의 문자열을 뜻합니다. 와일드카드 문자인 '?'는 글자 하나를 의미하며, 어떤 문자에도 매치된다고 가정합니다. 예를 들어 "fro??"는 "frodo", "front", "frost" 등에 매치되지만 "frame", "frozen"에는 매치되지 않습니다.

가사에 사용된 모든 단어들이 담긴 배열 words와 찾고자 하는 키워드가 담긴 배열 queries가 주어질 때, 각 키워드 별로 매치된 단어가 몇 개인지 순서대로 배열에 담아 반환하도록 solution 함수를 완성해 주세요.

가사 단어 제한사항
words의 길이(가사 단어의 개수)는 2 이상 100,000 이하입니다.
각 가사 단어의 길이는 1 이상 10,000 이하로 빈 문자열인 경우는 없습니다.
전체 가사 단어 길이의 합은 2 이상 1,000,000 이하입니다.
가사에 동일 단어가 여러 번 나올 경우 중복을 제거하고 words에는 하나로만 제공됩니다.
각 가사 단어는 오직 알파벳 소문자로만 구성되어 있으며, 특수문자나 숫자는 포함하지 않는 것으로 가정합니다.
검색 키워드 제한사항
 - queries의 길이(검색 키워드 개수)는 2 이상 100,000 이하입니다.
 - 각 검색 키워드의 길이는 1 이상 10,000 이하로 빈 문자열인 경우는 없습니다.
 - 전체 검색 키워드 길이의 합은 2 이상 1,000,000 이하입니다.
 - 검색 키워드는 중복될 수도 있습니다.
 - 각 검색 키워드는 오직 알파벳 소문자와 와일드카드 문자인 '?' 로만 구성되어 있으며, 특수문자나 숫자는 포함하지 않는 것으로 가정합니다.
 - 검색 키워드는 와일드카드 문자인 '?'가 하나 이상 포함돼 있으며, '?'는 각 검색 키워드의 접두사 아니면 접미사 중 하나로만 주어집니다.
	> 예를 들어 "??odo", "fro??", "?????"는 가능한 키워드입니다.
	> 반면에 "frodo"('?'가 없음), "fr?do"('?'가 중간에 있음), "?ro??"('?'가 양쪽에 있음)는 불가능한 키워드입니다.

입출력 예에 대한 설명
 - "fro??"는 "frodo", "front", "frost"에 매치되므로 3입니다.
 - "????o"는 "frodo", "kakao"에 매치되므로 2입니다.
 - "fr???"는 "frodo", "front", "frost", "frame"에 매치되므로 4입니다.
 - "fro???"는 "frozen"에 매치되므로 1입니다.
 - "pro?"는 매치되는 가사 단어가 없으므로 0 입니다.
 */

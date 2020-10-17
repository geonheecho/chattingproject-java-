package _92_ExMVC.DBMS;

public class PostingSchema {
	private String posterName; //게시자
	private String content; //내용
	
	public String getPosterName() {
		return posterName;
	}
	public PostingSchema setPosterName(String posterName) {
		this.posterName = posterName;
		return this;
	}
	public String getContent() {
		return content;
	}
	public PostingSchema setContent(String content) {
		this.content = content;
		return this;
	}
	
	
}

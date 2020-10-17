package m3;

public class M3a {
	private String className = "M3a";
	
	public void publicMethod() {
		System.out.println(className + " publicMethod()");
	}
	
	protected void protectedMethod() {
		System.out.println(className + " protectedMethod");
	}
	
	void defaultMethod() {
		System.out.println(className + " defaultMethod");		
	}

	private void privateMethod() {
		System.out.println(className + " privateMethod");
	}
}

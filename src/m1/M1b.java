package m1;

public class M1b {
	private String className = "M1b";
	
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

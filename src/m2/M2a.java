package m2;

public class M2a {
	
	private String className = "M2a";
	
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

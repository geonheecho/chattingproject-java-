package _93_lottoProject.repository;

public class Student {
	public String name;
	public float rate = 0;
	
	Student(String name){
		this.name = name;
	}
	
	Student(String name, float rate){
		this.name = name;
		this.rate = rate;
	}
	public String toString(){
		if(rate==0) {
			return name;
		}else {
		return name+rate;
		}
	}
	
	//Vector<Studnet> v = new Vector<Student>();
}

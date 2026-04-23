package Hospital_Management_System;

public class patient {
	String name;
	String Medi_his;
	int age;
	int PID;
	
	void setter(String n,String M,int a,int pid)
	{
		if(a>0 && a<150) {
			name=n;
			Medi_his=M;
			age=a;
			PID=pid;
		}
	}
	
	String getn() {
		return name;
	}
	int geta() {
		return age;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}

}

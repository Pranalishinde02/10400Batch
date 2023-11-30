package Opps;

public class Employee1Main {

	public static void main(String[] args) {
		Student s1=new Student(0, null, 0, 0, 0, 0, 0);
		//s1.sId=1001;
		//s1.sName="nikitha";
		//s1.m1=78;
		//s1.m2=90;
		//s1.m3=67;
		//s1.m4=88;
		//s1.m5=66;
		
		System.out.println(s1);
		System.out.println("===============================");
		Student s2=new Student(0, null, 0, 0, 0, 0, 0);
		s2.setsId(1002);
		s2.setsName("vaishnavi");
		s2.setM1(98);
		s2.setM2(96);
		s2.setM3(69);
		s2.setM4(58);
		s2.setM5(86);
		System.out.println(s2);
		

	}

}

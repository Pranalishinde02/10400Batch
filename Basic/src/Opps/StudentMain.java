package Opps;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"Pranali",90,80,70,75,87);
        //s1.sId=1001;
        //s1.sName="Pranali";
        //s1.m1=78;
        //s1.m2=90;
        //s1.m3=67;
        //s1.m4=88;
        //s1.m5=66;
        System.out.println("The Student id=:"+s1.getsId());
        System.out.println("The Student Name=:"+s1.getsName());
        System.out.println("The Student mark1=:"+s1.getM1());
        System.out.println("The Student mark2=:"+s1.getM2());
        System.out.println("The Student mark3=:"+s1.getM3());
        System.out.println("The Student mark4=:"+s1.getM4());
        System.out.println("The Student mark5=:"+s1.getM5());
        s1.percentage();
        
        
        System.out.println("===============================");
        
        Student s2=new Student(2,"Neha",80,86,78,98,76);
        //s2.sId=1002;
        //s2.sName="vaishnavi";
        //s2.m1=98;
        //s2.m2=96;
        //s2.m3=69;
        //s2.m4=58;
        //s2.m5=86;
        System.out.println("The Student id=:"+s2.getsId());
        System.out.println("The Student Name=:"+s2.getsName());
        System.out.println("The Student mark1=:"+s2.getM1());
        System.out.println("The Student mark2=:"+s2.getM2());
        System.out.println("The Student mark3=:"+s2.getM3());
        System.out.println("The Student mark4=:"+s2.getM4());
        System.out.println("The Student mark5=:"+s2.getM5());
        s2.percentage();
        

	}

}

package Section6_Plus;
import java.util.*;

class Person{
	private String name;
	private int age;
	void setAge(int newAge) {
		 
			age=newAge;
		
	}
	int getAge() {
		return age;
	}
	void setName(String newName) {
		name=newName;
	}
	String getName() {
		return name;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("������������");
		String name=reader.nextLine();
		System.out.print("���������䣺");
		int age=reader.nextInt();
		while(age<=0 || age>=50) {
			System.out.println("�������");
			System.out.print("�������������䣺");
			age=reader.nextInt();
		}
		Person t1=new Person();
		t1.setName(name);
		t1.setAge(age);
		System.out.print("������"+t1.getName()+" ����:"+t1.getAge());
	}
}

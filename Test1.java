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
		System.out.print("请输入姓名：");
		String name=reader.nextLine();
		System.out.print("请输入年龄：");
		int age=reader.nextInt();
		while(age<=0 || age>=50) {
			System.out.println("输入错误！");
			System.out.print("请重新输入年龄：");
			age=reader.nextInt();
		}
		Person t1=new Person();
		t1.setName(name);
		t1.setAge(age);
		System.out.print("姓名："+t1.getName()+" 年龄:"+t1.getAge());
	}
}

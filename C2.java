class PersonB{
	String name;
	int age;
 public PersonB(){
	System.out.println("PersonB()������");
}
 public PersonB(String newName){
	name=newName;
	System.out.println("PersonB(String newName)������");
}
 public void introduce(){
	System.out.println("����"+name+"������"+age+"��");
}
}

class StudentB extends PersonB{
 public StudentB(){
	System.out.println("StudentB()������");
}
 public StudentB(String newName,int newAge){
	super(newName);
	age=newAge;
}
}

class C2{
 public static void main(String[] args){
	StudentB s1=new StudentB();
	StudentB s2=new StudentB("����",19);
	s2.introduce();
}
}
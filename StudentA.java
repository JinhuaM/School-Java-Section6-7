public class StudentA{
	String strName;
 public static void main(String[] args){
	StudentA a=new StudentA();
	a.setName("����");
	StudentA b=a;
	b.setName("����");
	StudentA c=new StudentA();
	c.setName("����");
	System.out.println("a��������"+a.getName());
	System.out.println("b��������"+b.getName());
	System.out.println("c��������"+c.getName());
	if(a==b)
	System.out.println("a��b���");
	else
	System.out.println("a��b�����");
	if(a==c)
	System.out.println("a��c���");
	else
	System.out.println("a��c�����");
}
 public void setName(String name){
	strName=name;
}
 public String getName(){
	return strName;
}
}
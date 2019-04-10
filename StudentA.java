public class StudentA{
	String strName;
 public static void main(String[] args){
	StudentA a=new StudentA();
	a.setName("张三");
	StudentA b=a;
	b.setName("李四");
	StudentA c=new StudentA();
	c.setName("王五");
	System.out.println("a的名字是"+a.getName());
	System.out.println("b的名字是"+b.getName());
	System.out.println("c的名字是"+c.getName());
	if(a==b)
	System.out.println("a和b相等");
	else
	System.out.println("a和b不相等");
	if(a==c)
	System.out.println("a和c相等");
	else
	System.out.println("a和c不相等");
}
 public void setName(String name){
	strName=name;
}
 public String getName(){
	return strName;
}
}
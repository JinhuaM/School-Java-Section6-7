class Animal{
	void play(){
	System.out.println("���Ƕ���һ�ܶ౾��");
}
}

class Bird extends Animal{
	void play(){
	System.out.println("����С�����ܷ���");
}
}

class Fish extends Animal{
	void play(){
	System.out.println("����С�㣬������Ӿ");
}
}

class Overriding{
 public static void main(String[] args){
	Animal s1=new Animal();
	Bird s2=new Bird ();
	Fish s3=new Fish ();
	s1.play();
	s2.play();
	s3.play();
}
}
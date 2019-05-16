package Section6_Plus;

public class Test3 {
	public static void num(int a[]) {
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
	public static void main(String[] args) {
		int[] a=new int[10];
		for(int i=0;i<10;i++) {
			a[i]=(int)(Math.random()*100);
			System.out.println("a["+i+"]="+a[i]);
		}
		num(a);
	}
}

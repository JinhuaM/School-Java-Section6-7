package Section6_Plus;
import java.util.*;

class Person {
	private String name;
	private double score;
	int num;
	double max,min,total,ave;
	
	Person(double arr[]){}
	
	void maxScore(double SArray[]) {
		max=SArray[0];
		for(int i=0;i<SArray.length;i++) {
			if(SArray[i]>max)
			max=SArray[i];
	}
  }
	void minScore(double SArray[]) {
		min=SArray[0];
		for(int i=0;i<SArray.length;i++) {
			if(SArray[i]<min)
				min=SArray[i];
		}
	}
	void totalScore(double SArray[]) {
		for(int i=0;i<SArray.length;i++) {
			total+=SArray[i];
		}
	}
	void aveScore(double SArray[]) {
		ave=total/SArray.length;
	}
	double getMax() {
		return max;
	}
	double getMin() {
		return min;
	}
	double getTotal() {
		return total;
	}
	double getAve() {
		return ave;
	}
}

public class Test2{
	public static void main(String[] args) {
		String name;
		double score;

		@SuppressWarnings("resource")
		Scanner n=new Scanner(System.in);
		String[] nameArr=new String[4];
		double[] scoreArr=new double[4];
		for(int i=0;i<4;i++) {
			System.out.print("�������"+(i+1)+"��ѧ����������");
			nameArr[i]=n.next();
			System.out.print("�������"+(i+1)+"��ѧ���ĳɼ���");
			scoreArr[i]=n.nextDouble();
		}
		Person s=new Person(scoreArr);
		s.maxScore(scoreArr);
		s.minScore(scoreArr);
		s.totalScore(scoreArr);
		s.aveScore(scoreArr);
		System.out.println("��߷�"+s.getMax());
		System.out.println("��ͷ�"+s.getMin());
		System.out.println("�ܷ�"+s.getTotal());
		System.out.println("ƽ����"+s.getAve());
	}
}
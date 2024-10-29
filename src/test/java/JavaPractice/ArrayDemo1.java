package JavaPractice;

public class ArrayDemo1 {
//how to print elements in array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a=new int[100];
		for(int i=0;i<100;i++)
		{
			a[i]=i;
			System.out.println(a[i]);
		}
//i=0,0<100
		//a[0]=0
		//i++=1
		//i=1;1<100 a[1]=1
		//1++=2
		//.....a[99]=99
	}

}

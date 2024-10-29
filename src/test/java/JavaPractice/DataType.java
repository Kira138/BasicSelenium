package JavaPractice;

import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte");
                    }
                 long y=sc.nextLong();  
                 System.out.println(y+" can be fitted in:");
                if(y>=-32768 && y<=32767){
                    System.out.println("* short\n* int\n* long");
                    }
                    long z=sc.nextLong();  
                 System.out.println(z+" can be fitted in:");
                if(z>=-2147483648 && z<=2147483647){
                    System.out.println("* int\n* long");
                    }
                    long a=sc.nextLong();  
                 System.out.println(a+" can be fitted in:");
                if(a>=-9223372036854775808L && a<=9223372036854775807L){
                    System.out.println("* long");
                    }
                
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}




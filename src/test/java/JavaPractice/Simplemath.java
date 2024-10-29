package JavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simplemath {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        if(N>=2&&N<=20) 
        {
        for(int i=0;i<=10;i++)
        {
        	 int result=N*i;
        	 System.out.println(N + " x " + i + " = " + result);
        }
       
        }
    
	else {
        System.out.println("Number is out of range. Please enter a number between 2 and 20.");
        }
    

	}

}

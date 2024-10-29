package JavaPractice;

import java.util.*;
import java.io.*;

	public class Equation {
	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int result=a;
	            for(int j=0;j<=n-1;j++)
	            {
	                 result=result+(int)Math.pow(2,j)*b;
	                 System.out.print(result+" ");
	                
	            }
	            System.out.println();
	        }
	        in.close();
	    }
	}

//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

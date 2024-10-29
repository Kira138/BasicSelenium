package StringsPractice;

public class Example3 {
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int length = s.length();
        for(int i=0;i<length;i++)
        {
        
        	 String result=	s.subSequence(i, i)
        }
        
        //System.out.println(result);
        return smallest + "\n" + largest;
        
	}
        public static void main(String[] args) {
        	  String s = "welcometojava";
        	  int k=3;
              //System.out.println("Combinations of the string: " + s);
              getSmallestAndLargest(s, k);
        	
        }
}


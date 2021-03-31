package basic;
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
    	int  i, temp, rem,j=0;;
        int sum = 0;
        int [] answer=new int[10];
    	  for(i=min+1;i<=max;i++)
    	   {
    	      temp=i;

    	      while(temp !=0)
    	      {
    	           rem=temp %10;
    	           sum +=rem*rem*rem;
    	           temp /=10;
    	       }
    	      if(sum ==i)
    	        {
    	           answer[j]=i;
    	          // System.out.println(answer[j]);
    	           j++;
    	        }

    	        sum=0;

    	    }
    	return answer;
    }
}

public class Assignment1Q2 {
    public static void main (String [] args) {

       int min = 100;int max = 999;
       ArmstrongNumBetweenRange a=new ArmstrongNumBetweenRange();
       int[] result=a.armstrongNumbersInRange(min, max);
       for(int i=0;i<result.length;i++)
       {
    	   if(result[i]!=0)
    	   {
    		   System.out.println(result[i]);
    	   }

       }

    }
}

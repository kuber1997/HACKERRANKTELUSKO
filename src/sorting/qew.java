package sorting;

import java.util.*;

public class qew {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Integer> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        while(n>0)
        {
        int option=sc.nextInt();
        if(option==1)
        {
            int pushh=sc.nextInt();
            s.push(pushh);
        }
        if(option==2)
        {
            s.pop();
        }
        
        if(option==3)
        {   
        	
        	
        	Iterator<Integer> itr=s.iterator();
        Integer a[]=new Integer[99];
            while(itr.hasNext()){
            for(int i=0;i<10;i++)
            {
                a[i]=itr.next();
            }
        }
        int max = Collections.max(Arrays.asList(a)); 
        System.out.println(max);



        }
        n--;
        }

    }
}
package sorting;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
    	int A=x,B=y,C=z;
    	if(C>B && C>A)
    	{
    		if(A>B){
    			String result="Cat A";
    			return result;
    		}
    		
    		if(B>A)
    		{
    			String result="Cat B";
    			return result;
    		}
    	}
    	if(B>C && A<C){
    		String result="Mouse C";
			return result;
    	}
    	if(A>C && B<C){
    		String result="Mouse C";
			return result;
    	}
    	
		return null;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

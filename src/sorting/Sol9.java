package sorting;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
		int arr[]=new int[grades.size()];
    	for(int i=0;i<arr.length;i++){
    	 arr[i]=(int) grades.get(i);
    	}
    	ArrayList<Integer> result=new ArrayList<>(grades.size());
    	Iterator<Integer> itr=result.iterator();
    	while(itr.hasNext()){
    		System.out.println(itr.next());
    	}
    	
    	int roundoff;
    	
    	for(int j=0;j<arr.length;j++){
    		roundoff=0;
    		roundoff=arr[j]+(5-(arr[j] % 5));
    		if(arr[j]<38){
    			result.add(arr[j]);
    		if(roundoff-arr[j]<3){
    			result.add(roundoff);
    			result.get(index)
    		}
    		if(roundoff-arr[j]==3){
    			result.add(arr[j]);
    		}
    		
    		}
    		
    	}
    	
    	
    	 
    	return result;
			
    	
    
		
		
        

    }

}

public class Sol9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

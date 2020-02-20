package sorting;

public class Sol6 {

	public static void main(String[] args) {
		String s="abcdefghi-jklmnopqrstuvwxyz";
		String result="";
		int k=10;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!='-'){
				
				
				int j=s.charAt(i);
				if(j==121){
					j=97;
				}
				else if(j==122){
					j=98;
				}
				else{
					j=j+k;
				}
				char r=(char) j;
				result=result+r;
				
			}
			else{
			result=result+s.charAt(i);
			}
		}
	
		System.out.println(result);

	}

}

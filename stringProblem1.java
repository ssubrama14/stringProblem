package stringProblem;

public class stringProblem1 {
	
	public String replaceChar(String mystring,Character myChar){
		String finalString = "";
		if ((mystring != null) && (myChar != null)){
		    for (int i =0; i<mystring.length();i++){
			    if (mystring.charAt(i) == (myChar)){
				    continue;
			    }else{
				    finalString = finalString + mystring.charAt(i);
			    }
		    }
		}else{
			finalString = "String to be tested or character cannot be null";
		}
		return finalString;
	}
	
	public String deleteChar(String myStr,Character myChar){
		Character myemptycharacter = '\0';
		if (myStr != null && myChar != null){
		    myStr = myStr.replace(myChar,myemptycharacter);
		}else{
			return "String or character to be removed cannot be null";
		}
		return myStr;
	}
	
	public static void main(String[] args){
		stringProblem1 myStringProblem1Obj = new stringProblem1();
		System.out.println(myStringProblem1Obj.replaceChar("ABCDEFGHIJKLMNOPQRSTUVWXYX",'X'));
		System.out.println(myStringProblem1Obj.deleteChar("abcdefghijklmnopqrstuvxxyzx",'x'));
		
	}

}

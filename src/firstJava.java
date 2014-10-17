//package myFirst;

public class firstJava {
	
	
	public static void MatchPattern(){
		
		StringBuilder sb = new StringBuilder();
		String ss="Hi";
		sb.append("this");
		sb.append(" is");
		sb.append(" : " + ss);
		sb.trimToSize();
		
		System.out.println(sb);
		
		System.out.println("==================\n=============== Change done for viewing ========\n==================");
		String S1 = "23456";
		String S2 = "555544T5his";
		String S3 = "$";
		String matchNumber = "\\d+";
		String tmp = "UNKjjd/djhh";
		if(tmp.matches("(UNK)(.)*")){
			System.out.println("UNK matched");
		}
		if(S1.matches(matchNumber)){
			System.out.println("Matched");
		}
		if(S2.matches("\\w+")){
			System.out.println("\\w+ matches one or more small/Capital alaphabets");
		}
		if(S3.matches("[^\\w+]")){
			System.out.println("^\\w matches a non-word character - even W works - [\\W]");
		}
		S3="bca";
		if(S3.matches("[abc]+")){
			System.out.println("[abc] matches a, b or c but not abc until + sign is added");
		}
		S3="$# %55";
		if(S3.matches("[^a-z][^A-Z]+")){
			System.out.println("[^a-z][^A-Z]+ Matches everything but characters a-z or A-Z");
		}
		S3 = "3A8";
		if(S3.matches("^[\\d][\\w].*")){
			System.out.println("It matches string starting with digit, thne character and then anything");
		}
		S3="this$44441";
		if(S3.matches(".*[\\d]+")){
			System.out.println("Matches anything ending with digit");
		}
		
		//Replace using regular expressions - STR.replace
		S3 = "For this string, we replace white space and comma by # ";
		S3=S3.replaceAll("we", "rrr");
		System.out.println("After Replacement: " + S3);
			
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		MatchPattern();
	}

}

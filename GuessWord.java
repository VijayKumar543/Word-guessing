/**
	NAME : D.VIJAY KUMAR
	REGD.NO : 19981A0543
*/
import java.util.*;
//import java.lang.*;
class GuessWord {
	final String[] words={"vijay","college","academics","raghu","cse","department"};
	public String getRandom() {
		Random r=new Random();
		int i=r.nextInt(words.length);
		return words[i];
	}
	public String checkWord(String s,String c,char t) {
		int flag=0;
		for(int i=0;i<(s.length());i++) {
			if(s.charAt(i)==t) {
				flag=1;
				c=c.substring(0,i)+t+c.substring(i+1);
			}
		}
		if (flag==0) {
			System.out.println("sorry,no such character "+t);
		}
		return c;
	}
	public static void main(String[] args) {
		GuessWord g=new GuessWord();
		String s=g.getRandom();
		int n=s.length();
		System.out.println("Hi, Guess the following "+n+" characters word");
		String c="";
		for(int i=0;i<n;i++) {
			c+="_";
		}
		Scanner in=new Scanner(System.in);
		while(true) {
			System.out.print(c+" Guess the characters : ");
			char t=in.next().charAt(0);
			t=Character.toLowerCase(t);
			c=g.checkWord(s,c,t);
			if(s.equals(c)){
				System.out.println(c+" Congrats! you won!!!");
				break;
			}
		}
	}
}
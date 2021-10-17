package week3.day1.assignments;

public class Replacecharacter {
	
public void check()
{
String sentence = "I am working with Java8";
char[] charArray = sentence.toCharArray();

String replace = sentence.replace("k","g");

System.out.println(sentence);
System.out.println(replace);

}


public static void main(String[] args) {
	Replacecharacter repl=new Replacecharacter();
	repl.check();

}

}

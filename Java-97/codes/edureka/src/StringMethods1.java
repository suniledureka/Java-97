
public class StringMethods1 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		//String s2 = new String("Java");
		String s2 = new String("java");
		
		System.out.println("s1==s2 ---> " + (s1==s2));
		System.out.println("s1.equals(s2) ---> " + (s1.equals(s2)));
		System.out.println("s1.contentEquals(s2) ---> " + (s1.contentEquals(s2)));
		System.out.println("s1.equalsIgnoreCase(s2) ---> " + s1.equalsIgnoreCase(s2));
		
		String str = "edureka limited bangalore india";
		String[] words = str.split(" ");
		System.out.println("no of words = " + words.length);
		String str1 = String.join("", words);
		System.out.println(str1);
		
		System.out.println(str.replaceAll(" ",""));
	}
}

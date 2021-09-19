public class stringreverse{
	private static String sen;
    	public static void main(String[] args) {
		reverseSentence();
    	}
    	private static void reverseSentence(){
        		sen = "hello world";
		for (int i = sen.length(); i > 0; i--){
			System.out.print(sen.charAt(i-1));
		}
    }
}
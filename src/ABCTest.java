public class ABCTest {
    public static void main(String[] args) {

        System.out.println(abcTest("123abc"));
        System.out.println(abcTest("123.abc"));
        System.out.println(abcTest("abc.123"));

        System.out.println(alternateStrings("abc", "xyz"));
        System.out.println(alternateStrings("Hi", "There"));
        System.out.println(alternateStrings("xxxx", "Thereee"));
        System.out.println(alternateStrings("Thereee", "xxxx"));
    }

    public static String alternateStrings(String firstWord, String secondWord) {
        String newString = "";
        int size = 0;

        if(firstWord.length()> secondWord.length()){
            size = firstWord.length();
        }else{
            size = secondWord.length();
        }

        for (int i = 0; i < size; i++) {
            if(i<firstWord.length()) newString += firstWord.substring(i,i+1);
            if(i<secondWord.length())newString += secondWord.substring(i,i+1);
        }

        return newString;
    }

    public static boolean abcTest(String word) {

        for (int i = 0; i < word.length()-2; i++) {
            if(word.substring(i,i+3).equals("abc")){
                if(i==0 || !word.substring(i-1,i).equals(".")){
                    return true;
                }
            }
        }

        return false;
    }
}

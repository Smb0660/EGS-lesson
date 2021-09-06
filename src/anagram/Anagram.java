package anagram;

public class Anagram {
    public void checkAnagram(String one , String two){
        if (one.length() != two.length()){
            System.out.print("Strings are not anagram");
            System.exit(0);
        }
         char[] oneArray = one.toCharArray();
         char[] twoArray = two.toCharArray();
         int count = 0;
        for (int i = 0; i < one.length(); i++) {
            for (int j = 0; j < two.length(); j++) {
                if (oneArray[i] == twoArray[j]) {
                    count++;
                }
            }
        }
            if (count == oneArray.length){
                System.out.println("Strings are Anagram");
            } else System.err.println("Strings are not Anagram");

    }
}

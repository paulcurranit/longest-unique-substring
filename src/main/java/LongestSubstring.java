import java.util.HashSet;

public class LongestSubstring {

    public static int execute(String aString) {
        int longestSubstringLength = 0;

        int length = aString.length();
        int index = 0;
        int currentStringLength = 0;
        HashSet subStringCharacterSet = new HashSet();

        while(index < length) {
            char c = aString.charAt(index);
            if(subStringCharacterSet.contains(c)) {
                if(currentStringLength > longestSubstringLength) {
                    longestSubstringLength = currentStringLength;
                }
                subStringCharacterSet.clear();
                currentStringLength = 0;
            }
            if(currentStringLength > longestSubstringLength) {
                longestSubstringLength = currentStringLength;
            }
            subStringCharacterSet.add(c);
            currentStringLength++;
            index++;
        }


        return longestSubstringLength;
    }
}

import java.util.HashSet;

public class LongestSubstring {

    public static int execute(String aString) {
        int longestSubstringLength = 0;

        int length = aString.length();
        int index = 0;
        int currentStringLength = 0;
        HashSet<Character> subStringCharacterSet = new HashSet<>();

        while(index < length) {
            char c = aString.charAt(index);
            if(subStringCharacterSet.contains(c)) {
                longestSubstringLength = currentStringLength > longestSubstringLength ? currentStringLength : longestSubstringLength;
                subStringCharacterSet.clear();
                currentStringLength = 0;
            }

            subStringCharacterSet.add(c);
            currentStringLength++;
            index++;
        }

        if(currentStringLength > longestSubstringLength) {
            longestSubstringLength = currentStringLength;
        }

        return longestSubstringLength;
    }
}

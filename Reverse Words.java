class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) { 
                reversed.append(words[i]).append(" ");
            }
        }
        reversed.delete(reversed.length()-1,reversed.length());
        return reversed.toString();
    }
}

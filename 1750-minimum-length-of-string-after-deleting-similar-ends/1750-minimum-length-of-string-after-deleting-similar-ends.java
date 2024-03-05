public class Solution {
    public int minimumLength(String s) {
        int begin = 0;
        int end = s.length() - 1;
        
        while (begin < end && s.charAt(begin) == s.charAt(end)) {
            char c = s.charAt(begin);

            // onden sil
            while (begin <= end && s.charAt(begin) == c) {
                begin++;
            }

            // arkadan sil
            while (end > begin && s.charAt(end) == c) {
                end--;
            }
        }

        // kalan kısmı ver
        return end - begin + 1;
    }
}
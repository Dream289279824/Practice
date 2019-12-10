public class FindRepeatingCharacters {

    public static void main(String[] args) {
        String str = "asdfghjklqwerty";
        char c = findRepeatingCharacters(str);
        System.out.println(c);
    }

    private static char findRepeatingCharacters(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++){
            for (int j = i + 1; j < chars.length; j++){
                if (chars[i] == chars[j]){
                    return chars[i];
                }
            }
        }
        return '无';
    }

}

public class ConsonantCount {
    public static void main(String[] args) {
        String s = "Information";
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if("aeiou".indexOf(ch) == -1 && Character.isLetter(ch)) {
                // ch is not a vowel and is a letter, so it is a consonant
                count++;
            }
        }
        System.out.println("Consonants: " + count);
    }
}

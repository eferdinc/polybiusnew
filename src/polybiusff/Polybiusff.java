package polybiusff;

public class Polybiusff {

    private static final char[][] alphabethMatix = {
        {'0', '0', '0', '0', '0'},
        {'0', 'a', 'b', 'c', 'd', 'e'},
        {'0', 'f', 'g', 'h', 'j', 'k'},
        {'0', 'l', 'm', 'n', 'o', 'p'},
        {'0', 'r', 's', 't', 'u', 'v'},
        {'0', 'y', 'x', 'z', '0', '0'}
    };

    public static void main(String[] args) {
        System.out.println(encrpypt("naber"));
        System.out.println(decrypt(152115));
        ;
    }

    public static String encrpypt(String sentence) {
        String encryptedSentence = new String();
        for (char word : sentence.toCharArray()) {
            encryptedSentence += findValue(word);
        }
        return encryptedSentence;
    }

    public static String decrypt(Integer number) {
        String encrpyptedSentence = number.toString();
        String decryptedSentence = "";

        for (int i = 0; i <= encrpyptedSentence.length(); i += 2) {
            if (i != 0 && i % 2 == 0) {

                decryptedSentence += alphabethMatix[Integer.valueOf(String.valueOf(encrpyptedSentence.charAt(i - 2)))][Integer.valueOf(String.valueOf(encrpyptedSentence.charAt(i - 1)))];
            }
        }
        return decryptedSentence;
    }

    public static String findValue(char word) {
        for (int i = 1; i < alphabethMatix.length; i++) {
            for (int j = 1; j < alphabethMatix[i].length; j++) {
                if (alphabethMatix[i][j] == word) {
                    return "" + i + "" + j;
                }
            }
        }
        return null;
    }
}
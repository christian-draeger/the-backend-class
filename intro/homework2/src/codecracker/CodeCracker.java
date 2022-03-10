package codecracker;

public class CodeCracker {
    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char[] decryptionKey = {'!', ')', 'r', '(', '£', '*', '%', '&', '>',
            '<', '@', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o'};
    public static void main(String[] args) {

    }

     int findIndex(char[] arr, int t) {
        if (arr == null) {
            return -1;
        }

        int len = arr.length;
        int i = 0;

        while (i < len) {
            if (arr[i] == t) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

     public String encrypt(String message) {
        String encryptedMessage = "";

        for (int i = 0; i < message.length(); i++) {

            int position = findIndex(alphabet, message.charAt(i));
            encryptedMessage = encryptedMessage + decryptionKey[position];
        }
        return encryptedMessage;
    }

    public String decrypt(String message) {
        String decryptedMessage = "";

        for (int i = 0; i < message.length(); i++) {

            int position = findIndex(decryptionKey, message.charAt(i));
            decryptedMessage = decryptedMessage + alphabet[position];
        }
        return decryptedMessage;
    }

}

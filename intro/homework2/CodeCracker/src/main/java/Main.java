public class Main {
    final static String key= "! ) \" ( £ * % & > < @ a b c d e f g h i j k l m n o";
    public static void main(String[] args) {
        String message = "hello world";
        AES aes = new AES(key);
//        Encryption
        String hiddenMessage = aes.encrypt(message);
        System.out.println("Hidden Message: "+hiddenMessage);
//        Decryption
        String descryptedMessage = aes.dencrypt(hiddenMessage);
        System.out.println("Descrypted Message: "+descryptedMessage);

    }
}

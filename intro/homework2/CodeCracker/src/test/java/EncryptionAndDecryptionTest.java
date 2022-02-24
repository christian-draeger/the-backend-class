import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EncryptionAndDecryptionTest {
    final static String key= "! ) \" ( £ * % & > < @ a b c d e f g h i j k l m n o";

    @Test
    void encryptMessage() {
        AES aes = new AES(key);
        String message = "Hello world";
        String result = aes.encrypt(message);
        Assertions.assertEquals(result,"tV1tBInlQN80k6uX6ZMaTQ==");
    }

    @Test
    void dencryptMessage() {
        AES aes = new AES(key);
        String encryptedMessage = "C1mPJ0crnSaRQjSNPCZQUQ==";
        String result = aes.dencrypt(encryptedMessage);
        Assertions.assertEquals(result,"hello world");
    }
}
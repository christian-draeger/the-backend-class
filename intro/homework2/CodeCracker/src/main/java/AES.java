import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

public class AES {
    private SecretKeySpec secretKey;
    private byte[] key;
    public AES(String secret){
        MessageDigest sha = null;
        try{
            key = secret.getBytes(StandardCharsets.UTF_8);
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key,16);
            secretKey = new SecretKeySpec(key, "AES");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public String encrypt(String message){

        try{
            Cipher cipher =Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE,secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(message.getBytes()));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public String dencrypt(String message){

        try{
            Cipher cipher =Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE,secretKey);
            return  new String(cipher.doFinal(Base64.getDecoder().decode(message)));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

}

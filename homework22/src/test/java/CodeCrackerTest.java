import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeCrackerTest {
    CodeCracker codeCracker = new CodeCracker();

    HashMap<String, String> map = new HashMap<String, String>() {{

        //fill all the required values for the map
        put("a", "!");
        put("b", ")");
        put("c", "\"");
        put("d", "(");
        put("e", "+");
        put("f", "*");
        put("g", "%");
        put("h", "&");
        put("i", ">");
        put("j", "<");
        put("k", "@");
        put("l", "a");
        put("m", "b");
        put("n", "c");
        put("o", "d");
        put("p", "e");
        put("q", "f");
        put("r", "g");
        put("s", "h");
        put("t", "i");
        put("u", "j");
        put("v", "k");
        put("w", "l");
        put("x", "m");
        put("y", "n");
        put("z", "o");
    }};

    @Test
    public void encrypt() {
        String encrypted1 = codeCracker.encode(map, "a");
        assertEquals(encrypted1, "!");
        String encrypted2 = codeCracker.encode(map, "hello");
        assertEquals(encrypted2, "&+aad");
    }

    @Test
    public void decrypt() {
        String decrypted1 = codeCracker.decode(map, "&+aad");
        assertEquals(decrypted1, "hello");
        String decrypted2 = codeCracker.decode(map, "<!k!");
        assertEquals(decrypted2, "java");
    }
}

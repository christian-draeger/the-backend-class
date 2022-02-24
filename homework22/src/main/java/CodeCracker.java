import java.util.HashMap;
import java.util.Map;

public class CodeCracker {
    HashMap<String, String> map = new HashMap<String, String>() {{

        //fill all the required values for the map
        put("a", "!");
        put("b", ")");
        put("c", "\"");
        put("d", "(");
        put("e", "\u00A3");
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

    String encode(HashMap<String, String> map, String text) {
        char[] input = text.toCharArray();
        String encoded = "";
        for (int i = 0; i < input.length; i++) {
            String enc = input[i] + "";
            encoded += map.get(enc);
        }
        return encoded;
    }

    String decode(Map<String, String> map, String encode) {
        char[] encoded = encode.toCharArray();
        String decoded = "";
        for (int i = 0; i < encoded.length; i++) {
            String w = encoded[i] + "";
            for (Map.Entry<String, String> m : map.entrySet()) {
                if (m.getValue().equalsIgnoreCase(w)) {
                    String newWord = m.getKey();
                    decoded += newWord;
                }
            }
        }

        return decoded;
    }
}

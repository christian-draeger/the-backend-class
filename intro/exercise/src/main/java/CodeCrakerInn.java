public class CodeCrakerInn {
    public static char[] original = {'a','b', 'c', 'd', 'e' ,'f', 'g', 'h' ,'i', 'j', 'k' ,'l' ,'m', 'n' ,'o', 'p', 'q' ,'r' ,'s', 't', 'u' ,'v' ,'w','x' ,'y', 'z'};
    public static char[] encryptKeys = {'!' ,')', '"', '(' ,'£','*' ,'%' ,'&' ,'>' ,'<' ,'@', 'a','b', 'c', 'd', 'e' ,'f', 'g', 'h' ,'i', 'j', 'k' ,'l' ,'m', 'n' ,'o'};

    public static void main(String[] args) {
        System.out.println("encrypted: "+encrypt("xyz"));
        System.out.println("decrypted: "+decrypt("xyz"));
    }

    static String encrypt(String word){
        String generatedWord = "";
        for(int i = 0; i < word.length(); i++){
            for(int j = 0; j < original.length; j++){
                if(word.charAt(i) == original[j]){
                    generatedWord = generatedWord + encryptKeys[j];
                }
            }
        }
        return generatedWord;
    }
    static String decrypt(String w){
        String decryptedWord = "";
        for(int i = 0; i < w.length(); i++){
            for(int j = 0; j < encryptKeys.length; j++){
                if(w.charAt(i) == encryptKeys[j]){
                    decryptedWord = decryptedWord + original[j];
                }
            }
        }
        return decryptedWord;
    }
}

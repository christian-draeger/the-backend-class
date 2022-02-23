package com.company;

public class Main {

    public static void main(String[] args) {

        String value = "Kalisa Jonathan";
        int secret_key = 8;

        System.out.println("original_value : " + value);
        String encrypt = getEncryptedValue(value, secret_key);
        System.out.println("encrypt value : " + encrypt);

        String decrypt = getDecryptedValue(encrypt, secret_key);
        System.out.println("decrypted value : " + decrypt);

    }

    private static  String getDecryptedValue(String encrypt, int secret_key) {
        String decrypted = "";
        for(int i=0; i<encrypt.length(); i++) {
            char ch = encrypt.charAt(i);
            ch -= secret_key;
            decrypted = decrypted + ch;
        }
        return decrypted;
    }

    private static  String getEncryptedValue(String value, int secret_key) {
        String encrypt = "";
        for(int i=0; i<value.length(); i++) {
            char ch = value.charAt(i);
            ch += secret_key;
            encrypt = encrypt + ch;
        }
        return encrypt;
    }
}
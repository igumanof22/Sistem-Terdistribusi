/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul11_1811081007;

/**
 *
 * @author RyderPhantom
 */
public class Modulo26Crypto_1811081007 {
    public static void main(String[] args) {
        String plainText_1007 = "SISTER";
        String secretKey_1007 = "SECRETKEY";
        System.out.println("Plain Text Before Encryption\t: "+plainText_1007);
        String encryptedText_1007 = encrypt(plainText_1007, secretKey_1007);
        System.out.println("Encrypted Text After Encryption\t: "+encryptedText_1007);
        String decryptedText_1007 = decrypt(encryptedText_1007, secretKey_1007);
        System.out.println("Decrypted Text After Decryption\t: "+decryptedText_1007);
    }
    
    private static String encrypt(String str, String key){
        StringBuilder encryptedString_1007 = new StringBuilder();
        int encryptedInt_1007;
        for(int i=0; i<str.length(); i++){
            int strInt_1007 = (int)(str.charAt(i) - 'A');
            int keyInt_1007 = (int)(key.charAt(i) - 'A');
            encryptedInt_1007 = (strInt_1007+keyInt_1007)%26;
            encryptedString_1007.append((char) (encryptedInt_1007 + (int) 'A'));
        }
        return encryptedString_1007.toString();
    }
    
    private static String decrypt(String str, String key){
        StringBuilder decryptedString_1007 = new StringBuilder();
        int decryptedInt_1007;
        for(int i=0; i<str.length(); i++){
            int strInt_1007 = (int) (str.charAt(i) - 'A');
            int keyInt_1007 = (int) (key.charAt(i) - 'A');
            decryptedInt_1007 = strInt_1007 - keyInt_1007;
            if(decryptedInt_1007<0){
                decryptedInt_1007+=26;
            }
            decryptedString_1007.append((char) (decryptedInt_1007 + (int) 'A'));
        }
        return decryptedString_1007.toString();
    }
}

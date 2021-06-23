/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul11_1811081007;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author RyderPhantom
 */
public class Crypto_1811081007 {
    private static Cipher cipher_1007 = null;
    
    public static void main(String[] args) throws Exception{
        KeyGenerator keyGenerator_1007 = KeyGenerator.getInstance("DESede");
        
        keyGenerator_1007.init(168);
        SecretKey secretKey_1007 = keyGenerator_1007.generateKey();
        cipher_1007 = Cipher.getInstance("DESede");
        
        String plainTxt_1007 = "Kriptografi menggunakan Java Cryptography Extension";
        System.out.println("Plain Text Before Encryption : "+plainTxt_1007);
        
        byte[] plainTextByte_1007 = plainTxt_1007.getBytes("UTF8");
        
        byte[] encryptedBytes_1007 = encrypt(plainTextByte_1007, secretKey_1007);
        String encryptedText_1007 = new String(encryptedBytes_1007, "UTF8");
        System.out.println("Plain Text After Encryption : "+ encryptedText_1007);
        
        byte[] decryptedBytes_1007 = decrypt(encryptedBytes_1007, secretKey_1007);
        String decryptedText_1007 = new String(decryptedBytes_1007, "UTF8");
        System.out.println("Plain Text After Decryption : "+decryptedText_1007);
    }
    
    static byte[] encrypt(byte[] plainText, SecretKey key) throws Exception{
        cipher_1007.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes_1007 = cipher_1007.doFinal(plainText);
        return encryptedBytes_1007;
    }
    
    static byte[] decrypt(byte[] encryptedText, SecretKey key) throws Exception{
        cipher_1007.init(cipher_1007.DECRYPT_MODE, key);
        byte[] decryptedBytes_1007 = cipher_1007.doFinal(encryptedText);
        return decryptedBytes_1007;
    }
}

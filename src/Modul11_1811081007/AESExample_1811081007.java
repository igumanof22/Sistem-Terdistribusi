/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul11_1811081007;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author RyderPhantom
 */
public class AESExample_1811081007 {
    static Cipher cipher_1007;
    
    public static void main(String[] args) throws Exception{
        KeyGenerator keyGenerator_1007 = KeyGenerator.getInstance("AES");
        keyGenerator_1007.init(128);
        SecretKey secretKey_1007 = keyGenerator_1007.generateKey();
        cipher_1007 = Cipher.getInstance("AES");
        
        String plainTxt_1007 = "AES symmetric Encryption Decryption";
        System.out.println("Plain Text Before Encryption : "+plainTxt_1007);
        
        String encryptedText_1007 = encrypt(plainTxt_1007, secretKey_1007);
        System.out.println("Plain Text After Encryption : "+ encryptedText_1007);
        
        String decryptedText_1007 = decrypt(encryptedText_1007, secretKey_1007);
        System.out.println("Plain Text After Decryption : "+decryptedText_1007);
    }

    public static String encrypt(String plainTxt, SecretKey key) throws Exception{
        byte[] plainTextBytes_1007 = plainTxt.getBytes();
        cipher_1007.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedByte_1007 = cipher_1007.doFinal(plainTextBytes_1007);
        Base64.Encoder encoder_1007 = Base64.getEncoder();
        String encryptedText_1007 = encoder_1007.encodeToString(encryptedByte_1007);
        return encryptedText_1007;
    }

    public static String decrypt(String encryptedText, SecretKey key) throws Exception{
        Base64.Decoder decoder_1007 = Base64.getDecoder();
        byte[] encryptedTextBytes_1007 = decoder_1007.decode(encryptedText);
        cipher_1007.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedByte_1007 = cipher_1007.doFinal(encryptedTextBytes_1007);
        String decryptedText_1007 = new String(decryptedByte_1007);
        return decryptedText_1007;
    }
    
    
}

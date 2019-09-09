package EncryptDecrypt;

import org.apache.commons.codec.binary.Base64;

public class demo {

    public static void main(String a[]){
        String tempPassword = "password";

        String encrypt = Base64.encodeBase64String(tempPassword.getBytes());
        System.out.println(encrypt);

        byte[] byteArray = Base64.decodeBase64(encrypt.getBytes());
        String decode = new String(byteArray);
        System.out.println(decode);

    }
}

package com.yunzhanghu.sdk.utils;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;

public class CipherUtil {

    public static byte[] tripleDesEncrypt(byte[] content, byte[] key) throws Exception {
        byte[] icv = new byte[8];
        System.arraycopy(key, 0, icv, 0, 8);
        return tripleDesEncrypt(content, key, icv);
    }

    protected static byte[] tripleDesEncrypt(byte[] content, byte[] key, byte[] icv) throws Exception {
        final SecretKey secretKey = new SecretKeySpec(key, "DESede");
        final Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
        final IvParameterSpec iv = new IvParameterSpec(icv);

        cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);

        return cipher.doFinal(content);
    }

    public static byte[] tripleDesDecrypt(byte[] content, byte[] key) throws Exception {
        byte[] icv = new byte[8];
        System.arraycopy(key, 0, icv, 0, 8);
        return tripleDesDecrypt(content, key, icv);
    }

    protected static byte[] tripleDesDecrypt(byte[] content, byte[] key, byte[] icv) throws Exception {
        final SecretKey secretKey = new SecretKeySpec(key, "DESede");
        final Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
        final IvParameterSpec iv = new IvParameterSpec(icv);

        cipher.init(Cipher.DECRYPT_MODE, secretKey, iv);

        return cipher.doFinal(content);
    }

    public static String encData(String yzh3DesKey, String data, Charset charset) throws Exception {
        byte[] content = data.getBytes(charset);
        byte[] key = yzh3DesKey.getBytes(charset);

        byte[] enc = CipherUtil.tripleDesEncrypt(content, key);
        byte[] enc64 = Base64.encodeBase64(enc);
        return new String(enc64);
    }

}

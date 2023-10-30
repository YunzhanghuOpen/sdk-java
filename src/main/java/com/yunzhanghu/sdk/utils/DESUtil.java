package com.yunzhanghu.sdk.utils;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;

public class DESUtil {

    /**
     * 3DES加密
     *
     * @param yzh3DesKey 密钥
     * @param data       数据
     * @return String 加密后数据
     * @throws Exception 通用异常
     */
    public static String encode(String yzh3DesKey, String data, Charset charset) throws Exception {
        byte[] content = data.getBytes(charset);
        byte[] key = yzh3DesKey.getBytes(charset);

        byte[] enc = tripleDesEncrypt(content, key);
        byte[] enc64 = Base64.encodeBase64(enc);
        return new String(enc64, charset);
    }

    /**
     * 3DES解密
     * <p>
     * 解密报错 javax.crypto.IllegalBlockSizeException: Input length must be multiple of 8 when decrypting with padded cipher
     * 不需要进行urldecode，使用如下解密代码
     * byte[] dec64 = Base64.decodeBase64(notifyResponse.getData());
     *
     * @param yzh3DesKey 密钥
     * @param data       加密数据
     * @return String 解密后数据
     * @throws Exception 通用异常
     */
    public static String decode(String yzh3DesKey, String data, Charset charset) throws Exception {
        byte[] dec64 = Base64.decodeBase64(data);
        byte[] dec = tripleDesDecrypt(dec64, yzh3DesKey.getBytes(charset));
        return new String(dec, charset);
    }

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

}

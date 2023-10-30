package com.yunzhanghu.sdk.utils;

import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import org.apache.commons.codec.binary.Base64;

public class RSAUtil {

	public static String sign(String content, String privateKeyPem, Charset charset) {
		try {
			byte[] encodedKey = privateKeyPem.getBytes();
			encodedKey = Base64.decodeBase64(encodedKey);
			PrivateKey privateKey = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(encodedKey));
			Signature signature = Signature.getInstance("SHA256WithRSA");
			signature.initSign(privateKey);
			signature.update(content.getBytes(charset));
			byte[] signed = signature.sign();
			return new String(Base64.encodeBase64(signed));
		} catch (Exception var6) {
			String errorMessage = "签名遭遇异常，content=" + content + " privateKeySize=" + privateKeyPem.length() + " reason="
					+ var6.getMessage();
			throw new RuntimeException(errorMessage, var6);
		}
	}

	public static boolean verify(String content, String sign, String publicKeyPem, Charset charset) {
		try {
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			byte[] encodedKey = publicKeyPem.getBytes();
			encodedKey = Base64.decodeBase64(encodedKey);
			PublicKey publicKey = keyFactory.generatePublic(new X509EncodedKeySpec(encodedKey));
			Signature signature = Signature.getInstance("SHA256WithRSA");
			signature.initVerify(publicKey);
			signature.update(content.getBytes(charset));
			return signature.verify(Base64.decodeBase64(sign.getBytes()));
		} catch (Exception var7) {
			String errorMessage = "验签遭遇异常，content=" + content + " sign=" + sign + " publicKey=" + publicKeyPem
					+ " reason=" + var7.getMessage();
			throw new RuntimeException(errorMessage, var7);
		}
	}

}

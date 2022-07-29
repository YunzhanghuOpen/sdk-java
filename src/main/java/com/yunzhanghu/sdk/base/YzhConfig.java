package com.yunzhanghu.sdk.base;

import com.yunzhanghu.sdk.YzhException;
import com.yunzhanghu.sdk.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class YzhConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(YzhConfig.class);


    public static String YZH = "yzh";
    public static String YZH_PRE = "yzh.";
    public static String YZH_URL = "url";
    public static String YZH_SIGN_TYPE = "sign_type";
    public static String YZH_DEALER_ID = "dealer_id";
    public static String YZH_3DES_KEY = "3des_key";
    public static String YZH_APP_KEY = "app_key";
    public static String YZH_RSA_PRIVATE_KEY = "rsa_private_key";
    public static String YZH_RSA_PUBLIC_KEY = "rsa_public_key";
    private SignType signType;
    private String dealerId;
    private String yzh3DesKey;
    private String yzhAppKey;
    private String yzhRsaPublicKey;
    private String yzhRsaPrivateKey;
    private String yzhUrl;

    public static YzhConfig loadConfig(String fileName) throws Exception {
        fileName = StringUtils.trim(fileName);

        if (fileName.endsWith("yaml") || fileName.endsWith("yml")) {
            return loadYaml(fileName);
        }

        return loadProperties(fileName);
    }

    public static YzhConfig loadProperties(String fileName) throws Exception {
        InputStream inputStream = null;
        YzhConfig config = new YzhConfig();
        try {
            inputStream = YzhConfig.class.getClassLoader().getResourceAsStream(fileName);
            if (inputStream == null) {
                throw new FileNotFoundException("property file '" + fileName + "' not found in the classpath");
            }

            Properties properties = new Properties();
            properties.load(inputStream);
            SignType signType = SignType.valueOf(properties.getProperty(YZH_PRE + YZH_SIGN_TYPE));

            config.setSignType(signType);
            config.setYzh3DesKey(properties.getProperty(YZH_PRE + YZH_3DES_KEY));
            config.setDealerId(properties.getProperty(YZH_PRE + YZH_DEALER_ID));
            config.setYzhAppKey(properties.getProperty(YZH_PRE + YZH_APP_KEY));
            config.setYzhRsaPrivateKey(properties.getProperty(YZH_PRE + YZH_RSA_PRIVATE_KEY));
            config.setYzhRsaPublicKey(properties.getProperty(YZH_PRE + YZH_RSA_PUBLIC_KEY));
            config.setYzhUrl(properties.getProperty(YZH_PRE + YZH_URL));

            config.checkConfig();
        } catch (Exception e) {
            LOGGER.error("LoadConfig error", e);
            throw e;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException io) {
                    LOGGER.error("inputStream close error", io);
                }
            }
        }

        // 检查配置文件
        return config;
    }

    public static YzhConfig loadYaml(String fileName) throws Exception {
        InputStream inputStream = null;
        YzhConfig config = new YzhConfig();
        try {
            inputStream = YzhConfig.class.getClassLoader().getResourceAsStream(fileName);
            if (inputStream == null) {
                throw new FileNotFoundException("yaml file '" + fileName + "' not found in the classpath");
            }

            Yaml yaml = new Yaml();
            Map<String, Object> map = yaml.load(inputStream);
            if (map.get(YZH) != null) {
                Map<String, Object> properties = (Map<String, Object>) map.get(YZH);
                SignType signType = SignType.valueOf(StringUtils.trim(properties.get(YZH_SIGN_TYPE)));

                config.setSignType(signType);
                config.setYzh3DesKey(StringUtils.trim(properties.get(YZH_3DES_KEY)));
                config.setDealerId(StringUtils.trim(properties.get(YZH_DEALER_ID)));
                config.setYzhAppKey(StringUtils.trim(properties.get(YZH_APP_KEY)));
                config.setYzhRsaPrivateKey(StringUtils.trim(properties.get(YZH_RSA_PRIVATE_KEY)));
                config.setYzhRsaPublicKey(StringUtils.trim(properties.get(YZH_RSA_PUBLIC_KEY)));
                config.setYzhUrl(StringUtils.trim(properties.get(YZH_URL)));

                config.checkConfig();
            } else {
                throw new YzhException("key yzh not found in config file");
            }
        } catch (ClassCastException cce) {
            LOGGER.error("LoadConfig error", cce);
            throw new YzhException("yzh config is illegal");
        } catch (Exception e) {
            LOGGER.error("LoadConfig error", e);
            throw e;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException io) {
                    LOGGER.error("inputStream close error", io);
                }
            }
        }

        // 检查配置文件
        return config;
    }

    public String getYzhUrl() {
        return yzhUrl;
    }

    public void setYzhUrl(String yzhUrl) {
        this.yzhUrl = yzhUrl;
    }

    public SignType getSignType() {
        return signType;
    }

    public void setSignType(SignType signType) {
        this.signType = signType;
    }

    public String getYzh3DesKey() {
        return yzh3DesKey;
    }

    public void setYzh3DesKey(String yzh3DesKey) {
        this.yzh3DesKey = yzh3DesKey;
    }

    public String getYzhAppKey() {
        return yzhAppKey;
    }

    public void setYzhAppKey(String yzhAppKey) {
        this.yzhAppKey = yzhAppKey;
    }

    public String getYzhRsaPublicKey() {
        return yzhRsaPublicKey;
    }

    public void setYzhRsaPublicKey(String yzhRsaPublicKey) {
        this.yzhRsaPublicKey = yzhRsaPublicKey;
    }

    public String getYzhRsaPrivateKey() {
        return yzhRsaPrivateKey;
    }

    public void setYzhRsaPrivateKey(String yzhRsaPrivateKey) {
        this.yzhRsaPrivateKey = yzhRsaPrivateKey;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    private void checkConfig() throws YzhException {
        if (StringUtils.isNull(getDealerId())) {
            throw new YzhException("dealer_id is empty");
        }

        if (StringUtils.isNull(getYzhUrl())) {
            throw new YzhException("url is empty");
        }

        if (StringUtils.isNull(getYzhAppKey())) {
            throw new YzhException("app_key is empty");
        }

        if (SignType.SHA256.equals(getSignType())) {
            if (StringUtils.isNull(getYzh3DesKey())) {
                throw new YzhException("3des_key is empty");
            }
        }

        if (SignType.RSA.equals(getSignType())) {
            if (StringUtils.isNull(getYzhRsaPrivateKey())) {
                throw new YzhException("rsa.private.key is empty");
            }
            if (StringUtils.isNull(getYzhRsaPublicKey())) {
                throw new YzhException("rsa.public.key is empty");
            }
        }
    }

    @Override
    public String toString() {
        return "YzhConfig{" +
                "signType=" + signType +
                ", yzh3DesKey='" + yzh3DesKey + '\'' +
                ", yzhAppKey='" + yzhAppKey + '\'' +
                ", yzhRsaPublicKey='" + yzhRsaPublicKey + '\'' +
                ", yzhRsaPrivateKey='" + yzhRsaPrivateKey + '\'' +
                ", yzhUrl='" + yzhUrl + '\'' +
                '}';
    }

    public enum SignType {

         // RSA
         RSA("RSA"),

         // hmac
         SHA256("SHA256");

        private final String value;

        SignType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}

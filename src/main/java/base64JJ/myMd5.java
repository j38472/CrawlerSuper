package base64JJ;

import org.apache.commons.codec.digest.DigestUtils;

public class myMd5 {


    // 带秘钥加密
    public String getSignMd5(String e, String i) {
        // 加密后的字符串
        String md5str = DigestUtils.md5Hex("fanyideskweb" + e + i + "Tbh5E8=q6U3EXe+&L[4c@"); // 生成使用盐的 MD5 密文
//        System.out.println("MD5加密后的字符串为:" + md5str);
        return md5str;
    }

    // 不带秘钥加密
    public String md52(String text) {
        // 加密后的字符串
        String md5str = DigestUtils.md5Hex(text); // 生成不加盐的 MD5 密文
//        System.out.println("MD52加密后的字符串为:" + md5str + "\t长度：" + md5str.length());
        return md5str;
    }
}

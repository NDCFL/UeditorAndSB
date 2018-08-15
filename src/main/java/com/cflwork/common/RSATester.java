package com.cflwork.common;

import com.cflwork.vo.ItemVo;

import java.util.Map;

public class RSATester {

    static String publicKey;
    static String privateKey;

    static {
        try {
            Map<String, Object> keyMap = RSAUtil.genKeyPair();
            publicKey = RSAUtil.getPublicKey(keyMap);
            privateKey = RSAUtil.getPrivateKey(keyMap);
            System.err.println("公钥: \n\r" + publicKey);
            System.err.println("私钥： \n\r" + privateKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
//        test();
//        testSign();
        ItemVo itemVo = new ItemVo();
        itemVo.setId(123456l);
        itemVo.setIdCard(360730199712200617l);
        itemVo.setType(1);
        itemVo.setMoney(20);
        itemVo.setTitle("充值消费");
        itemVo.setStatus((byte)0);
        itemVo.setCreateTime("20180815");
//        System.out.println("0612345618360730199712200617000000490220002320805c20540c28040c36153000000480820180815");
        System.out.println("030208052080520540205402804028040".length());
//        位图:System.out.println(BitMapUtil.bitMap("0100101001000000010000000010000000000001000000000000000000000000"));
//        数据:0612345618360730199712200617000000490220002320805c20540c28040c36153000000480820180815
        //4a40402001000000
        //06123456

    }

    static void test() throws Exception {
        System.err.println("公钥加密——私钥解密");
        String source = "这是一行没有任何意义的文字，你看完了等于没看，不是吗？";
        System.out.println("\r加密前文字：\r\n" + source);
        byte[] data = source.getBytes();
        byte[] encodedData = RSAUtil.encryptByPublicKey(data, publicKey);
        System.out.println("加密后文字：\r\n" + new String(encodedData));
        byte[] decodedData = RSAUtil.decryptByPrivateKey(encodedData, privateKey);
        String target = new String(decodedData);
        System.out.println("解密后文字: \r\n" + target);
    }

    static void testSign() throws Exception {
        System.err.println("私钥加密——公钥解密");
        String source = "这是一行测试RSA数字签名的无意义文字";
        System.out.println("原文字：\r\n" + source);
        byte[] data = source.getBytes();
        byte[] encodedData = RSAUtil.encryptByPrivateKey(data, privateKey);
        System.out.println("加密后：\r\n" + new String(encodedData));
        byte[] decodedData = RSAUtil.decryptByPublicKey(encodedData, publicKey);
        String target = new String(decodedData);
        System.out.println("解密后: \r\n" + target);
        System.err.println("私钥签名——公钥验证签名");
        String sign = RSAUtil.sign(encodedData, privateKey);
        System.err.println("签名:\r" + sign);
        boolean status = RSAUtil.verify(encodedData, publicKey, sign);
        System.err.println("验证结果:\r" + status);
    }

}
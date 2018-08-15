package com.cflwork.common;

import java.math.BigInteger;

public class NumberUtil {
    /**
     * @Description:	十进制转换成二进制 ()
     * @param decimalSource
     * @return String
     */
    public static String decimalToBinary(int decimalSource) {
        BigInteger bi = new BigInteger(String.valueOf(decimalSource));	//转换成BigInteger类型
        return bi.toString(2);	//参数2指定的是转化成X进制，默认10进制
    }

    /**
     * @Description:	二进制转换成十进制
     * @param binarySource
     * @return int
     */
    public static BigInteger binaryToDecimal(String binarySource) {
        BigInteger bi = new BigInteger(binarySource, 2);	//转换为BigInteger类型
        return bi;		//转换成十进制
    }

}

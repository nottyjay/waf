package com.d3code.waf.util;

/**
 * @author Aaron
 * @date 2018/5/29
 */
public class CommonUtil {

    private static final char[] character = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
            , 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
            , 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /**
     * 获取随机盐
     * @return
     */
    public static String randomSalt(){
        char[] saltChars = new char[4];
        for(int index = 0; index < 4; index++){
            char saltChar = character[(int) (Math.random() * character.length)];
            saltChars[index] = saltChar;
        }
        return new String(saltChars);
    }
}

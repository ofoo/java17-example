package com.github.ofoo.lang3;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * apache commons-lang3 StringUtils 工具类实例
 */
public class StringUtilsExample {

    /**
     * 使用省略号缩写 String。
     */
    @Test
    public void a1(){
        String str = "幽默就像WiFi，看不见摸不着，但没有它，生活就断了网。";
//        System.out.println(str.length());

        //使用指定省略符号"..."
//        System.out.println(StringUtils.abbreviate(str, 4));//结果：幽...
//        System.out.println(StringUtils.abbreviate(str, 5,7));//结果：...i...

        //使用自定义省略符
//        System.out.println(StringUtils.abbreviate(str,"......", 7));//结果：幽......
//        System.out.println(StringUtils.abbreviate(str, "......",8,13));//结果：...i...

        System.out.println(StringUtils.abbreviate(str+"啊 啊", "......",8,13));//结果：...i...
    }
}

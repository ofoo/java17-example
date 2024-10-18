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
//        System.out.println(StringUtils.abbreviate(str, "......",7,13));//结果：...i...
        System.out.println(StringUtils.abbreviate(str, "......",28,20));//结果：...i...
    }

    @Test
    public void a2(){
        String str = "13333333333";
        System.out.println(StringUtils.abbreviateMiddle(str, "*****", 11));
    }

    /**
     * 如果字符串尚未以任何后缀结尾，则将后缀附加到字符串的末尾。
     */
    @Test
    public void a3(){
        String str = "13333333333A";

        //操作字符串：13333333333
//        System.out.println(StringUtils.appendIfMissing(str, ","));//13333333333,
        //判断字符串后缀是否有","或"a"结尾，当一个也不成立的时候，执行追加后缀操作，追加","后缀
//        System.out.println(StringUtils.appendIfMissing(str, ",","a"));//执行结果：13333333333,

        //操作字符串：13333333333A
        System.out.println(StringUtils.appendIfMissingIgnoreCase(str, "a"));//执行结果：13333333333A,
    }

    /**
     * 将第一个字符更改为首字母大写。
     */
    @Test
    public void a4() {
//        System.out.println(StringUtils.capitalize("abc"));//返回结果：Abc
//        System.out.println(StringUtils.capitalize("Abc"));//返回结果：Abc
        System.out.println(StringUtils.capitalize("abc abc"));//返回结果：Abc abc
    }

    /**
     * 左右两边填充字符串
     */
    @Test
    public void a5() {
        //参数1：操作字符串
        //参数2：填充字符串后的总长度
        //参数3：要填充的字符
        System.out.println(StringUtils.center("abc", 5,"*"));//返回结果：*abc*
    }

    /**
     * 末尾删除一个换行符，换行符是 “\n”、“\r” 或 “\r\n”。
     */
    @Test
    public void a6() {
        System.out.println(StringUtils.chomp("abc\r"));//返回结果：abc
        System.out.println(StringUtils.chomp("abc\n"));//返回结果：abc
        System.out.println(StringUtils.chomp("abc\r\n"));//返回结果：abc
    }

    /**
     * 删除最后一个字符。如果以 “\n”、“\r” 或 “\r\n” 结尾，也删除
     */
    @Test
    public void a7() {
        System.out.println(StringUtils.chop("abc\r"));//返回结果：abc
        System.out.println(StringUtils.chop("abc\n"));//返回结果：abc
        System.out.println(StringUtils.chop("abc\r\n"));//返回结果：abc
        System.out.println(StringUtils.chop("abc\r\nabc"));//返回结果：abc\r\nab
    }

    /**
     * 按字典顺序比较两个字符串，
     * 参数1==参数2：返回0（或两者都为空）
     * 参数1<参数2：返回<0
     * 参数1>参数2：返回>0
     */
    @Test
    public void a8() {
        System.out.println(StringUtils.compare("a", "null"));//返回结果：-13

        //参数3：是否认为 null 值小于非 null 值
        System.out.println(StringUtils.compare("a", "null",false));//返回结果：-13
    }
}

package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceCharacterByJava8Test {

    private StringHandlerImpl stringHandlerImpl = new StringHandlerImpl();

    @Test
    public void replaceConsecutiveCharacter1() {
        // 测试用例1: 基本情况
        assertEquals("d", stringHandlerImpl.replaceConsecutiveCharacterByJava8("abcccbad"));
    }

    @Test
    public void replaceConsecutiveCharacter2() {
        // 测试用例2: 没有超过三个
        assertEquals("abcd", stringHandlerImpl.replaceConsecutiveCharacterByJava8("abcd"));
    }

    @Test
    public void replaceConsecutiveCharacter3() {
        // 测试用例3: 超过三个
        assertEquals("ab", stringHandlerImpl.replaceConsecutiveCharacterByJava8("aaaabbbbcccc"));
    }

    @Test
    public void replaceConsecutiveCharacter4() {
        // 测试用例4: 混过情况
        assertEquals("bdd", stringHandlerImpl.replaceConsecutiveCharacterByJava8("aabbbcccccdd"));
    }
}

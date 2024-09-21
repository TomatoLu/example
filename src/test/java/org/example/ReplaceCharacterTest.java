package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReplaceCharacterTest {

    private StringHandlerImpl stringHandlerImpl = new StringHandlerImpl();

    @Test
    public void replaceConsecutiveCharacter1() {
        // 测试用例1: 基本情况
        assertEquals("d", stringHandlerImpl.replaceConsecutiveCharacter("abcccbad"));
    }

    @Test
    public void replaceConsecutiveCharacter2() {
        // 测试用例2: 没有超过三个
        assertEquals("abcd", stringHandlerImpl.replaceConsecutiveCharacter("abcd"));
    }

    @Test
    public void replaceConsecutiveCharacter3() {
        // 测试用例3: 超过三个
        assertEquals("abc", stringHandlerImpl.replaceConsecutiveCharacter("aaaabbbbcccc"));
    }

    @Test
    public void replaceConsecutiveCharacter4() {
        // 测试用例4: 混过情况
        assertEquals("abc", stringHandlerImpl.replaceConsecutiveCharacter("aabbbcccccdd"));
    }
}

package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveCharacterTest {

    private StringHandlerImpl stringHandlerImpl = new StringHandlerImpl();

    @Test
    public void removeConsecutiveCharacter1() {
        // 测试用例1: 基本情况
        assertEquals("ac", stringHandlerImpl.removeConsecutiveCharacter("abbbc"));
    }

    @Test
    public void removeConsecutiveCharacter2() {
        // 测试用例2: 没有连续字符
        assertEquals("abcd", stringHandlerImpl.removeConsecutiveCharacter("abcd"));
    }

    @Test
    public void removeConsecutiveCharacter3() {
        // 测试用例3: 全部字符都连续
        assertEquals("", stringHandlerImpl.removeConsecutiveCharacter("aaa"));
    }
}

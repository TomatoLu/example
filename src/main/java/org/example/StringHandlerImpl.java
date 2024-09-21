package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StringHandlerImpl implements StringHandler{
    @Override
    public String removeConsecutiveCharacter(String str) {

        Stack<Character> stack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!stack.isEmpty() && stack.peek() == c) {
                // 如果栈顶元素与当前字符相同，增加计数
                int count = countStack.pop();
                count++;
                countStack.push(count);
            } else {
                // 新字符，重置计数
                stack.push(c);
                countStack.push(1);
            }

            // 检查是否需要移除
            if (countStack.peek() == 3) {
                stack.pop();
                countStack.pop();
            }
        }

        // 构建结果字符串
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            char c = stack.pop();
            int count = countStack.pop();
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        // 因为栈是后进先出，所以结果需要反转
        return result.reverse().toString();
    }

    @Override
    public String replaceConsecutiveCharacter(String str) {

        // 辅助函数，用于递归处理字符串
        return replaceConsecutiveCharsHelper(str);

    }

    public static String replaceConsecutiveCharsHelper(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }

            if (count < 3) {
                result.append(s.charAt(i));
            } else {
                // 替换为前一个字符
                char prevChar = (char) (s.charAt(i) - 1);
                result.append(prevChar);
            }

            i++;
        }

        // 检查结果字符串是否还需要进一步处理
        if (result.length() != s.length()) {
            return replaceConsecutiveCharsHelper(result.toString());
        }

        return result.toString();
    }
}

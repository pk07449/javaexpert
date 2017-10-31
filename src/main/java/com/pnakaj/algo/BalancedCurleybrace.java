package com.pnakaj.algo;

import java.util.Stack;

/**
 * Created by pankaj on 11/1/2017.
 */
public class BalancedCurleybrace {

    public static void main(String[] args) {
        System.out.println(isBalaced("()[]"));
    }

    private static boolean isBalaced(String datas) {
        Stack<Character> stack = new Stack();
        for (char data : datas.toCharArray()) {
            switch (data) {
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                default:
                    if (stack.isEmpty() || stack.peek() != data) {
                        return false;
                    }
                    stack.pop();

            }

        }
        return stack.isEmpty();

    }
}

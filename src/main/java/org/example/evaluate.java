package org.example;

import java.util.Stack;

public class evaluate {
    public int evalRPN(String[] tokens) {
        Stack<Integer> eval = new Stack<>();
        int finalyNumber = 0;
        int[] finalyNumbers = new int[2];
        for (String s : tokens) {
            switch (s) {
                case ("+"):
                    finalyNumbers[1] = (int) eval.peek();
                    eval.pop();
                    finalyNumbers[0] = (int) eval.peek();
                    eval.pop();
                    finalyNumber = finalyNumbers[0] + finalyNumbers[1];
                    eval.push(finalyNumber);
                    break;
                case ("-"):
                    finalyNumbers[1] = (int) eval.peek();
                    eval.pop();
                    finalyNumbers[0] = (int) eval.peek();
                    eval.pop();
                    finalyNumber = finalyNumbers[0] - finalyNumbers[1];
                    eval.push(finalyNumber);
                    break;
                case ("*"):
                    finalyNumbers[1] = (int) eval.peek();
                    eval.pop();
                    finalyNumbers[0] = (int) eval.peek();
                    eval.pop();
                    finalyNumber = finalyNumbers[0] * finalyNumbers[1];
                    eval.push(finalyNumber);
                    break;
                case ("/"):
                    finalyNumbers[1] = (int) eval.peek();
                    eval.pop();
                    finalyNumbers[0] = (int) eval.peek();
                    eval.pop();
                    finalyNumber = finalyNumbers[0] / finalyNumbers[1];
                    eval.push(finalyNumber);
                    break;
                default:
                    eval.push(Integer.parseInt(s));
                    break;
            }
        }
        if (eval.isEmpty()) return finalyNumber;
        else return (eval.pop());
    }
}


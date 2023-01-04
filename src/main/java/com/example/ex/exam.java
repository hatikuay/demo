/**
 * Required import for pop-up windows. Do not modify the next line.
 */
package com.example.ex;

import javax.swing.*;

public class exam {
    public static void main(String[] args) {
        while (true) {
            String userInput = acceptUserInput("title", "content");
            String result;
            if (isCommand(userInput)) {
                if (userInput.indexOf("narcissistic") != -1) {
                    if (isNarcissistic(Integer.parseInt(extractInt(userInput))) == true)
                        result = "Yes";
                    else
                        result = "No";
                } else if (userInput.indexOf("prime") != -1) {
                    if (isPrime(Integer.parseInt(extractInt(userInput))) == true)
                        result = "Yes";
                    else
                        result = "No";
                } else if (userInput.indexOf("perfect") != -1) {
                    if (isPerfect(Integer.parseInt(extractInt(userInput))) == true)
                        result = "Yes";
                    else
                        result = "No";
                } else if (userInput.indexOf("reverse") != -1) {
                    result = String.valueOf(reverse(Integer.parseInt(extractInt(userInput))));
                } else
                    result = "InValid Command";
            } else {
                result = "";// TODO: handle userInput as an expression
            }
            displayResult(userInput, result);
        }
    }

    // narcissistic;
    // prime;
    // perfect;
    // reverses;
    static String extractInt(String str) {
        // Replacing every non-digit number
        // with a space(" ")
        str = str.replaceAll("[^0-9]", ""); // regular expression
        // Replace all the consecutive white
        // spaces with a single space
        // str = str.replaceAll(" +", " ");

        if (str.equals(""))
            return "-1";

        return str;
    }

    private static boolean isNarcissistic(int userInput) {
        int length = 0;
        int number = userInput;
        while (number != 0) {
            number = number / 10;
            length++;
        }
        int[] arr = new int[length];
        number = userInput;
        length = 0;
        while (number != 0) {
            arr[length] = number % 10;
            number = number / 10;
            length++;
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + arr[i] ^ length;
        }

        if (sum == userInput)
            return true;
        else
            return false;

    }

    private static boolean isPrime(int userInput) {
        boolean prime = true;
        for (int i = 2; i < userInput / 2; i++) {
            if (userInput % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    private static boolean isPerfect(int userInput) {
        int sum = 0;
        for (int i = 1; i < userInput / 2; i++) {
            if (userInput % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == userInput)
            return true;
        else
            return false;
    }

    private static int reverse(int userInput) {
        int length = 0;
        int number = userInput;
        while (number != 0) {
            number = number / 10;
            length++;
        }
        int[] arr = new int[length];
        number = userInput;
        length = 0;
        while (number != 0) {
            arr[length] = number % 10;
            number = number / 10;
            length++;
        }
        int sum = 0;
        int digit = length - 1;
        for (int i = 0; i < length; i++) {
            sum = sum + arr[i] * (10 ^ digit);
            digit--;
        }

        return sum;

    }

    /**
     * Checks whether <code>userInput</code> is a command or an expression.
     *
     * @param userInput <code>String</code> received from the user that is to be
     *                  checked whether it is a command or
     *                  an expression.
     * @return <code>true</code> if <code>userInput</code> is in the form of a
     *         command, <code>false</code> otherwise.
     */
    private static boolean isCommand(String userInput) {

        int checks = -1;
        if ((checks = userInput.indexOf("narcissistic")) != -1)
            return true;
        if ((checks = userInput.indexOf("prime")) != -1)
            return true;
        if ((checks = userInput.indexOf("perfect")) != -1)
            return true;
        if ((checks = userInput.indexOf("reverse")) != -1)
            return true;
        else
            return false;

    }

    /**
     * Displays a pop-up window with a specified <code>title</code> and
     * <code>content</code>.
     *
     * @param title   the title of the pop-up window.
     * @param content the content of the pup-up window.
     */
    private static void displayResult(String title, String content) {
        JOptionPane.showMessageDialog(null, content, title, JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Displays a pop-up window with a text area for the user to input a
     * <code>String</code>. Once the user pressed
     * <code>enter</code> or pressed <code>ok</code>, the inputted
     * <code>String</code> is being returned.
     *
     * @param title   the title of the pop-up window.
     * @param content the content of the pop-up window displayed just above the text
     *                area where the user can input a
     *                command or an expression.
     * @return the inputted <code>String</code>.
     */
    private static String acceptUserInput(String title, String content) {
        return JOptionPane.showInputDialog(null, content, title, JOptionPane.PLAIN_MESSAGE);
    }
}
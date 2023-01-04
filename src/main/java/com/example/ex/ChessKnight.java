package com.example.ex;

public class ChessKnight {
    public static String knightMoves(String pos) {
        String result = "";
        pos = pos.toLowerCase();
        int posColumn = pos.charAt(0) - 96;
        int posRow = pos.charAt(1) - 48;
        //
        if (posColumn - 2 <= 8 && posColumn - 2 >= 1 && posRow - 1 <= 8 && posRow - 1 >= 1) {
            int AsciiColumn = posColumn - 2 + 96;
            char column = (char) (AsciiColumn);
            int AsciiRow = posRow - 1 + 48;
            char row = (char) (AsciiRow);
            result = result + String.valueOf(column) + String.valueOf(row) + " ";
        }
        if (posColumn - 2 <= 8 && posColumn - 2 >= 1 && posRow + 1 <= 8 && posRow + 1 >= 1) {
            int AsciiColumn = posColumn - 2 + 96;
            char column = (char) (AsciiColumn);
            int AsciiRow = posRow + 1 + 48;
            char row = (char) (AsciiRow);
            result = result + String.valueOf(column) + String.valueOf(row) + " ";
        }
        //
        //
        if (posColumn - 1 <= 8 && posColumn - 1 >= 1 && posRow - 2 <= 8 && posRow - 2 >= 1) {
            int AsciiColumn = posColumn - 1 + 96;
            char column = (char) (AsciiColumn);
            int AsciiRow = posRow - 2 + 48;
            char row = (char) (AsciiRow);
            result = result + String.valueOf(column) + String.valueOf(row) + " ";
        }
        if (posColumn + 1 <= 8 && posColumn + 1 >= 1 && posRow - 2 <= 8 && posRow - 2 >= 1) {
            int AsciiColumn = posColumn + 1 + 96;
            char column = (char) (AsciiColumn);
            int AsciiRow = posRow - 2 + 48;
            char row = (char) (AsciiRow);
            result = result + String.valueOf(column) + String.valueOf(row) + " ";
        }
        //
        if (posColumn + 2 <= 8 && posColumn + 2 >= 1 && posRow - 1 >= 1 && posRow - 1 <= 8) {
            int AsciiColumn = posColumn + 2 + 96;
            char column = (char) (AsciiColumn);
            int AsciiRow = posRow - 1 + 48;
            char row = (char) (AsciiRow);
            result = result + String.valueOf(column) + String.valueOf(row) + " ";
        }
        //
        if (posColumn + 2 <= 8 && posColumn + 2 >= 1 && posRow + 1 >= 1 && posRow + 1 <= 8) {
            int AsciiColumn = posColumn + 2 + 96;
            char column = (char) (AsciiColumn);
            int AsciiRow = posRow + 1 + 48;
            char row = (char) (AsciiRow);
            result = result + String.valueOf(column) + String.valueOf(row) + " ";
        }
        //
        if (posColumn - 1 <= 8 && posColumn - 1 >= 1 && posRow + 2 <= 8 && posRow + 2 >= 1) {
            int AsciiColumn = posColumn - 1 + 96;
            char column = (char) (AsciiColumn);
            int AsciiRow = posRow + 2 + 48;
            char row = (char) (AsciiRow);
            result = result + String.valueOf(column) + String.valueOf(row) + " ";
        }
        if (posColumn + 1 <= 8 && posColumn + 1 >= 1 && posRow + 2 <= 8 && posRow + 2 >= 1) {
            int AsciiColumn = posColumn + 1 + 96;
            char column = (char) (AsciiColumn);
            int AsciiRow = posRow + 2 + 48;
            char row = (char) (AsciiRow);
            result = result + String.valueOf(column) + String.valueOf(row) + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        for (String s : new String[] { "A1", "d5", "g6", "C8" })
            System.out.println(s + " -> " + knightMoves(s));
    }
}

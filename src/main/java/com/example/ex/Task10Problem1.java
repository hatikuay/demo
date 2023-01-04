package com.example.ex;

import java.util.Arrays;

/*Define a two-dimensional array of Strings representing the results of matches in
a tournament, for example as below download Arr2DTournament.java

and a four-element array of ints representing scores of teams of Germany, Ireland,
Poland and Scotland (in this order). The program calculates total score for each
team (3 points for a win, 1 for a draw, 0 for a defeat), puts them into the array and
then prints it. It will be very helpful to define a small function which, given the name of a country,
returns its index in the array of total scores (switch expression would be appropriate
here). If a string str represents a number, like "435", you can get this number as an int
using: int n = Integer.parseInt(str);
For data as above you should get scores [10, 6, 9, 6].*/
public class Task10Problem1 {
    public static void main(String[] args) {
        String[][] arr = { { "Germany", "2", "Scotland", "1" },
                { "Poland", "2", "Germany", "0" },
                { "Germany", "1", "Ireland", "1" },
                { "Poland", "2", "Scotland", "2" },
                { "Scotland", "1", "Ireland", "0" },
                { "Ireland", "1", "Poland", "1" },
                { "Ireland", "1", "Scotland", "1" },
                { "Germany", "3", "Poland", "1" },
                { "Scotland", "2", "Germany", "3" },
                { "Ireland", "1", "Germany", "0" },
                { "Scotland", "2", "Poland", "2" },
                { "Poland", "2", "Ireland", "1" } };

        // Germany, Ireland, Poland and Scotland

        String[] teams = { "Germany", "Ireland", "Poland", "Scotland" };
        int[] scores = new int[teams.length];
        for (int i = 0; i < teams.length; i++) {
            scores[i] = 0;
            for (int j = 0; j < arr.length; j++) {
                if (teams[i].equals(arr[j][0]) == true) {
                    if(Integer.valueOf(arr[j][1]) > Integer.valueOf(arr[j][3]))
                        scores[i] = scores[i] + 3;
                    else if(Integer.valueOf(arr[j][1]) == Integer.valueOf(arr[j][3]))
                        scores[i] = scores[i] + 1;
                }
                if (teams[i].equals(arr[j][2]) == true) {
                    if(Integer.valueOf(arr[j][3]) > Integer.valueOf(arr[j][1]))
                        scores[i] = scores[i] + 3;
                    else if(Integer.valueOf(arr[j][3]) == Integer.valueOf(arr[j][1]))
                        scores[i] = scores[i] + 1;
                }
            }
        }

        System.out.println(Arrays.toString(scores));
    }
}

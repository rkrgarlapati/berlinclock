package com.ubs.opsit.interviews.service;

import com.ubs.opsit.interviews.constants.Constants;

import static com.ubs.opsit.interviews.constants.Constants.*;
import static com.ubs.opsit.interviews.utility.Utils.repeat;
import static com.ubs.opsit.interviews.utility.Utils.rightPadZeros;

public class MinutesService {


    /**
     * Converts the minutes into odd and even number
     * odd value goes to 4th row, even number goes to 3rd row.
     *
     * @param minutes
     * @return
     */
    public static String getMinutes(String minutes) {

        int min = Integer.valueOf(minutes);

        int mins1Y = min % 5; // gets the odd number, to display value at 4th row
        int mins5Y = min - mins1Y; // gets the even number, divisible of 15 and 5.

        StringBuilder sb = new StringBuilder();
        String min5Val = getMin(sb, mins5Y);

        String minValue = empty;

        minValue = rightPadZeros(min5Val, 11).concat(newline);
        minValue = minValue.concat(rightPadZeros(repeat(Y, mins1Y).toString(), 4));

        return minValue;
    }

    /**
     * It's a recursive method, keeps looping until the minutes values reaches to 0.
     *
     * @param sb
     * @param mins5Y
     * @return
     */
    public static String getMin(StringBuilder sb, int mins5Y) {

        if ((mins5Y >= const15) && (mins5Y % const15 == 0)) {
            int count = mins5Y / const15;
            sb.insert(0, repeat(Constants.MIN, count));
        } else {
            getSingleMin(sb, mins5Y);
        }

        return sb.toString();
    }

    /**
     * It's a utility method for minutes, which converts the Minutes to single min value.
     *
     * @param sb
     * @param mins5Y
     */
    public static void getSingleMin(StringBuilder sb, int mins5Y) {
        if (mins5Y >= 5) {
            sb.append(repeat(Y, 1));
            mins5Y = mins5Y - 5;
            getMin(sb, mins5Y);
        }
    }
}

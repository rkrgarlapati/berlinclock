package com.ubs.opsit.interviews.utility;

import com.ubs.opsit.interviews.constants.Constants;

import java.util.Collections;

public class Utils {

    /**
     * Splits the input time with ":"
     *
     * @param aTime
     * @return
     */
    public static String[] splitTime(String aTime) {
        return aTime.split(Constants.col);
    }

    /**
     * Repeats the 'val' for number of 'count' times.
     *
     * @param val
     * @param count
     * @return
     */
    public static String repeat(String val, int count) {
        return String.join("", Collections.nCopies(count, val));
    }

    /**
     * Padding to 'val' value to right until the String length reaches to 'count'.
     *
     * @param val
     * @param count
     * @return
     */
    public static String rightPadZeros(String val, int count) {
        return String.format("%-" + count + "s", val).replace(' ', 'O');
    }
}

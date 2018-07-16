package com.ubs.opsit.interviews.service;

import static com.ubs.opsit.interviews.constants.Constants.R;
import static com.ubs.opsit.interviews.constants.Constants.newline;
import static com.ubs.opsit.interviews.utility.Utils.repeat;
import static com.ubs.opsit.interviews.utility.Utils.rightPadZeros;

public class HoursService {

    /**
     * Converts the input hours to even number, and gets the odd hours out of it.
     *
     * @param hours
     * @return
     */
    public static String getHours(String hours) {

        int hrs = Integer.valueOf(hours);

        int hrs1R = hrs % 5; // gets the odd hours
        int hrs5R = (hrs - hrs1R) / 5; //get the even hours

        String val;

        val = rightPadZeros(repeat(R, hrs5R), 4).concat(newline);
        val = val.concat(rightPadZeros(repeat(R, hrs1R), 4));
        val = val.concat(newline);

        return val;
    }
}

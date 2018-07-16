package com.ubs.opsit.interviews.service;

import static com.ubs.opsit.interviews.constants.Constants.O;
import static com.ubs.opsit.interviews.constants.Constants.Y;
import static com.ubs.opsit.interviews.constants.Constants.newline;

public class SecondsService {

    /**
     * Check the sec to even or odd and returns the respective value.
     *
     * @param sec
     * @return
     */
    public static String getSeconds(String sec) {

        String tempsec = O;

        if (Integer.valueOf(sec) % 2 == 0) {
            tempsec = Y;
        }

        tempsec = tempsec.concat(newline);

        return tempsec;
    }

}

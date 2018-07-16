package com.ubs.opsit.interviews.validator;

import static com.ubs.opsit.interviews.constants.Constants.*;
import static com.ubs.opsit.interviews.utility.Utils.splitTime;

public class TimeValidate {

    /**
     * Validates the input time
     * Checks if hours, minutes and seconds are in valid time ranges.
     *
     * @param aTime
     * @return
     */
    public static boolean validateTime(String aTime) {
        if (aTime.length() != 8) {
            return false;
        }

        String[] splitTime = splitTime(aTime);
        if (splitTime.length == 3) {

            int hh = Integer.valueOf(splitTime[index0]);
            int mm = Integer.valueOf(splitTime[index1]);
            int ss = Integer.valueOf(splitTime[index2]);


            if (hh < zero || hh > hh24) {
                return false;
            }

            if (mm < zero || mm > t59) {
                return false;
            }

            if (ss < zero || ss > t59) {
                return false;
            }

            return true;

        } else {
            return false;
        }

    }


}

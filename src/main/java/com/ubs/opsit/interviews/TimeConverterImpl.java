package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.constants.Constants;
import com.ubs.opsit.interviews.service.HoursService;
import com.ubs.opsit.interviews.service.MinutesService;
import com.ubs.opsit.interviews.service.SecondsService;
import com.ubs.opsit.interviews.validator.TimeValidate;

import static com.ubs.opsit.interviews.constants.Constants.*;

public class TimeConverterImpl implements TimeConverter {

    @Override
    public String convertTime(String aTime) {

        if (TimeValidate.validateTime(aTime)) {

            String[] splitTime = aTime.split(Constants.col);

            StringBuilder val = new StringBuilder();

            val.append(SecondsService.getSeconds(splitTime[index2]));
            val.append(HoursService.getHours(splitTime[index0]));
            val.append(MinutesService.getMinutes(splitTime[index1]));

            return val.toString();
        } else {
            return "Invalid Time";
        }
    }
}

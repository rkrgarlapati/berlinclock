package com.ubs.opsit.interviews.unit;

import com.ubs.opsit.interviews.validator.TimeValidate;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TimeValidateTest {
    @Test
    public void validateTime(){
        assertFalse(TimeValidate.validateTime("59"));
        assertTrue(TimeValidate.validateTime("12:12:23"));
        assertFalse(TimeValidate.validateTime("44:22:11"));
        assertTrue(TimeValidate.validateTime("11:33:55"));
        assertFalse(TimeValidate.validateTime("00:77:00"));
    }
}

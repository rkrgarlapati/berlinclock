package com.ubs.opsit.interviews.unit;

import com.ubs.opsit.interviews.service.MinutesService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinutesServiceTest {

    @Test
    public void validateMinutes(){
        assertEquals(MinutesService.getMinutes("59"), "YYRYYRYYRYY\nYYYY");
        assertEquals(MinutesService.getMinutes("17"), "YYROOOOOOOO\nYYOO");
        assertEquals(MinutesService.getMinutes("23"), "YYRYOOOOOOO\nYYYO");
    }
}

package com.ubs.opsit.interviews.unit;

import com.ubs.opsit.interviews.service.HoursService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HoursServiceTest {

    @Test
    public void validateHours(){

        assertEquals(HoursService.getHours("11"), "RROO\nROOO\n");
        assertEquals(HoursService.getHours("05"), "ROOO\nOOOO\n");
        assertEquals(HoursService.getHours("24"), "RRRR\nRRRR\n");
    }
}

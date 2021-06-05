package com.ebenezerdiaz.adea.persistence.utils;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FechasUtilsTest {

    @Test
    public void test_isExpiredDate_true(){
        Date dateExpired = Date.from(LocalDate.now().plusMonths(1).plusDays(1).atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());

        assertEquals(true, FechasUtils.isExpiredDate(dateExpired));

    }

    @Test
    public void test_isExpiredDate_false(){
        Date dateExpired = Date.from(LocalDate.now().plusMonths(1).minusDays(1).atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());

        assertEquals(false, FechasUtils.isExpiredDate(dateExpired));

    }

    @Test
    public void test_isExpiredDate_equals_false(){
        Date dateExpired = Date.from(LocalDate.now().plusMonths(1).atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());

        assertEquals(false, FechasUtils.isExpiredDate(dateExpired));

    }

}
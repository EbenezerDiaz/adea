package com.ebenezerdiaz.adea.persistence.utils;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Date;

public class FechasUtils {

    private static Instant dateExpired = ZonedDateTime.now().plusMonths(1).toInstant();

    public static boolean isExpiredDate(Date date){
        return dateExpired.isBefore(date.toInstant());
    }
}

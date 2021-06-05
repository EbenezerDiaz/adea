package com.ebenezerdiaz.adea.persistence.utils;

import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilsTest {

    @Test
    public void test_encoding_password() throws NoSuchAlgorithmException {

        String strValue = "hello world";
        String strEncript = "Yjk0ZDI3Yjk5MzRkM2UwOGE1MmU1MmQ3ZGE3ZGFiZmFjNDg0ZWZlMzdhNTM4MGVlOTA4OGY3YWNlMmVmY2RlOQ==";

        assertEquals(strEncript,PasswordUtils.encodingString(strValue)) ;
    }

    @Test
    public void test_matcher_password() throws NoSuchAlgorithmException {
        String strValue = "hello world";
        String strEncript = "Yjk0ZDI3Yjk5MzRkM2UwOGE1MmU1MmQ3ZGE3ZGFiZmFjNDg0ZWZlMzdhNTM4MGVlOTA4OGY3YWNlMmVmY2RlOQ==";
        assertSame(true,PasswordUtils.matcherPassword(strValue,strEncript));
    }

}
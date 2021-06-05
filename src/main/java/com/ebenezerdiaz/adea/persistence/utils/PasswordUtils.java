package com.ebenezerdiaz.adea.persistence.utils;


import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PasswordUtils {

    public static String encodingString (String input) throws NoSuchAlgorithmException {
         MessageDigest md = MessageDigest.getInstance("SHA-256");

         byte[] hash = md.digest(input.getBytes(StandardCharsets.UTF_8));

         BigInteger number = new BigInteger(1, hash);
         StringBuilder hexString = new StringBuilder(number.toString(16));

        // Pad with leading zeros
        while (hexString.length() < 32)
        {
            hexString.insert(0, '0');
        }

        return Base64.getEncoder().encodeToString(hexString.toString().getBytes());
    }

    public static boolean matcherPassword(String value, String hash) throws NoSuchAlgorithmException {

        return hash.equals(encodingString(value));
    }
}

package com.javaclasses.encryptor;


import com.javaclasses.encryptor.impl.TextEncryptorImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TextEncryptorImplTest {


    @Test
    public void testCase1Encryption() {

        final TextEncryptor encryptor = new TextEncryptorImpl();

        final String case1 = "have a nice day";

        final String expectedResult = "hae and via ecy";

        assertEquals("Text was not encrypted right", expectedResult , encryptor.execute(case1));

    }

    @Test
    public void testCase2Encryption() {

        final TextEncryptor encryptor = new TextEncryptorImpl();

        final String case2 = "feed the dog";

        final String expectedResult = "fto ehg ee dd";

        assertEquals("Text was not encrypted right", expectedResult , encryptor.execute(case2));

    }

    @Test
    public void testCase3Encryption() {

        final TextEncryptor encryptor = new TextEncryptorImpl();

        final String case3 = "chillout";

        final String expectedResult = "clu hlt io";

        assertEquals("Text was not encrypted right", expectedResult , encryptor.execute(case3));

    }


    @Test
    public void testCase4Encryption() {

        final TextEncryptor encryptor = new TextEncryptorImpl();

        final String case4 = "if man was meant to stay on the ground god would have given us roots";

        final String expectedResult = "imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau";

        assertEquals("Text was not encrypted right", expectedResult , encryptor.execute(case4));

    }

    @Test
    public void testNullInput() {

        final TextEncryptor encryptor = new TextEncryptorImpl();

        try {
            encryptor.execute(null);
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            assertEquals("Input should not be null", e.getMessage());
        }

    }

    @Test
    public void testEmptyInput() {

        final TextEncryptor encryptor = new TextEncryptorImpl();

        try {
            encryptor.execute(" ");
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            assertEquals("Input should contain text", e.getMessage());
        }

    }
}

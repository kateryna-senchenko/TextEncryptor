package com.javaclasses.encryptor;

/**
 * Public API for Text Encryptor
 */
public interface TextEncryptor {

    /**
     * performs text encryption
     * @param text - text to be encrypted
     * @return encrypted text
     */
    String execute (String text);
}

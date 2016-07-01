package com.javaclasses.encryptor;

/**
 * Public API for Text Encryptor
 */
public interface TextEncryptor {

    /**
     * @param text - text to be encrypted
     * @return encrypted text
     */
    String execute (String text);
}

package tests;

import codecracker.CodeCracker;
import org.junit.Test;

import static org.junit.Assert.*;

public class CodeCrackerTest {
    CodeCracker cd = new CodeCracker();
    @Test
    public void encrypt() {

        assertEquals("babe",cd.encrypt("mlmp"));
    }

    @Test
    public void decrypt() {
        assertEquals("mlmp",cd.decrypt("babe"));
    }
}
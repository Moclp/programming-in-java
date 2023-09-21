package agh.ii.prinjava.lab01.lst01_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RichDadTest {


    @Test
    public void testGetName() {
        RichDad richDad = new RichDad("Moise", "CLIPAL", new BigDecimal("1000000"), new ArrayList<>());
        String result = richDad.getName();
        assertEquals("Moise", result);
    }

    @Test
    public void testGetSurname() {
        RichDad richDad = new RichDad("Moise", "CLIPAL", new BigDecimal("1000000"), new ArrayList<>());
        String result = richDad.getSurname();
        assertEquals("CLIPAL", result);
    }

    @Test
    public void testGetContacts() {
        List<String> contacts = Arrays.asList("contact1", "contact2", "contact3");
        RichDad richDad = new RichDad("Moise", "CLIPAL", new BigDecimal("1000000"), contacts);
        List<String> result = richDad.getContacts();
        assertEquals(contacts, result);
    }

    @Test
    public void testGetFortune() {
        RichDad richDad = new RichDad("Moise", "CLIPAL", new BigDecimal("1000000"), new ArrayList<>());
        BigDecimal result = richDad.getFortune();
        assertEquals(new BigDecimal("1000000"), result);
    }

    @Test
    public void testIncreaseWealth() {
        RichDad richDad = new RichDad("Moise.", "CLIPAL", new BigDecimal("1000000"), new ArrayList<>());
        BigDecimal initialFortune = richDad.getFortune();
        richDad.increaseWealth();
        BigDecimal newFortune = richDad.getFortune();
        assertEquals(initialFortune.add(BigDecimal.ONE), newFortune);
    }
}

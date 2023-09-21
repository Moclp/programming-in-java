package agh.ii.prinjava.lab01.lst01_02;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RichDadsKidTest {




    @Test
    public void testNewSkill1() {
        RichDadsKid richDadsKid = new RichDadsKid("Moise", "CLIPAL", new BigDecimal("2000000"), new ArrayList<>());
        richDadsKid.newSkill1();
    }

    @Test
    public void testNewSkill2() {
        RichDadsKid richDadsKid = new RichDadsKid("Moise", "CLIPAL", new BigDecimal("2000000"), new ArrayList<>());
        richDadsKid.newSkill2();
    }

}
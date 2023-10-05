package Excersise9;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class TestExcersise {
     class TestExcersise {

        String text = "Some Text";
        int actual = text.length();
        int expected = 9;


        public void firstTestCase() {
            assertEquals(expected, actual);
        }
    }
}

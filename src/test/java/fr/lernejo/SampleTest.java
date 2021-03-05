package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op() {
        Sample s = new Sample();
        Assertions.assertEquals(5, s.op(Sample.Operation.ADD, 2, 3));
        Assertions.assertEquals(6, s.op(Sample.Operation.MULT, 2, 3));
    }
}

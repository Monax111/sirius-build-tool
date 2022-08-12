package ru.tinkoff.sirius.build.tools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoTest {

    @Test
    public void demo() {
        Assertions.assertEquals(1 + 1, 2);
    }

    @Test
    public void contextUp() {
        BestProcess.main(new String[]{});
    }
}

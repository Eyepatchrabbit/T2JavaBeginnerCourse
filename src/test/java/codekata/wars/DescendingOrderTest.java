package codekata.wars;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescendingOrderTest {

    @Ignore
    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Ignore
    @Test
    public void test_02() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }

    @Ignore
    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }
}

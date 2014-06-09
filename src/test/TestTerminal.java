package test;

import main.PointOfSaleTerminal;
import org.junit.*;

import java.math.BigDecimal;


public class TestTerminal extends Assert{

    PointOfSaleTerminal pointOfSaleTerminal = new PointOfSaleTerminal();


    @Test
    public void testTotalPrice1() {
        pointOfSaleTerminal.setPrising("ABCDABA");
        pointOfSaleTerminal.scan("A");
        pointOfSaleTerminal.scan("B");
        pointOfSaleTerminal.scan("C");
        pointOfSaleTerminal.scan("D");
        BigDecimal total = pointOfSaleTerminal.calculateTotal();
        assertEquals(total, new BigDecimal(13.25));
    }
    @Test
    public void testTotalPrice2() {
        pointOfSaleTerminal.setPrising("CCCCCCC");
        pointOfSaleTerminal.scan("A");
        pointOfSaleTerminal.scan("B");
        pointOfSaleTerminal.scan("C");
        pointOfSaleTerminal.scan("D");
        BigDecimal total = pointOfSaleTerminal.calculateTotal();
        assertEquals(total, new BigDecimal(6.0));
    }
    @Test
    public void testTotalPrice3() {
        pointOfSaleTerminal.setPrising("ABCD");
        pointOfSaleTerminal.scan("A");
        pointOfSaleTerminal.scan("B");
        pointOfSaleTerminal.scan("C");
        pointOfSaleTerminal.scan("D");
        BigDecimal total = pointOfSaleTerminal.calculateTotal();
        assertEquals(total, new BigDecimal(7.25));
    }
}

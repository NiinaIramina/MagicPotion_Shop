package jp.ac.uryukyu.ie.e245728;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ITest {
    @Test
    void recordTest(){
        Inventory rt = new Inventory();
        int m = 100;
        rt.record(m);

        assertEquals(0+m, rt.getSales());
        assertEquals(300+m, rt.getFunds());
    }
}
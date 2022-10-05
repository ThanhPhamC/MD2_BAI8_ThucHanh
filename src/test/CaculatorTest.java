package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaculatorTest {
    @Test
    public void testCalatorAdd(){
        int firstnumber=1;
        int secondnumber=1;
        // gia tri mong muon duoc sau khi thuc hien phuong thuc add
        int expected=2;
        // chuc nang thuc hien cua phuong thuc add
        int result=firstnumber+secondnumber;
        assertEquals(expected,result);
    }
}

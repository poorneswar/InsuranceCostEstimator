/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author prudvi
 */
public class InsuranceTest {
    
    public InsuranceTest() {
    }

    @Test
    public void testInsurances() throws Exception {
        System.out.println("Insurances");
        Integer age = 33;
        Integer expResult = 465;
        Integer result = Insurance.Insurances(age);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testThatExceptionThrown() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            Insurance.Insurances(2);
        });
    }

    
    
}

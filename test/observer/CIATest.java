/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;

import junit.framework.TestCase;

/**
 *
 * @author Daddy
 */
public class CIATest extends TestCase {
    
    public CIATest(String testName) {
        super(testName);
    }

    /**
     * Test of Update method, of class CIA.
     */
    public void testUpdate() {
        System.out.println("Update");
        int a = 0;
        int b = 0;
        CIA instance = new CIA();
        instance.Update(a, b);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

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
public class KGBTest extends TestCase {
    
    public KGBTest(String testName) {
        super(testName);
    }

    /**
     * Test of Update method, of class KGB.
     */
    public void testUpdate() {
        System.out.println("Update");
        int a = 45;
        int b = 64;
        KGB instance = new KGB();
        instance.Update(a, b);
        
    }
    
}

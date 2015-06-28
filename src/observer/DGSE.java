/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Dr Hoffman
 */
public class DGSE implements MyObserver {
    public void Update(int a, int b){
        System.out.println("DGSE knows you are at " + a + " " + b);
        
    }
}

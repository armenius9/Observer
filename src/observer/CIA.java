/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Dr Hoffman
 */
public class CIA implements MyObserver {
    public void Update(int a, int b){
            System.out.println("CIA is closed for lunch.");
    }
}

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
    int count = 0;
    public void Update(int a, int b){
            if(count==0)
                System.out.println("CIA is closed for lunch.");
            else
                System.out.println("CIA still closed for lunch. Our tax $$$ at work!");
            count++;
    }
}

package observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daddy
 */
public class KGB implements MyObserver {
    public void Update(int a, int b){
        System.out.print("KGB knows you are at " + a + " " + b);
        System.out.println(". We are coming for you!");
    }
}

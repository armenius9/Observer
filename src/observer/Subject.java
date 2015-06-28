/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;
import java.util.ArrayList;
/**
 *
 * @author Dr Hoffman
 */
public class Subject {
    int x, y;
    
    public Subject(int w,int e)
        { x = w; y = e;}
    ArrayList <MyObserver>  list = new ArrayList<MyObserver>();
    public void Add(MyObserver m){
        list.add(m);
    }
    public void Remove(MyObserver m){
        list.remove(m);
    }
    private void Notify(){
        for( MyObserver m :list){
            m.Update(x,y);
        }
    }
    public void ChangeTheSubject(int a, int b){
        x=a;
        y=b;
        Notify();
    }
    public void HereIAm(){
        System.out.println("Subject is at " + x + "," + y);
    }
}

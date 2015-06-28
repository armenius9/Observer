/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Dr Hoffman
 */
public class NSA implements MyObserver {
    class coords {
        int x=0, y=0;
        private void AddToLast(int a, int b){
            x = x + a;
            y = y + b;
        }
        private void ReportTotal(){
            System.out.println("Total movement..."+ x + ","+y);
        }
    }
    coords c = new coords();
    public void Update(int q, int w){
        System.out.println("NSA informed subject now at " + q + ","+w);
        c.AddToLast(q, w);
    }
    public void AskForReportTotal(){
       c.ReportTotal();
    }
}

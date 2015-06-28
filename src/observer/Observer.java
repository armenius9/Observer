/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Dr Hoffman
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subject s = new Subject(5,6);
        s.HereIAm();
        NSA nsa = new NSA();
        s.Add((MyObserver)nsa);
        s.ChangeTheSubject(7,11);
        CIA cia = new CIA();
        s.Add(cia);
        
        DGSE dgse = new DGSE();
        s.Add(dgse);
        s.ChangeTheSubject(45,67);
       // nsa.AskForReportTotal();
    }
}

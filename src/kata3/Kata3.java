/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author Entrar
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Histogram<String> histogram= new Histogram<String>();
        for (int i=0;i<100;i++) {
            histogram.increment("ulpgc.es");
            histogram.increment("ulpgc.es");
            histogram.increment("hotmail.com");
        }
        HistogramDisplay histo= new HistogramDisplay(histogram);
        histo.execute();
    }
    
}

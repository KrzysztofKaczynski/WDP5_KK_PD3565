/**
 *
 *  @author Kaczyński Krzysztof PD3565
 *
 */

package zad1;


public class Main {

  public static void main(String[] args) throws InterruptedException {
    Letters letters = new Letters("ABCD");
    for (Thread t : letters.getThreads()) System.out.println(t.getName());
    /*<- tu uruchomić 
         wszystkie kody w wątkach 
     */
    for (Thread t : letters.threads) {
      t.start();
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {

        e.printStackTrace();
      }
    }
    Thread.sleep(5000);
    for (Thread t : letters.threads){
      letters.done();
    }
    /*<- tu trzeba zapisać
       fragment, który kończy działanie kodów, wypisujących litery 
    */
    System.out.println("\nProgram skończył działanie");
  }

}

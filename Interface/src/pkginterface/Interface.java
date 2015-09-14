/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Chayan_pc
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // MyClass m=new MyClass();
        Mytest m=new Mytest(4,3);
       
          m.fun();
        m.fun2();    
        m.fun3();
       
         m.print();
         m.fun4();
    }
}

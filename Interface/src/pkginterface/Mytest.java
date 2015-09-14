/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Chayan_pc
 */
public class Mytest implements JavaInterface{
    int a;
    int b;
    int r;        
    public Mytest(int x, int y){
        a=x;
        this.b=y;
        r=a+b;
    
    }

    @Override
    public void fun() {
      
        System.out.println("this is interface 1  "+r);
        
    }
  

    @Override
    public void fun2() {
        System.out.println("this is interface 2  "+r);
    }

    @Override
    public int fun3() {
          r+=5;
       System.out.println("this is interface 3  "+r);
       return r;
    }
    
      void print()
    {
        System.out.println("fun()is="+r);
    }
}

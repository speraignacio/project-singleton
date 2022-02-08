package com.nttdata.singleton;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Singleton ejemplo = Singleton.getInstance();
        System.out.println(ejemplo);
        
        Singleton ejemplo1 = Singleton.getInstance();
        System.out.println(ejemplo1);
        
        
    }
}

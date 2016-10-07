package com.realdolmen.gettit;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	ArrayList<Animal> a = new ArrayList<Animal>();
    	Animal b = new Animal();
    	b.legs = 4;
    	b.name = "Lion";
    	a.add(b);
    	b.legs = 8;
    	b.name = "Spider";
    	a.add(b);
        System.out.println( "Welcome to out circus with the magnificent animals, we got:" );
        
        for(int i = 0; i < a.size(); ++i){
        	System.out.println( a.get(i).name );
        }
        
    }
    
    
    
    
}

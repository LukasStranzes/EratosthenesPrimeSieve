/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3b.lstranzinger18.EratosthenesPrime;

/**
 *
 * @author lukas
 */
public class EratosthenesPrimeSieve implements PrimeSieve{

    int primeCeiling;
    boolean[] numbers;
    public EratosthenesPrimeSieve(int ceiling) {
    
        this.primeCeiling = ceiling;
        this.numbers = new boolean[primeCeiling];
       
    }
 @Override
    public boolean isPrime(int p) {
        // geh das Array durch und nimm an das jede zahl eine Prime ist
        this.numbers[0] = false;
     

        for (int k = 2; k < this.primeCeiling; k++) {
            numbers[k] = true;
            
            
        }
        
        // schau bei jeder zahl größer 2 ob sie eine Prime ist
        for (int i = 2; i < this.primeCeiling; i++) {
            if(numbers[i] == true)
            {
                for (int j = i*i; j < this.primeCeiling; j += i) {
                    numbers[j] = false;
                    
                    
                }     }
            
        }
        if(numbers[p] == true)
        {
            
        return true;
        
        }
        else{
           
        return false;
        }
        
        
    }

    @Override
    public void printPrimes() {
        
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == true)
            {
                System.out.println(i);
            }
            
        }
        
    }
    
    
    public void primeSumFinder(int o)
    {
    
    int[] summen = new int[o];
    
    for (int i = 2; i <= (o/2); i++) {
              
            summen[i] = i*2;
           
        }
    
    
        for (int i : summen) {
            int x = 0;
            int y = 0;
            for (int j = 2; j < i; j++) {
                if(isPrime(j) == true)
                {
                    x = j;
                    for (int k = 2; k < i; k++) {
                  if(isPrime(k)== true && (k + x) == i)
                  {
                  y = k;
                  break;
                  }
                    
                }
                
                   
                }
                if(x+y == i)
                {
                   System.out.println(i + "summe:" + i + " = " + x + " + " + y ); 
                   break;
            }
                
            }
            
                
             
                
            }
            
        }
    
   
    }

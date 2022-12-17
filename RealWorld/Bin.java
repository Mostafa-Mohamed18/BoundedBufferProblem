package RealWorldApp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;


public class Bin {
    
    public static final int BUFFER_SIZE = 7;
    private final Semaphore mutex;
    private final Semaphore empty;
    private final Semaphore full;
    Queue<Integer> buffer;
  
    
    
    
    public Bin() {
        this.buffer = new LinkedList<>();
        
        mutex = new Semaphore(1);
        full = new Semaphore(BUFFER_SIZE);
        empty = new Semaphore(0);       
    }
    
     int i=1;
     
     
      public void put(){
         while(true){ 
        
              if(buffer.size()<BUFFER_SIZE){
            try{
            
             full.acquire();
             mutex.acquire();
        // add an item to the buffer
        
            buffer.add(i);
           
            System.out.println("Bin still not full "+ Thread.currentThread().getName()  +" burger added"+" "+i+"." );
            System.out.println("Number of burgers in bin = "+buffer.size());
            i++;
           
            mutex.release();
            empty.release();
                }
                
            
            
            
            catch(InterruptedException e){
                  System.out.println("Process get interrupted");
     

              }
              }
              else{
            System.out.println("Bin is Full");
        }
        }
        
        
        
        }
              
      
          
       public int get() {
          
        
        while(true){  
            if(buffer.size()>=1){
            try{
        empty.acquire();
        mutex.acquire();
        
        int item = buffer.remove();
        
        System.out.println(Thread.currentThread().getName() + " buy a burger.. "+item);
        
        mutex.release();
        full.release();
        
        //return item;
        }
            catch(InterruptedException e){
                  System.out.println("Process get interrupted");
     

              }
            }
            else{
            System.out.println("Bin is Empty");
        }
            
        }
        
        
            }
       
        } 
    
    


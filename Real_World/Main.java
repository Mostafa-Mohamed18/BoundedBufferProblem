package RealWorldApp;
 



public class main {
    
    
    public static void main(String[] args) throws InterruptedException {
       
        
        
        Bin  bufer = new Bin();
        Cooker produce = new Cooker(bufer);
        Customer consume = new Customer(bufer);
        // now create the producer and consumer threads
        Thread producer = new Thread(produce);
        producer.setName("cheif1");
        Thread consumer = new Thread(consume);
        consumer.setName("Customer");
        Thread producer2 = new Thread(produce);
        producer2.setName("cheif2");
        Thread consumer2 = new Thread(consume);
        consumer2.setName("Customer");
        Thread consumer3 = new Thread(consume);
        consumer3.setName("Customer");

        
       
        producer.start();

        consumer.start();

        producer2.start();
        
        consumer2.start();
        
        consumer3.start();
        
        
        producer.join();
        consumer.join();
        producer2.join();
        consumer2.join();
        consumer3.join();
    }
}


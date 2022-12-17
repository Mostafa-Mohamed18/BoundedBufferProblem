package WhithOut_RealWorld;




public class Main {
    public static void main(String[] args) throws InterruptedException {
        Buffer  bufer = new Buffer();
        Producer produce = new Producer(bufer);
        Consumer consume = new Consumer(bufer);

        Thread producer = new Thread(produce);

        Thread consumer = new Thread(consume);

        Thread producer2 = new Thread(produce);

        Thread consumer2 = new Thread(consume);

        Thread consumer3 = new Thread(consume);


        
       
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

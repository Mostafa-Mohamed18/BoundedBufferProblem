package RealWorldApp;




public class Customer implements Runnable {
	private final Bin buffer;
        
	public Customer(Bin buffer) {
		this.buffer = buffer;
	}

        @Override
	public void run() {
        
            while (true) {
            
            // consume an item from the buffer
            buffer.get();
           	 
		}
               
	}
        }

        

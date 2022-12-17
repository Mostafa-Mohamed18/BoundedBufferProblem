package WhithOut_RealWorld;



class Consumer implements Runnable{
    private final Buffer buffer;
        
	public Consumer(Buffer buffer) {
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
package WhithOut_RealWorld;



class Producer implements Runnable{
    private final Buffer buffer;

	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
         
        Integer numbers[] = {1,2,3,4,5};
         @Override
	public void run() {
		
			
            while(true){
            // producer put items
                                      
               buffer.put();
                                      
                                      
                                      
     }                                
                       
         }
}
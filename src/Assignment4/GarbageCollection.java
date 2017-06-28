package Assignment4;

/*In this program I've written a program in Java to show 
 -how the unreferenced object are collected by the Garbage Collector.
 
 *Garbage collection is performed by a daemon thread called Garbage 
 -Collector(GC). This thread calls the finalize() 
 -method before object is garbage collected.*/

public class GarbageCollection { // class

	public static void main(String[] args) {// main method
		
		GarbageCollection g1= new GarbageCollection();//Object One
		GarbageCollection g2= new GarbageCollection();//Object Two
		
		g1= null; // unreferenced by nulling the reference
		g2=null; // unreferenced by nulling the reference
		
		//The gc() method is used to invoke the garbage collector to perform cleanup processing.
		System.gc();
	}	
		
	//The finalize() method is invoked each time before the object is garbage collected.
		public void finalize(){
			System.out.println("object is garbage collected");
		

	}

}

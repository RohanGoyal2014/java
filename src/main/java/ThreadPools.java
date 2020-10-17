import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPools {

	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.submit(new Runnable() {
			
			public void run() {
				System.out.println("Done");
				try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		es.shutdown();
		es.awaitTermination(1, TimeUnit.SECONDS);
		System.out.println("Completed");
	}
	
}

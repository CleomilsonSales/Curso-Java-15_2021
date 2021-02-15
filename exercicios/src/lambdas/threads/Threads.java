package lambdas.threads;

public class Threads {
	public static void main(String[] args) {
		//forma no java 8
		Runnable trabalho1 = new Trabalho1();
		//outra forma
		Runnable trabalho2 = new Runnable() {
			
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Trabalho #02");
					try {
						Thread.sleep(100);
					}catch (Exception e) {
					}
				}
			}
		};
		
		//com lambda
		Runnable trabalho3 = Threads::trabalho3;
		
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	static void trabalho3 () {
		for (int i = 0; i < 10; i++) {
			System.out.println("Trabalho #03");
			try {
				Thread.sleep(100);
			}catch (Exception e) {
			}
		}
	}
}

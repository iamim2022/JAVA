package basic;

public class S5_Thread_setPriority {
	public static void main(String[] args) {
		Thread thread1 = new MutiThreadTest("[ Thread " + 1 + " ]");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		Thread thread2 = new MutiThreadTest("[ Thread " + 2 + " ]");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.start();
	}
}

class MutiThreadTest extends Thread {
	public MutiThreadTest(String threadName) {
		this.setName(threadName);
	}

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.getName() + " Thread_Start");
	}
}


/*
<output>
[ Thread 1 ] Thread_Start
[ Thread 2 ] Thread_Start
*/
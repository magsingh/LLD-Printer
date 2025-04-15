package printer;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	private int floorNo;
	private Queue<PrintJob> printerQueue;

	public Printer(int fNo) {
		this.floorNo = fNo;
		printerQueue = new LinkedList<>();
	}
	
	public void addJob(PrintJob j) {
		printerQueue.offer(j);
		System.out.println("Job added: floor no. " + j.getFloorNo());
	}

	public void processNextJob() {
		if (printerQueue.isEmpty()) {
			System.out.println("Printing job: No job in queue");
		}
		while (!printerQueue.isEmpty()) {
			PrintJob job = printerQueue.poll();
			System.out.println("Printing job: " + job.getDoc() + " floor = " + job.getFloorNo());
		}
	}
}

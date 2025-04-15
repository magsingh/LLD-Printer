package printer;

import java.util.HashMap;

public class PrintManager {
	HashMap<Integer, Printer> printers;
	public PrintManager(int totalFloors) {
		printers = new HashMap<>();
		for (int i = 1; i <= totalFloors; i++) {
			Printer p = new Printer(i);
			printers.put(i, p);
		}
	}
	public void printJob(PrintJob j) {
		int fNo = j.getFloorNo();
		if (printers.containsKey(fNo)) printers.get(fNo).addJob(j);
		else System.out.println("No printer found for floor " + fNo);
	}
	public void processAllJobs() {
		for (Printer p: printers.values()) {
			p.processNextJob();
		}
	}

}

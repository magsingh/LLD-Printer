package printer;

public class PrinterSol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		PrintManager pMgr = new PrintManager(5);
		
		PrintJob j1 = new PrintJob("Document1", 1);
		PrintJob j2 = new PrintJob("Document2", 2);
		PrintJob j3 = new PrintJob("Document3", 3);
		PrintJob j4 = new PrintJob("Document4", 1);
		PrintJob j5 = new PrintJob("Document5", 5);
//		j1.showPrintJob();
		pMgr.printJob(j1);
		pMgr.printJob(j2);
		pMgr.printJob(j3);
		pMgr.printJob(j4);
		pMgr.printJob(j5);
		
		pMgr.processAllJobs();
	}

}

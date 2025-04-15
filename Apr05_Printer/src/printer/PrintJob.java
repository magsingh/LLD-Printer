package printer;

public class PrintJob {
	private String document;
	private int floorNo;
	PrintJob(String doc, int fNo) {
		this.document = doc;
		this.floorNo = fNo;
	}
	
	public String getDoc() {
		return document;
	}
	
	public int getFloorNo() {
		return floorNo;
	}
	
	public void showPrintJob() {
		System.out.println("Doc = " + document + " Floor no = " + floorNo);
	}

}

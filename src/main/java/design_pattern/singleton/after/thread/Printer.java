package design_pattern.singleton.after.thread;

public class Printer {
//	private static Printer printer = new Printer();
	private static Printer printer = null;
	private int count;
	
//	public static Printer getPrinter() {
	public synchronized static Printer getPrinter() {
		if (printer == null){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			printer = new Printer();
		}
		return printer;
	}

	private Printer() {}
	
	public synchronized void print(String str){
		count++;
		System.out.println(str + " : " +count);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
	}
}

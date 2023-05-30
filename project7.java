package Tarun;

class MultiTasking extends Thread{
	
	public void run() {
		for(int i=1;i<11;i++) {
			if(i%2!=0) {
			System.out.println(i);
			}
		}
	}
}
public class project7 {
	public static void main(String[] args) {
		MultiTasking mt=new MultiTasking();
		mt.start();
		for(int i=1;i<11;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}

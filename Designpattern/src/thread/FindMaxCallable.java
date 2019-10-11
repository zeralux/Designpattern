package thread;

import java.util.concurrent.Callable;


public class FindMaxCallable<Integer> implements Callable {
	private int[] data;
	private int start;
	private int end;
	
	public FindMaxCallable(int[] data ,int start,int end){
		this.data=data;
		this.start=start;
		this.end=end;
	}
	
	public java.lang.Integer call() {
		int max = java.lang.Integer.MIN_VALUE;
		for(int i=start;i<end;i++) {
			max = Math.max(max, data[i]);
		}
		return max;	
	}
	
}

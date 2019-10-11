package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Main {
	
	/*
	 * 	多執行續問題
	 * 	死結: 兩個執行續互相等待對方手上資源的獨佔權,導致無法繼續執行
	 * 	競爭狀態:多執行續互相爭速
	 * 
	 * 	多執行續解決辦法
	 * 	Polling缺點為浪費時間
	 * 	callback缺點為無法取得結果
	 * 
	 * 	建立執行續
	 * 	Thread類別: extends後實作run()
	 * 	Runnable介面: implements後實作run()
	 * 	Future、Callable、 : Executor 可拋錯 可回傳結果
	 * 
	 *  
	 * */
    public static void main(String[] args) {
    	int[] data = {1,2,3,4,5,6,7,8};
    	Callable task1 = new FindMaxCallable(data, 0, data.length/2);
    	Callable task2 = new FindMaxCallable(data, data.length/2, data.length);
    	java.util.concurrent.ExecutorService service = java.util.concurrent.Executors.newFixedThreadPool(2);
    	Future<Integer> future1 = service.submit(task1);
    	Future<Integer> future2 = service.submit(task2);
    	try {
			int max = Math.max(future1.get(),future2.get());
			System.out.println(max);
		} catch (InterruptedException | ExecutionException e) {
			
		}
    	
    }
}
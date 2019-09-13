package com;
//Threading using thread class extend
public class MultithreadingSample extends Thread {

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + "is running.");
	}
	
	public static void main(String [] args){

		MultithreadingSample obj = new MultithreadingSample();
		obj.start();
	}
}

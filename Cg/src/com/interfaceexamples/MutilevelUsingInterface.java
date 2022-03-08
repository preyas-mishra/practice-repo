package com.interfaceexamples;

interface HPMonitor{
	void work();
}

interface DellMonitor extends HPMonitor{
	void checkCondition();
} 


public class MutilevelUsingInterface implements DellMonitor{
	public void work() {
		System.out.println("HPMonitor is working");
	}
	public void checkCondition() {
		System.out.println("Dell Monitor is working");
	}
	public static void main(String[] args) {
		MutilevelUsingInterface multilevel = new MutilevelUsingInterface();
		multilevel.work();
		multilevel.checkCondition();

	}

}

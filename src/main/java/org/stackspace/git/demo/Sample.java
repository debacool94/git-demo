package org.stackspace.git.demo;

public class Sample {
	public void m1() {
		System.out.println("in m1");
	}
	public void addData(String data) {
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("we added one data to the phase2 branch");
		}
	}

}

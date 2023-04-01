package com.genericmethod;

import org.testng.IRetryAnalyzer;

import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
int count=0;
int max=1;

	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess()) {
			if(count<(max)) {
				count++;
				result.setStatus(ITestResult.FAILURE);
			return true;
			}
		else {
			result.setStatus(ITestResult.FAILURE);
		}
		}else {
			result.setStatus(ITestResult.FAILURE);
		}
		return false;
	}

}

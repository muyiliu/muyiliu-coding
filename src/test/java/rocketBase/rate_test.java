package rocketBase;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import exceptions.RateException;
import rocketData.LoanRequest;

public class rate_test {

	@BeforeClass
	public static void BeforeClass(){
	LoanRequest LRQ = new LoanRequest();
	}
	//DONE - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	@Test
	public void creditTest1(LoanRequest LRQ) {
		LRQ.setiCreditScore(500);
		assert(LRQ.getdRate() == 4);
	}
	@Test
	public void creditTest2(LoanRequest LRQ) {
		LRQ.setiCreditScore(600);
		assert(LRQ.getdRate() == 5);
	}

	
	//DONE - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test
	public void RateExceptionTest(LoanRequest LRQ) {
		try{
			LRQ.setiCreditScore(500);
			fail("Not avaible ");
		}
		catch(Exception REX){
			assertTrue(REX.getClass() == RateException.class);
		}
	}

}
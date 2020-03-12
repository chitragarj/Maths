import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MathsUtilTest {

	int [] inputArray = new int[100];
	MathsUtil util = new MathsUtil();
	@Before
	public void setUp() throws Exception {		
		for (int i=0;i < 100;++i){
			inputArray[i]=i+1;
			}
	}

	@Test
	public void testFormultiplesOf3n5() {
		boolean result = false;
		MathsUtil util = new MathsUtil();		
		for(String s : util.mathsTestmultiple3n5(100)) {
			if(!(s.contains("Fizz") || s.contains("Buzz"))) {
				int i = Integer.parseInt(s);
				if(i%3 == 0 || i%5 == 0) {
					result = false;
				}
				else
					result = true;
			}
			
		}
		assert(result);
	}
	
	@Test
	public void testFizzBuzz() {
		boolean result = false;
		ArrayList<String> output = util.mathsTestmultiple3n5(100);	
		for(String s : output) {			
			if(s.contains("FizzBuzz")) {
				int i = output.indexOf(s) + 1;
				if((i%3 == 0 && i%5 == 0)) {
					result = true;
				}
				else
					result = false;
			}
			
		}
		assert(result);
			
	}
	@Test
	public void testlengthOfOutput() {
		ArrayList<String> output = util.mathsTestmultiple3n5(100);
		assert(inputArray.length == output.size());
			
	}

	@Test
	public void testFormultiplesOf3n5Stage2() {
		boolean result = false;
		MathsUtil util = new MathsUtil();		
		for(String s : util.mathsTestmultiple3n5Stage2(100)) {
			if(!(s.contains("Fizz") || s.contains("Buzz"))) {
				int i = Integer.parseInt(s);
				if(i%3 == 0 || Integer.toString(i).contains("3") || i%5 == 0 || Integer.toString(i).contains("5")) {

				}
				else
					result = true;
			}
			
		}
		assert(result);
	}
	
	@Test
	public void testFizzBuzzStage2() {
		boolean result = false;
		ArrayList<String> output = util.mathsTestmultiple3n5(100);	
		for(String s : output) {			
			if(s.contains("FizzBuzz")) {
				int i = output.indexOf(s) + 1;
				if((i%3 == 0 || Integer.toString(i).contains("3")) && (i%5 == 0 || Integer.toString(i).contains("5"))) {
					result = true;
				}
			}
			
		}
		assert(result);
			
	}
	@Test
	public void testFizzBuzzStage2inputlt0() {
		ArrayList<String> output = util.mathsTestmultiple3n5(0);	
		assertTrue(output.size() == 1);
		assertEquals(output.get(0), "Error : Please enter value greater than 0");
	}
	
	@Test
	public void testFizzBuzzStage2inputlt0Stage2() {
		ArrayList<String> output = util.mathsTestmultiple3n5Stage2(0);	
		assertTrue(output.size() == 1);
		assertEquals(output.get(0), "Error : Please enter value greater than 0");
			
	}
}

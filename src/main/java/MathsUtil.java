import java.util.ArrayList;
import java.util.stream.IntStream;

public class MathsUtil {

	public static void main(String[] args) {		
		int [] inputArray = new int[100];
		for (int i=0;i < 100;++i){
			inputArray[i]=i+1;
			}
		MathsUtil util = new MathsUtil();
		System.out.println("---------------------#Stage 1 output------------------------");
		for(String i:util.mathsTestmultiple3n5(inputArray)) System.out.println(i);
		System.out.println("------------------------------------------------------------");
		System.out.println("---------------------#Stage 2 output------------------------");
		for(String i:util.mathsTestmultiple3n5Stage2(inputArray)) System.out.println(i);
		System.out.println("------------------------------------------------------------");
	}
	
	public ArrayList<String> mathsTestmultiple3n5(int [] input)
	{  
		 ArrayList<String> outArray = new ArrayList<String>(); 
		for(int i:input) {
			if((i%3 == 0) && (i%5 == 0) )
			{
				outArray.add("FizzBuzz");
			}
			else if(i%3 == 0)
			{
				outArray.add("Fizz");
			}
			else if (i%5 == 0)
			{
				outArray.add("Buzz");
			}
			else
			{
				outArray.add(Integer.toString(i));
			}
		}
		return outArray;
	}
	public ArrayList<String> mathsTestmultiple3n5Stage2(int [] input)
	{
		ArrayList<String> outArray = new ArrayList<String>(); 
		for(int i:input) {	
			if(((i%3 == 0) || ((Integer.toString(i).contains("3")))) && ((i%5 == 0) || ((Integer.toString(i).contains("5")))))
			{
				outArray.add("FizzBuzz");
			}
			else if(i%3 == 0 || (Integer.toString(i).contains("3")))
			{
				outArray.add("Fizz");
			}
			else if (i%5 == 0  || (Integer.toString(i).contains("5")))
			{
				outArray.add("Buzz");
			}
			else 
			{
				outArray.add(Integer.toString(i));
			}
		}
		return outArray;
	}

}

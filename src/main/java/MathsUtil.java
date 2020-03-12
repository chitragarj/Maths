import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MathsUtil {

	public static void main(String[] args) {		

		MathsUtil util = new MathsUtil();
		System.out.println("---------------------#Stage 1 output------------------------");
		util.mathsTestmultiple3n5(100).forEach((String s) -> System.out.println(s));
		System.out.println("------------------------------------------------------------");
		System.out.println("---------------------#Stage 2 output------------------------");
		util.mathsTestmultiple3n5Stage2(100).forEach((String s) -> System.out.println(s));
		System.out.println("------------------------------------------------------------");
	}
	public ArrayList<String> mathsTestmultiple3n5(int num)
	{  
		List<String> res = new ArrayList<>();
		if(num<=0) {
			res.add("Error : Please enter value greater than 0");			
		} else {
		ArrayList<Integer> inputList = (ArrayList<Integer>) IntStream.rangeClosed(1, num).boxed().collect(Collectors.toList());
		ArrayList<String> outputList = (ArrayList<java.lang.String>) inputList.stream().map(i-> Integer.toString(i)).collect(Collectors.toList());
        res = outputList.stream().map(j -> returnWithLogic(j)).collect(Collectors.toList());        
		}
		return (ArrayList<java.lang.String>) res;
	}
	public ArrayList<String> mathsTestmultiple3n5Stage2(int num)
	{
		List<String> res = new ArrayList<>();
		if(num<=0) {
			res.add("Error : Please enter value greater than 0");			
		} else {
		ArrayList<Integer> inputArray = (ArrayList<Integer>) IntStream.rangeClosed(1, num).boxed().collect(Collectors.toList());
		ArrayList<String> outputList = (ArrayList<String>) inputArray.stream().map(i -> Integer.toString(i)).collect(Collectors.toList());
		res = outputList.stream().map(s -> returnWithLogicStage2(s)).collect(Collectors.toList());
		}
		return (ArrayList<String>) res;
	}
	private String returnWithLogic(String j)
	{
		String returnValue = j;
		int i = Integer.parseInt(j); 
		if((i%3 == 0) && (i%5 == 0) )
		{
			returnValue = "FizzBuzz";
		}
		else if(i%3 == 0)
		{
			returnValue =  "Fizz";
		}
		else if (i%5 == 0)
		{
			returnValue =  "Buzz";
		} else			
			returnValue =  j; 
		
		return returnValue;
	}
	
	private String returnWithLogicStage2(String j)
	{
			String returnValue = j;
			int i = Integer.parseInt(j);
			if(((i%3 == 0) || ((Integer.toString(i).contains("3")))) && ((i%5 == 0) || ((Integer.toString(i).contains("5")))))
			{
				returnValue = "FizzBuzz";
			}
			else if(i%3 == 0 || (Integer.toString(i).contains("3")))
			{
				returnValue =  "Fizz";
			}
			else if (i%5 == 0  || (Integer.toString(i).contains("5")))
			{
				returnValue =  "Buzz";
			}
			else 
				returnValue =  j; 
			
			return returnValue;
	}
}

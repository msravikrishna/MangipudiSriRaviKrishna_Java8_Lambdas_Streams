import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class AvgOfIntegers {
	static double calculateAverage(List<Integer> list){
		OptionalDouble average = list.stream()
				.mapToInt(value -> value)
				.average();
		return average.isPresent() ? average.getAsDouble() : null; 
	}
	public static void main(String[] args){
		List<Integer> numbers=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			numbers.add(i);
		}
		double average=calculateAverage(numbers);
		System.out.println("The average for given numbers is : "+average);
	}
}

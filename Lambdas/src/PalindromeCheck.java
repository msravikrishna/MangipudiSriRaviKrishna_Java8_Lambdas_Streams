import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class PalindromeCheck {
	public static boolean check(String str) {
		return str.equals(new StringBuffer(str).reverse().toString());
	}


	public static void main(String[] args) {
		List<String> al=Arrays.asList("malayalam","laptop","madam","radar","epam");
		palindrome(al,PalindromeCheck::check).forEach(System.out::println);
	}
	
	static List<String> palindrome(List<String> list, Predicate<String> myPredicate) {
		return list.stream().filter(str -> myPredicate.test(str)).collect(Collectors.toList());
	}
}


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StartsWithA {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("australia","axe","pen","epam","abc","arc");
		checkPrefix(names).forEach(System.out::println);
	}

static List<String> checkPrefix(List<String> list) {
		return list.stream().filter(s->(s.length()==3 && s.startsWith("a"))).collect(Collectors.toList());
	}
}
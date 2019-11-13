import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testReg {

	public static void main(String[] args) {
		String reg="(?<!cc)\\d+";

		String test = "aa111,bb222,cc333,cc444";
		Pattern pattern = Pattern.compile(reg);
		Matcher mc = pattern.matcher(test);
		while(mc.find()){
			System.out.println(mc.group());
		}
	}

}

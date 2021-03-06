package cn.laoliu_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取下列字串中由三个字母组成的单词
 * da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
 */
public class RegexTest {
	public static void main(String[] args) {
		String input = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
		// Pattern p = Pattern.compile("[a-zA-Z]{3}");
		Pattern p = Pattern.compile("\\b\\w{3}\\b");
		Matcher m = p.matcher(input);

		// System.out.println(m.groupCount());
		// for (int i = 0; i < m.groupCount(); i++) {
		// System.out.println(m.group(i));
		// }

		while (m.find()) {
			System.out.println(m.group());
		}
	}
}

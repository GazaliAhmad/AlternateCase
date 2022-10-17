import org.jetbrains.annotations.NotNull;
import static java.lang.System.out;

@SuppressWarnings("ReassignedVariable")
public class textManipulation {
	public static void main(String[] args) {
		var s1 = "abcdeEEgGGG";
		var s2 = "aaabbbBBBcd";
		var s3 = "aBBcDeFgBB";
		var s4 = "cba";
		var s5 = "thequickbrownfoxjumpsoverthelazydog";
		var s6  ="aaabaaa";
		
		alternateCase(s1);
		countSameLetters(s2);
		countSameLetters(s3);
		countSameLetters(s4);
		alternateCase(s5);
		countSameLetters(s5);
		countSameLetters(s6);
	}
	
	static void alternateCase(@NotNull String text) {
		StringBuilder result = new StringBuilder();
		var i = 0;
		while (i < text.length()) {
			if (i % 2 == 0) result.append(Character.toUpperCase(text.charAt(i)));
			else result.append(Character.toLowerCase(text.charAt(i)));
			i++;
		}
		out.println("\nAlternate case: " + text + " : " + result);
	}
	
	static void countSameLetters(@NotNull String text) {
		StringBuilder result = new StringBuilder();
		//var sortedText= text.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		var i = 0;
		while (i < text.length()) {
			var counter = 1;
			while (i < text.length() - 1 && text.charAt(i) == text.charAt(i + 1)) {
				counter++;
				i++;
			}
			if (counter == 1) result.append(text.charAt(i));
			else result.append(text.charAt(i)).append(counter);
			i++;
		}
		out.println("\nCount each letter by sequence occurrences: " + text + " : " + result);
	}
}

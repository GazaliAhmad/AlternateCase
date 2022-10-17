import org.jetbrains.annotations.NotNull;
import static java.lang.System.out;

@SuppressWarnings("ReassignedVariable")
public class textManipulation {
	public static void main(String[] args) {
		var s1 = "abcdeEEgGGG";
		var s2 = "aaabbbBBBcd";
		var s3 = "aBBcDeFgBB";
		var s4 = "abcd";
		var s5 = "thequickbrownfoxjumpsoverthelazydog";
		
		alternateCase(s1);
		countSameLetters(s2);
		countSameLetters(s3);
		countSameLetters(s4);
		alternateCase(s5);
		countSameLetters(s5);
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
		var sortedText= text.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		var i = 0;
		while (i < text.length()) {
			var counter = 1;
			while (i < sortedText.length() - 1 && sortedText.charAt(i) == sortedText.charAt(i + 1)) {
				counter++;
				i++;
			}
			if (counter == 1) result.append(sortedText.charAt(i));
			else result.append(sortedText.charAt(i)).append(counter);
			i++;
		}
		out.println("\nCount each letter occurrences: " + text + " : " + result);
	}
}

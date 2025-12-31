import java.util.ArrayList;
import java.util.List;

public class Solution_2942 {

	/**
	 * 2942. Find Words Containing Character
	 * @param words
	 * @param x
	 * @return indices of strings in words array with character x
	 */
	public List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> indices = new ArrayList<>();
		
		for(int i = 0; i < words.length; i++) {
			if(words[i].indexOf(x) != -1) {
				indices.add(i);
			}
		}
		
		return indices;
    }
}

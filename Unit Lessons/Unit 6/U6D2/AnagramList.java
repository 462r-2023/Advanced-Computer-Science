import java.util.AbstractList;
import java.util.ArrayList;

public class AnagramList extends AbstractList {
    ArrayList<Word> wordList;

    public AnagramList() {
        wordList = new ArrayList<Word>();
    }

    public boolean add(Word word) {
        wordList.add(word);
        return true;
    }

    public Word get(int i) {
        return wordList.get(i);
    }

    public int size() {
        return wordList.size();
    }

    public boolean checkAnagram(Word word1, Word word2) {
        return word1.getSortedWord().equals(word2.getSortedWord());
    }

    public ArrayList<Word> searchAnagrams(String key) {
        Word keyWord = new Word(key);
        ArrayList<Word> newWordList = new ArrayList<Word>();
        for (Word word : wordList) {
            if (word.getSortedWord().equals(keyWord.getSortedWord())) {
                newWordList.add(word);
            }
        }
        return newWordList;
    }
}

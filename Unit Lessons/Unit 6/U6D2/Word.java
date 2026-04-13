public class Word {
    String originalWord;
    String sortedWord;

    public Word(String word) {
        originalWord = word;
        sortedWord = sortWord();
    }

    public String sortWord2(String word) {
        if (word.length() < 2) {
            return word;
        }
        String firstHalf = sortWord2(word.substring(0, word.length() / 2));
        String secondHalf = sortWord2(word.substring(word.length() / 2));
        int index1 = 0;
        int index2 = 0;
        word = "";
        while (index1 < firstHalf.length() && index2 < secondHalf.length()) {
            if (firstHalf.charAt(index1) < secondHalf.charAt(index2)) {
                word += firstHalf.charAt(index1);
                index1++;
            } else {
                word += secondHalf.charAt(index2);
                index2++;
            }
        }
        if (index1 < firstHalf.length()) {
            word += firstHalf.substring(index1);
        } else {
            word += secondHalf.substring(index2);
        }
        return word;
    }

    public String sortWord() {
        return sortWord2(getOriginalWord().toLowerCase());
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public void setOriginalWord(String originalWord) {
        this.originalWord = originalWord;
        sortWord();
    }

    public String getSortedWord() {
        return sortedWord;
    }
}

package blog.kanghokennethyoon.effectivejava.item5;

import java.util.List;

public class SpellCheckerPSU {

    private static final Lexicon dictionary = new Lexicon();

    private SpellCheckerPSU() {
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return null;
    }
}

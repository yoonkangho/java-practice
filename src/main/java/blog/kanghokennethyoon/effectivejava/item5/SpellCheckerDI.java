package blog.kanghokennethyoon.effectivejava.item5;

import java.util.List;
import java.util.Objects;

public class SpellCheckerDI {
    private final Lexicon dictionary;

    public SpellCheckerDI(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return null;
    }
}

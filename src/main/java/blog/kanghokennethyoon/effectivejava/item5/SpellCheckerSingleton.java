package blog.kanghokennethyoon.effectivejava.item5;

import java.util.List;

public class SpellCheckerSingleton {
    private final Lexicon dictionary = new Lexicon();

    private SpellCheckerSingleton() {
    }

    public static SpellCheckerSingleton INSTANCE = new SpellCheckerSingleton();

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return null;
    }
}

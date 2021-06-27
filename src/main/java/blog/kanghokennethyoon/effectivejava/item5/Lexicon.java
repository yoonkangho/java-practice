package blog.kanghokennethyoon.effectivejava.item5;

import java.util.HashMap;

public class Lexicon {

    private HashMap<String, String> hashMap;

    public Lexicon() {
        hashMap = new HashMap<String, String>();
    }

    public boolean contains(String word) {
        return hashMap.containsKey(word);
    }

}

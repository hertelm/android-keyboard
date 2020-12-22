package com.wordsuggestions;

import java.util.ArrayList;

public class DummyWordSuggestor {
    private ArrayList<String> mSuggestions;

    public DummyWordSuggestor() {
        mSuggestions = new ArrayList<>();
        mSuggestions.add("abc");
        mSuggestions.add("def");
        mSuggestions.add("ghi");
    }

    public ArrayList<String> getSuggestions(String context) {
        return mSuggestions;
    }
}

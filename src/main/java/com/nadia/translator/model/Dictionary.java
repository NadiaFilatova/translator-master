package com.nadia.translator.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Dictionary {
    private final List<Translation> translations = new ArrayList<>();

    public void addTranslation(Translation translation) {
        this.translations.add(translation);
    }

    public List<Translation> translations() {
        return Collections.unmodifiableList(this.translations);
    }
}

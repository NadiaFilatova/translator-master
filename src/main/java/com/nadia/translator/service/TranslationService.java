package com.nadia.translator.service;

import com.nadia.translator.model.Language;
import com.nadia.translator.model.Word;

import java.util.Optional;



public interface TranslationService {
    Optional<Word> translate(Word sourceWord, Language targetLanguage);
}

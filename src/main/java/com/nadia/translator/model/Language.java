package com.nadia.translator.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Locale;


@Getter
@RequiredArgsConstructor
public enum Language {
    EN(Locale.ENGLISH),
    FR(Locale.FRENCH),
    IT(Locale.ITALIAN);

    private final Locale locale;
}

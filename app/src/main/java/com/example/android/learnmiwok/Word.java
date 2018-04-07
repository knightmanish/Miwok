package com.example.android.learnmiwok;

public class Word {

    private String miwokLang;
    private String defaultLang;

    public Word(String miwokLang, String defaultLang) {
        this.miwokLang = miwokLang;
        this.defaultLang = defaultLang;
    }

    public String getMiwokLang() {
        return miwokLang;
    }

    public void setMiwokLang(String miwokLang) {
        this.miwokLang = miwokLang;
    }

    public String getDefaultLang() {
        return defaultLang;
    }

    public void setDefaultLang(String defaultLang) {
        this.defaultLang = defaultLang;
    }

}

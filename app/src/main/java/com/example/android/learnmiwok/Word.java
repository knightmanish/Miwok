package com.example.android.learnmiwok;

public class Word {

    private String miwokLang;
    private String defaultLang;
    private int reourceId = -1;

    public Word(String miwokLang, String defaultLang) {
        this.miwokLang = miwokLang;
        this.defaultLang = defaultLang;
    }

    public Word(String miwokLang, String defaultLang, int reourceId) {
        this.miwokLang = miwokLang;
        this.defaultLang = defaultLang;
        this.reourceId = reourceId;
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

    public int getReourceId() {
        return reourceId;
    }

    public void setReourceId(int reourceId) {
        this.reourceId = reourceId;
    }
}

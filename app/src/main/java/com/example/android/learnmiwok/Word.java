package com.example.android.learnmiwok;

public class Word {

    private String miwokLang;
    private String defaultLang;
    private int reourceId = -1;
    private int audioId;

    public Word(String miwokLang, String defaultLang, int reourceId, int audioId) {
        this.miwokLang = miwokLang;
        this.defaultLang = defaultLang;
        this.reourceId = reourceId;
        this.audioId = audioId;
    }

    public Word(String miwokLang, String defaultLang, int audioId) {
        this.miwokLang = miwokLang;
        this.defaultLang = defaultLang;
        this.audioId = audioId;
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

    public int getAudioId() {
        return audioId;
    }

    public void setAudioId(int audioId) {
        this.audioId = audioId;
    }
}

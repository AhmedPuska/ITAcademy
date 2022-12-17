package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TranslationModel {

    private String word;
    private String sourceLanguage;
    private String translationLanguage;

    public TranslationModel(String word, String sourceLanguage, String translationLanguage) {

        this.word = word;
        this.sourceLanguage = sourceLanguage;
        this.translationLanguage = translationLanguage;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public String getTranslationLanguage() {
        return translationLanguage;
    }

    public void setTranslationLanguage(String translationLanguage) {
        this.translationLanguage = translationLanguage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, sourceLanguage, translationLanguage); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TranslationModel)) {
            return false;
        }
        TranslationModel comparedModel = (TranslationModel) o;
        return word.equals(comparedModel.getWord())
                && //
                sourceLanguage.equals(comparedModel.getSourceLanguage())
                &&//
                translationLanguage.equals(comparedModel.getTranslationLanguage());
    }

}

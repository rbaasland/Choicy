package rbaasland.com.choicy.core;

import java.util.ArrayList;

public class ChoiceList {
    public ArrayList<String> mChoices;
    public String mListTitle;
    public int mRandomChoice;
    public final int mMaxChoices = 20;

    public ChoiceList() {
        mChoices = new ArrayList<String>();
    }

    public String getListTitle() {
        return mListTitle;
    }

    public void setListTitle(String listTitle) {
        mListTitle = listTitle;
    }

    public int getRandomChoice() {
        return mRandomChoice;
    }

    public void setRandomChoice(int randomChoice) {
        this.mRandomChoice = randomChoice;
    }

    public ArrayList<String> getChoices() {
        return mChoices;
    }

    public void setChoices(ArrayList<String> choices) {
        mChoices = choices;
    }

    public void addChoiceToList(String choice) {
        if (!this.isFull()) {
            mChoices.add(choice);
        }

    }

    protected boolean isFull() {
        int size = mChoices.size();

        if (size <= mMaxChoices) {
            return false;
        } else {
            return true;
        }
    }
}

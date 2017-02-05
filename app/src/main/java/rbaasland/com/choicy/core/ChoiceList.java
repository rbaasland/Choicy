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

    public boolean addChoiceToList(String choice) throws IllegalArgumentException {
        if (!this.isFull()) {
            mChoices.add(choice);
            return true;
        }

        return false;
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

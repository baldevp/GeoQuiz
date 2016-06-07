package com.bignerdranch.android.geoquiz;

/**
 * Created by Baldev Patwari on 6/3/2016.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textResId,boolean answerTrue){
        mAnswerTrue=answerTrue;
        mTextResId=textResId;

    }
}

package com.example.android.miwok;

/**
 * Created by Jaynil_Patel97 on 28-10-2016.
 */
public class Word
{
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = -1;
    private int mAudioResourceID;


    public Word(String MiwokTranslation,String DefaultTranslation,int AudioResource){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioResourceID = AudioResource;
    }

    public Word(String MiwokTranslation,String DefaultTranslation,int ImageResourceID,int AudioResource){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceID = ImageResourceID;
        mAudioResourceID = AudioResource;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getmImageResourceID(){
        return mImageResourceID;
    }

    public int getmAudioResourceID(){return  mAudioResourceID;}

    public boolean hasImage(){
        return mImageResourceID != -1;
    }
}

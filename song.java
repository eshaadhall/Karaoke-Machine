/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kareoke.model;

/**
 *
 * @author eshaa.dhall
 */
public class song {
    // immutable songs so users cannot change so make the variable private.
    private String mArtist;
    private String mTitle;
    private String mVideoURL;
    
    public song(String Artist, String Title, String VideoURL){
        mArtist=Artist;
        mTitle=Title;
        mVideoURL=VideoURL;
    }
    
    //what useres get to see the getters
    public String getTitle(){
        return mTitle;
    }
     public String getArtist(){
        return mArtist;
    }
      public String getVideoURL(){
        return mVideoURL;
    }
      
    @Override
    public String toString(){
        return String.format("Song Now: %s by %s",mTitle,mArtist);
    }
    
    // Lets build the songbook class
}

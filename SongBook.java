/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kareoke.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eshaa.dhall
 */
public class SongBook {
    //We have a list of songs so we will use a List.
    //use interface only
    //keep private just incase we want to change the implementation of the whole song book.
    private List<song> mSongs;
    //We dont need to declare import for song as it is in the same package.
    public SongBook()
    {
        //initialize the list of songs.
        mSongs=new ArrayList<song>();
    }
    
    public void addSong(song song)
    {
        mSongs.add(song);
    }
    
    public int getSongCount()
    {
        return mSongs.size();
    }
}


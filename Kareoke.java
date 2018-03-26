/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import kareoke.model.SongBook;
import kareoke.model.song;
/**
 *
 * @author eshaa.dhall
 */
public class Kareoke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        song song = new song("Michael Jackson","Beat It","https://www.youtube.com/watch?v=pvdrN3GJFZo");
        SongBook songbook=new SongBook();
        System.out.printf("Adding %s %n", song);
        songbook.addSong(song);
        System.out.printf("There are %d songs.", songbook.getSongCount());
    }
    
}

package com.almazan.Section9.Inner.Album;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String songTitle, double duration) {
        return this.songs.add(new Song(songTitle,duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songs.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    /**
     * The Playlist class will be modified to use an inner class called SongList which will replace the ArrayList that was used to hold the list of songs for an album.
     */
    public static class SongList {
        /**
         * The SongList class will use an ArrayList to hold the track list for the album.
         * To do this a member variable called songs will need to be declared and a constructor will need to be implemented to initialize the field.
         */
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        /**
         * add
         * @param song accepts a parameter of type Song
         * @return a boolean value which will be false if the song is found to already be in the songs list. If not, the song will be added to the list and a value of true will be returned.
         */
        private boolean add(Song song) {
            if(songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        /**
         * findSong
         * @param songTitle accepts the title of a song as its only parameter.
         * @return If the song with that title is found in the list then the song is returned from the method. If not, a value of null is returned.
         */
        private Song findSong(String songTitle) {
            for(Song checkingSong: this.songs){
                if(checkingSong.getTitle().equals(songTitle)) {
                    return checkingSong;
                }
            }
            return null;
        }

        /**
         * findSong - overridden method which accepts a track number for a song.
         * @param trackNumber The track number is of type int.
         * @return If a song is found with that track number the song is returned, otherwise null is returned.
         */
        private Song findSong(int trackNumber) {
            int index = trackNumber -1;
            if((index >= 0) && (index<songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}
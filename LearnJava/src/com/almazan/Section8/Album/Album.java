package com.almazan.Section8.Album;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    //member vars
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        // check if the song has already been added
        if (findSong(title) != null) {
            // song already added
            //System.out.println("addSong -> return false");
            return false;
        }

        // checks passed, add new song to album
        Song newSong = new Song(title, duration);
        songs.add(newSong);
        //System.out.println("addSong " + newSong.getTitle() + " -> success");
        return true;
    }

    private Song findSong(String title) {
        if (!songs.isEmpty()) {
            for (Song s : songs) {
                if (s.getTitle().equals(title)) {
                    // the song is on the album.
                    //System.out.println("findSong -> returning s");
                    return s;
                }
            }
        }
        //System.out.println("findsong -> returning null");
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        // Note: trackNumbers start at 1.
        if (trackNumber <= 0 || trackNumber > songs.size()) {
            // trackNumber was out of range
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }
        // get the song from the album
        Song songToAdd = songs.get(trackNumber-1);
        String songToAddTitle = songToAdd.getTitle();

        // See if the song has already been added to the playList
        ListIterator<Song> playListIterator = playList.listIterator();
        while (playListIterator.hasNext()) {
            if  (playListIterator.next().getTitle().compareTo(songToAddTitle) == 0) {
                // The song is already in the playlist
                return false;
            }
        }

        // Add the song to the end of the playList.
        playList.add(songToAdd);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        //verify the song exists
        Song songToAdd = findSong(title);
        if (songToAdd == null) {
            // The song was not found
            System.out.println("The song " + title + " is not in this album");
            return false;
        }
        // Check if the song is already in the playList
        ListIterator<Song> playListIterator = playList.listIterator();
        while (playListIterator.hasNext()) {
            if  (playListIterator.next().getTitle().compareTo(songToAdd.getTitle()) == 0) {
                // The song is already in the playlist
                return false;
            }
        }

        // Add the song to the end of the playList.
        playList.add(songToAdd);
        return true;
    }
}
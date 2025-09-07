package DesignPatterns.Iterator;

public class Playlist implements Iterable<String> {
    private String[] songs;
    private int size = 0;

    public Playlist(int capacity){
        this.size = capacity;
        songs = new String[capacity];
    }

    public void addSong(String song){
        songs[size++] = song;
    }
    @Override
    public Iterator<String> getIterator() {
        return new SongIterator(this);
    }

    public int getSize() {
        return size;
    }

    public String[] getSongs() {
        return songs;
    }
}

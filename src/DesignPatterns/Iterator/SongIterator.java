package DesignPatterns.Iterator;

public class SongIterator implements Iterator<String>{
    private int index = 0;
    private Playlist playlist;

    public SongIterator(Playlist playlist){
        this.playlist = playlist;
    }
    @Override
    public boolean hasNext() {
        return index < playlist.getSize();
    }

    @Override
    public String next() {
        return playlist.getSongs()[index++];
    }
}

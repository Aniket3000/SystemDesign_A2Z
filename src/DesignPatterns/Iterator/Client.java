package DesignPatterns.Iterator;

public class Client {
    public void main(){
        Playlist playlist = new Playlist(5);
        playlist.addSong("Song 1");
        playlist.addSong("Song 2");
        playlist.addSong("Song 3");

        Iterator<String> it = playlist.getIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

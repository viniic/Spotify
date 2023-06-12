package albuns;

import artists.Artist;

public class Album {
    private String albumName;
    
    private Artist autor;


    public String getAlbumName() {
        return albumName;
    }

    public String getAlbumAuthor(){
        return autor.getNome();
    }
    
}

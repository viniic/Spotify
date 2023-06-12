package artists;

import java.util.HashMap;
import java.util.HashSet;

import albuns.Album;

public class Artist {
    private int songsReleased;
    
    private HashMap<Album,Artist> albunsReleased;
    
    private String nome;
    
    
    
    public int getSongsReleased() {
        return songsReleased;
    }


    public String getNome() {
        return nome;
    }


    public Artist(String nome) {
        this.nome = nome;
    }   

    
}

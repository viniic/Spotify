package songs;

import albuns.Album;
import artists.Artist;

public abstract class AbstractSong {
    
    private int duracao;

    private String genero;
    
    private Artist autor;
    
    private Album album;
    
    private String letra;
    
    
    public Artist getAutor() {
        return autor;
    }
    public void setAutor(Artist autor) {
        this.autor = autor;
    }
    public Album getAlbum() {
        return album;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }
    public String getLetra() {
        return letra;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getGenero(){
        return genero;  
    }
    
    public int getDuracao(){
        return duracao;
    }
}

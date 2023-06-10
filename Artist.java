import java.util.*;
public class Artist {
    private String id;
    private String name;
    private String genre;
    private String biography;
    private String social_media_links;
    private List<music> tracks;
    private List<Album> albums;


    public Artist(String id, String name, String genre, String biography, String social_media_links) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.biography = biography;
        this.social_media_links = social_media_links;
        this.tracks = new ArrayList<>();
        this.albums = new ArrayList<>();
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGenre() {
        return genre;
    }
    public String getBiography() {
        return biography;
    }
    public String getSocial_media_links() {
        return social_media_links;
    }
    public List<music> getTracks() {
        return tracks;
    }
    public List<Album> getAlbums() {
        return albums;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setBiography(String biography) {
        this.biography = biography;
    }
    public void setSocial_media_links(String social_media_links) {
        this.social_media_links = social_media_links;
    }
    public void setTracks(List<music> tracks) {
        this.tracks = tracks;
    }
    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}

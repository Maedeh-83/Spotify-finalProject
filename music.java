public class music {
    private int ID;
    private String name;
    private Artist artist;
    private double duration;
    private String genre;

    public music(int ID, String name, Artist artist, double duration, String genre) {
        this.ID = ID;
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getArtist() {
        return artist.getName();
    }
    public double getDuration() {
        return duration;
    }
    public String getGenre() {
        return genre;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setArtist(Artist artist) {
        this.artist = artist;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}

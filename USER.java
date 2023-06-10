import java.util.*;

public class USER {
    private String username;
    private String password;
    private String Email;
    private List<music> Favorites;

    public USER(String username, String password, String Email) {
        this.username = username;
        this.password = password;
        this.Email = Email;
        this.Favorites = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return Email;
    }
    public List<music> getFavorites() {
        return Favorites;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public void setFavorites(List<music> favorites) {
        Favorites = favorites;
    }
}
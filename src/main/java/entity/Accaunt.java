package entity;

final public class Accaunt {
    protected String login;
    protected String password;

    Accaunt(String login, String password) {
        this.login = login;
        this.login = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

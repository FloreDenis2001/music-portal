package model;

public class Performaer implements Comparable<Performaer> {
    private int performer_id;
    private int performer_music_id;
    private String performer_name;
    private String performer_mobile;
    private String performer_email;
    private String performer_username;
    private String performer_password;
    private String performer_address;

    public Performaer(int performer_id, int performer_music_id, String performer_name, String performer_mobile, String performer_email, String performer_username, String performer_password, String performer_address) {
        this.performer_id = performer_id;
        this.performer_music_id = performer_music_id;
        this.performer_name = performer_name;
        this.performer_mobile = performer_mobile;
        this.performer_email = performer_email;
        this.performer_username = performer_username;
        this.performer_password = performer_password;
        this.performer_address = performer_address;
    }

    public Performaer(String text) {
        String[] path = text.split(",");
        this.performer_id = Integer.parseInt(path[0]);
        this.performer_music_id = Integer.parseInt(path[1]);
        this.performer_name = path[2];
        this.performer_mobile = path[3];
        this.performer_email = path[4];
        this.performer_username = path[5];
        this.performer_password = path[6];
        this.performer_address = path[7];
    }

    public int getPerformer_id() {
        return performer_id;
    }

    public void setPerformer_id(int performer_id) {
        this.performer_id = performer_id;
    }

    public int getPerformer_music_id() {
        return performer_music_id;
    }

    public void setPerformer_music_id(int performer_music_id) {
        this.performer_music_id = performer_music_id;
    }

    public String getPerformer_name() {
        return performer_name;
    }

    public void setPerformer_name(String performer_name) {
        this.performer_name = performer_name;
    }

    public String getPerformer_mobile() {
        return performer_mobile;
    }

    public void setPerformer_mobile(String performer_mobile) {
        this.performer_mobile = performer_mobile;
    }

    public String getPerformer_email() {
        return performer_email;
    }

    public void setPerformer_email(String performer_email) {
        this.performer_email = performer_email;
    }

    public String getPerformer_username() {
        return performer_username;
    }

    public void setPerformer_username(String performer_username) {
        this.performer_username = performer_username;
    }

    public String getPerformer_password() {
        return performer_password;
    }

    public void setPerformer_password(String performer_password) {
        this.performer_password = performer_password;
    }

    public String getPerformer_address() {
        return performer_address;
    }

    public void setPerformer_address(String performer_address) {
        this.performer_address = performer_address;
    }

    @Override
    public String toString() {
        String text = "Name : " + this.performer_name + "\n";
        text += "Mobile : " + this.performer_mobile + "\n";
        text += "Email : " + this.performer_email + "\n";
        text += "Username : " + this.performer_username + "\n";
        text += "Address : " + this.performer_address + "\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        Performaer x = (Performaer) o;
        return this.performer_music_id == x.getPerformer_music_id();
    }


    @Override
    public int compareTo(Performaer o) {
        if (this.performer_id > o.getPerformer_id()){
            return 1;
        } else if(this.performer_id < o.getPerformer_id()){
            return -1;
        } else {
            return 0;
        }
    }
}

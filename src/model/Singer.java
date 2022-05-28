package model;

public class Singer implements Comparable<Singer> {
    private int singer_id;
    private int singer_music_id;
    private String singer_name;
    private String singer_mobile;
    private String singer_email;
    private String singer_username;
    private String singer_password;
    private String singer_address;

    public Singer(int singer_id, int singer_music_id, String singer_name, String singer_mobile, String singer_email, String singer_username, String singer_password, String singer_address) {
        this.singer_id = singer_id;
        this.singer_music_id = singer_music_id;
        this.singer_name = singer_name;
        this.singer_mobile = singer_mobile;
        this.singer_email = singer_email;
        this.singer_username = singer_username;
        this.singer_password = singer_password;
        this.singer_address = singer_address;
    }

    public Singer(String text) {
        String[] path = text.split(",");
        this.singer_id = Integer.parseInt(path[0]);
        this.singer_music_id = Integer.parseInt(path[1]);
        this.singer_name = path[2];
        this.singer_mobile = path[3];
        this.singer_email = path[4];
        this.singer_username = path[5];
        this.singer_password = path[6];
        this.singer_address = path[7];
    }

    public int getSinger_id() {
        return singer_id;
    }

    public void setSinger_id(int singer_id) {
        this.singer_id = singer_id;
    }

    public int getSinger_music_id() {
        return singer_music_id;
    }

    public void setSinger_music_id(int singer_music_id) {
        this.singer_music_id = singer_music_id;
    }

    public String getSinger_name() {
        return singer_name;
    }

    public void setSinger_name(String singer_name) {
        this.singer_name = singer_name;
    }

    public String getSinger_mobile() {
        return singer_mobile;
    }

    public void setSinger_mobile(String singer_mobile) {
        this.singer_mobile = singer_mobile;
    }

    public String getSinger_email() {
        return singer_email;
    }

    public void setSinger_email(String singer_email) {
        this.singer_email = singer_email;
    }

    public String getSinger_username() {
        return singer_username;
    }

    public void setSinger_username(String singer_username) {
        this.singer_username = singer_username;
    }

    public String getSinger_password() {
        return singer_password;
    }

    public void setSinger_password(String singer_password) {
        this.singer_password = singer_password;
    }

    public String getSinger_address() {
        return singer_address;
    }

    public void setSinger_address(String singer_address) {
        this.singer_address = singer_address;
    }

    public String toSave() {
        String text = this.getSinger_id() + "," + this.getSinger_music_id() + "," + this.getSinger_name() + "," + this.getSinger_mobile() + "," + this.getSinger_email() + "," + this.getSinger_username() + "," + this.getSinger_password() + "," + this.getSinger_address();
        return text;
    }

    @Override
    public String toString() {
        String text = "Name : " + this.singer_name + "\n";
        text += "Mobile : " + this.singer_mobile + "\n";
        text += "Email : " + this.singer_email + "\n";
        text += "Username : " + this.singer_username + "\n";
        text += "Address : " + this.singer_address + "\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        Singer x = (Singer) o;
        return this.singer_music_id == x.getSinger_music_id();
    }


    @Override
    public int compareTo(Singer o) {
        if (this.singer_id > o.getSinger_id()) {
            return 1;
        } else if (this.singer_id < o.getSinger_id()) {
            return -1;
        } else {
            return 0;
        }
    }
}

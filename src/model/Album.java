package model;

public class Album implements Comparable<Album> {
    private int album_id;
    private String album_name;
    private String album_type;
    private String album_description;

    public Album(int album_id, String album_name, String album_type, String album_description) {
        this.album_id = album_id;
        this.album_name = album_name;
        this.album_type = album_type;
        this.album_description = album_description;
    }
    public Album(String text) {
        String[] path = text.split(",");
        this.album_id= Integer.parseInt(path[0]);
        this.album_name = path[1];
        this.album_type = path[2];
        this.album_description = path[3];
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getAlbum_type() {
        return album_type;
    }

    public void setAlbum_type(String album_type) {
        this.album_type = album_type;
    }

    public String getAlbum_description() {
        return album_description;
    }

    public void setAlbum_description(String album_description) {
        this.album_description = album_description;
    }

    public String toString() {
        String text = "Name : " + this.album_name + "\n";
        text += "Type : " + this.album_type + "\n";
        text += "Description : " + this.album_description + "\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        Album x = (Album) o;
        return this.album_id == x.getAlbum_id();
    }


    @Override
    public int compareTo(Album o) {
        if (this.album_id > o.getAlbum_id()) {
            return 1;
        } else if (this.album_id < o.getAlbum_id()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toSave() {
        String text = this.getAlbum_id() + "," + this.album_name + "," + this.getAlbum_type()+ "," + this.getAlbum_description();
        return text;
    }
}


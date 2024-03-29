package model;

public class Music implements Comparable<Music> {
    private int music_id;
    private int music_album_id;
    private String music_type;
    private String music_description;

    public Music(int music_id, int music_album_id, String music_type, String music_description) {
        this.music_id = music_id;
        this.music_album_id = music_album_id;
        this.music_type = music_type;
        this.music_description = music_description;
    }

    public Music(String text) {
        String[] path = text.split(",");
        this.music_id = Integer.parseInt(path[0]);
        this.music_album_id = Integer.parseInt(path[1]);
        this.music_type = path[2];
        this.music_description = path[3];
    }


    public int getMusic_id() {
        return music_id;
    }

    public void setMusic_id(int music_id) {
        this.music_id = music_id;
    }

    public int getMusic_album_id() {
        return music_album_id;
    }

    public void setMusic_album_id(int music_album_id) {
        this.music_album_id = music_album_id;
    }

    public String getMusic_type() {
        return music_type;
    }

    public void setMusic_type(String music_type) {
        this.music_type = music_type;
    }

    public String getMusic_description() {
        return music_description;
    }

    public void setMusic_description(String music_description) {
        this.music_description = music_description;
    }

    public String toSave() {
        String text = this.getMusic_id() + "," + this.getMusic_album_id() + ","  + this.getMusic_type() + "," + this.getMusic_description();
        return text;
    }

    @Override
    public String toString() {
        String text = "ID : " + this.music_id + "\n";
        text += "Type : " + this.music_type + "\n";
        text += "Description : " + this.music_description + "\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        Music x = (Music) o;
        return this.music_id == x.getMusic_id();
    }


    @Override
    public int compareTo(Music o) {
        if (this.music_album_id > o.getMusic_album_id()) {
            return 1;
        } else if (this.music_album_id < o.getMusic_album_id()) {
            return -1;
        } else {
            return 0;
        }
    }

}

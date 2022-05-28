package model;

public class MusicLibrary implements Comparable<MusicLibrary> {
    private int music_library_id;
    private String music_library_name;
    private String music_library_type;
    private String music_library_description;

    public MusicLibrary(int music_library_id, String music_library_name, String music_library_type, String music_library_description) {
        this.music_library_id = music_library_id;
        this.music_library_name = music_library_name;
        this.music_library_type = music_library_type;
        this.music_library_description = music_library_description;
    }

    public MusicLibrary(String text) {
        String[] path = text.split(",");
        this.music_library_id = Integer.parseInt(path[0]);
        this.music_library_name = path[1];
        this.music_library_type = path[2];
        this.music_library_description = path[3];
    }
    public int getMusic_library_id() {
        return music_library_id;
    }

    public void setMusic_library_id(int music_library_id) {
        this.music_library_id = music_library_id;
    }

    public String getMusic_library_name() {
        return music_library_name;
    }

    public void setMusic_library_name(String music_library_name) {
        this.music_library_name = music_library_name;
    }

    public String getMusic_library_type() {
        return music_library_type;
    }

    public void setMusic_library_type(String music_library_type) {
        this.music_library_type = music_library_type;
    }

    public String getMusic_library_description() {
        return music_library_description;
    }

    public void setMusic_library_description(String music_library_description) {
        this.music_library_description = music_library_description;
    }

    @Override
    public String toString() {
        String text = "Name : " + this.music_library_name + "\n";
        text += "Type : " + this.music_library_type + "\n";
        text += "Description : " + this.music_library_description + "\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
       MusicLibrary x = (MusicLibrary) o;
        return this.music_library_id == x.getMusic_library_id();
    }


    @Override
    public int compareTo(MusicLibrary o) {
        if (this.music_library_id > o.getMusic_library_id()) {
            return 1;
        } else if (this.music_library_id < o.getMusic_library_id()) {
            return -1;
        } else {
            return 0;
        }
    }
}

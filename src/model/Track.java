package model;

public class Track implements Comparable<Track> {
    private int track_id;
    private int track_music_id;
    private String track_name;
    private String track_type;
    private String track_description;


    public Track(int track_id, int track_music_id, String track_name, String track_type, String track_description) {
        this.track_id = track_id;
        this.track_music_id = track_music_id;
        this.track_name = track_name;
        this.track_type = track_type;
        this.track_description = track_description;
    }

    public Track(String text) {
        String[] path = text.split(",");
        this.track_id = Integer.parseInt(path[0]);
        this.track_music_id = Integer.parseInt(path[1]);
        this.track_name = path[2];
        this.track_type = path[3];
        this.track_description = path[4];
    }

    public int getTrack_id() {
        return track_id;
    }

    public void setTrack_id(int track_id) {
        this.track_id = track_id;
    }

    public int getTrack_music_id() {
        return track_music_id;
    }

    public void setTrack_music_id(int track_music_id) {
        this.track_music_id = track_music_id;
    }

    public String getTrack_name() {
        return track_name;
    }

    public void setTrack_name(String track_name) {
        this.track_name = track_name;
    }

    public String getTrack_type() {
        return track_type;
    }

    public void setTrack_type(String track_type) {
        this.track_type = track_type;
    }

    public String getTrack_description() {
        return track_description;
    }

    public void setTrack_description(String track_description) {
        this.track_description = track_description;
    }

    @Override
    public String toString() {
        String text = "Name : " + this.track_name + "\n";
        text += "Type : " + this.track_type + "\n";
        text += "Description : " + this.track_description + "\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        Track x = (Track) o;
        return this.track_id == x.getTrack_id();
    }


    @Override
    public int compareTo(Track o) {
        if (this.track_music_id > o.getTrack_music_id()) {
            return 1;
        } else if (this.track_music_id < o.getTrack_music_id()) {
            return -1;
        } else {
            return 0;
        }
    }
}

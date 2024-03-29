package controller;

import model.Music;
import model.Track;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerTrack {
    private ArrayList<Track> tracks;

    public ControllerTrack(){
        tracks=new ArrayList<>();
        this.load();
    }
    public void load() {
        try {
            File file = new File("C:\\Users\\flore\\Desktop\\mycode\\music-portal\\src\\res\\track.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                Track x = new Track(text);
                this.tracks.add(x);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisare() {
        for (Track x : tracks)
            System.out.println(x);
    }


    public void adaugare(Track trackNou) {
        Track x = findById(trackNou.getTrack_id());
        if (x == null) {
            this.tracks.add(trackNou);
        }
    }


    public void stergere(int id) {
        Track c = findById(id);
        if (c != null) {
            this.tracks.remove(c);
        }
    }


    public void update(int id, String descriereNoua) {
        Track x = findById(id);
        if (x != null) {
            x.setTrack_description(descriereNoua);
        }
    }

    public Track findById(int id) {
        for (Track x : tracks) {
            if (x.getTrack_id() == id) {
                return x;
            }
        }
        return null;
    }


    public int nextId() {
        if (this.tracks.size() >= 0) {
            return this.tracks.get(this.tracks.size() - 1).getTrack_id() + 1;
        }
        return 1;
    }


    public String toSaveTrack() {
        String text = "";
        for (Track x : tracks) {
            text += x.toSave() + "\n";
        }
        return text;
    }

    public void save() {
        try {
            File file = new File("C:\\Users\\flore\\Desktop\\mycode\\music-portal\\src\\res\\track.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(toSaveTrack());
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

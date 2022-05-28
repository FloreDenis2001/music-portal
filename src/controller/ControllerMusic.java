package controller;

import model.Music;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerMusic {
    private ArrayList<Music> music;

    public ControllerMusic() {
        music = new ArrayList<>();
        this.load();
    }

    public void load() {
        try {
            File file = new File("C:\\Users\\flore\\Desktop\\mycode\\music-portal\\src\\res\\music.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                Music x = new Music(text);
                this.music.add(x);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisare() {
        for (Music x : music)
            System.out.println(x);
    }


    public void adaugare(Music muzicaNoua) {
        Music x = findById(muzicaNoua.getMusic_id());
        if (x == null) {
            this.music.add(muzicaNoua);
        }
    }


    public void stergere(int id) {
        Music c = findById(id);
        if (c != null) {
            this.music.remove(c);
        }
    }


    public void update(int id, String descriereNoua) {
        Music x = findById(id);
        if (x != null) {
            x.setMusic_description(descriereNoua);
        }
    }

    public Music findById(int id) {
        for (Music x : music) {
            if (x.getMusic_id() == id) {
                return x;
            }
        }
        return null;
    }


    public int nextId() {
        if (this.music.size() >= 0) {
            return this.music.get(this.music.size() - 1).getMusic_id() + 1;
        }
        return 1;
    }


    public String toSaveMusic() {
        String text = "";
        for (Music x : music) {
            text += x.toSave() + "\n";
        }
        return text;
    }

    public void save() {
        try {
            File file = new File("C:\\Users\\flore\\Desktop\\mycode\\music-portal\\src\\res\\music.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(toSaveMusic());
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

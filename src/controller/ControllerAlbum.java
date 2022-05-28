package controller;

import model.Album;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerAlbum {
    private ArrayList<Album> albums;

    public ControllerAlbum() {
        albums = new ArrayList<>();
        this.load();
    }


    public void load() {
        try {
            File file = new File("C:\\Users\\flore\\Desktop\\mycode\\music-portal\\src\\res\\album.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                Album x = new Album(text);
                this.albums.add(x);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisare() {
        for (Album x : albums)
            System.out.println(x);
    }


    public void adaugare(Album albumNou) {
        Album x = findById(albumNou.getAlbum_id());
        if (x == null) {
            this.albums.add(albumNou);
        }
    }


    public void stergere(int id) {
        Album c = findById(id);
        if (c != null) {
            this.albums.remove(c);
        }
    }


    public void update(int id, String descriereNoua) {
        Album x = findById(id);
        if (x != null) {
            x.setAlbum_description(descriereNoua);
        }
    }

    public Album findById(int id) {
        for (Album x : albums) {
            if (x.getAlbum_id() == id) {
                return x;
            }
        }
        return null;
    }

    public Album findByName(String albumName) {
        for (Album x : albums) {
            if (x.getAlbum_name().equals(albumName)) {
                return x;
            }
        }
        return null;
    }

    public int nextId() {
        if (this.albums.size() >= 0) {
            return this.albums.get(this.albums.size() - 1).getAlbum_id() + 1;
        }
        return 1;
    }


    public String toSaveAlbums() {
        String text = "";
        for (Album x : albums) {
            text += x.toSave() + "\n";
        }
        return text;
    }

    public void save() {
        try {
            File file = new File("C:\\Users\\flore\\Desktop\\mycode\\music-portal\\src\\res\\album.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(toSaveAlbums());
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

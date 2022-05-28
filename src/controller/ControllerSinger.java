package controller;

import model.Music;
import model.Singer;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerSinger {
    private ArrayList<Singer> singers;

    public ControllerSinger(){
        singers=new ArrayList<>();
        this.load();
    }

    public void load() {
        try {
            File file = new File("C:\\Users\\flore\\Desktop\\mycode\\music-portal\\src\\res\\singer.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                Singer x = new Singer(text);
                this.singers.add(x);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisare() {
        for (Singer x : singers)
            System.out.println(x);
    }


    public void adaugare(Singer singerNou) {
       Singer x = findById(singerNou.getSinger_id());
        if (x == null) {
            this.singers.add(singerNou);
        }
    }


    public void stergere(int id) {
        Singer c = findById(id);
        if (c != null) {
            this.singers.remove(c);
        }
    }


    public void update(int id, String parolaNoua) {
        Singer x = findById(id);
        if (x != null) {
            x.setSinger_password(parolaNoua);
        }
    }

    public Singer findById(int id) {
        for (Singer x : singers) {
            if (x.getSinger_id() == id) {
                return x;
            }
        }
        return null;
    }


    public int nextId() {
        if (this.singers.size() >= 0) {
            return this.singers.get(this.singers.size() - 1).getSinger_id() + 1;
        }
        return 1;
    }


    public String toSaveSinger() {
        String text = "";
        for (Singer x : singers) {
            text += x.toSave() + "\n";
        }
        return text;
    }

    public void save() {
        try {
            File file = new File("C:\\Users\\flore\\Desktop\\mycode\\music-portal\\src\\res\\singer.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(toSaveSinger());
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

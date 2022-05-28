package ControllerMusicTest;

import controller.ControllerMusic;
import model.Music;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControllerMusicTest {

    @Test
    public void afisareTest() {
        ControllerMusic controllerMusic = new ControllerMusic();
        controllerMusic.afisare();
    }


    @Test
    public void adaugareTest() {
        ControllerMusic controllerMusic = new ControllerMusic();
        Music x = new Music(controllerMusic.nextId(), 4, "Black", "Rock", "des");
        controllerMusic.adaugare(x);
        assertEquals("Black", x.getMusic_name());

    }

    @Test
    public void nextIdTest() {
        ControllerMusic controllerMusic = new ControllerMusic();
        assertEquals(7, controllerMusic.nextId());
    }

    @Test
    public void findById() {
        ControllerMusic controllerMusic = new ControllerMusic();
        Music x = controllerMusic.findById(6);
        assertEquals("jazz", x.getMusic_type());

    }

    @Test
    public void findById2() {
        ControllerMusic controllerMusic = new ControllerMusic();
        assertEquals(null, controllerMusic.findById(10));
    }

    @Test
    public void findByName() {
        ControllerMusic controllerMusic = new ControllerMusic();
        Music x = controllerMusic.findByName("Pursuance");
        assertEquals(5, x.getMusic_album_id());
    }

    @Test
    public void findByName2() {
        ControllerMusic controllerMusic = new ControllerMusic();
        assertEquals(null, controllerMusic.findByName("nouaMuzica"));
    }

    @Test
    public void stergereTest() {
        ControllerMusic controllerMusic = new ControllerMusic();
        controllerMusic.stergere(3);
        assertEquals(null, controllerMusic.findById(3));
    }

    @Test
    public void updateTest() {
        ControllerMusic controllerMusic = new ControllerMusic();
        controllerMusic.update(4, "descriereNoua");
        assertEquals("descriereNoua", controllerMusic.findById(4).getMusic_description());
    }

}
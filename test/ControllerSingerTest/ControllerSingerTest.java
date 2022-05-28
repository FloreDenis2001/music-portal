package ControllerSingerTest;

import controller.ControllerSinger;
import model.Singer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControllerSingerTest {
    @Test
    public void afisareTest() {
        ControllerSinger controllerSinger = new ControllerSinger();
        controllerSinger.afisare();
    }

    @Test
    public void findByIdTest() {
        ControllerSinger controllerSinger = new ControllerSinger();
        assertEquals("Neil Young", controllerSinger.findById(2).getSinger_name());
    }

    @Test
    public void findById2() {
        ControllerSinger controllerSinger = new ControllerSinger();
        assertEquals(null, controllerSinger.findById(10));
    }

    @Test
    public void adaugareTest() {
        ControllerSinger controllerSinger = new ControllerSinger();
        Singer x = new Singer(controllerSinger.nextId(), 4, "Elvis", "00412412333", "elvis@yahoo.com", "elvis2001", "parolaE", "Victoriei 144");
        controllerSinger.adaugare(x);
        assertEquals("Elvis", controllerSinger.findById(6).getSinger_name());
    }

    @Test
    public void stergereTest() {
        ControllerSinger controllerSinger = new ControllerSinger();
        controllerSinger.stergere(3);
        assertEquals(null, controllerSinger.findById(3));
    }

    @Test
    public void updateTest() {
        ControllerSinger controllerSinger = new ControllerSinger();
        controllerSinger.update(3, "denis2001");
        assertEquals("denis2001", controllerSinger.findById(3).getSinger_password());
    }

    @Test
    public void nextIdTest() {
        ControllerSinger controllerSinger = new ControllerSinger();
        assertEquals(6, controllerSinger.nextId());
    }

}
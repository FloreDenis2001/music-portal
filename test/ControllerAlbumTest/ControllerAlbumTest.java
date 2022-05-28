package ControllerAlbumTest;

import controller.ControllerAlbum;
import model.Album;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerAlbumTest {
    @Test
    public void afisareTest(){
        ControllerAlbum controllerAlbum=new ControllerAlbum();
        controllerAlbum.afisare();
    }

    @Test
    public void adaugareTest(){
        ControllerAlbum controllerAlbum=new ControllerAlbum();
        Album x = new Album(controllerAlbum.nextId(),"Black","Rock","des");
        controllerAlbum.adaugare(x);
        assertEquals(6,x.getAlbum_id());

    }
    @Test
    public void nextIdTest(){
        ControllerAlbum controllerAlbum=new ControllerAlbum();
        assertEquals(6,controllerAlbum.nextId());
    }

    @Test
    public void findById(){
        ControllerAlbum controllerAlbum=new ControllerAlbum();
        Album x= controllerAlbum.findById(5);
        assertEquals("jazz",x.getAlbum_type());

    }
    @Test
    public void findById2(){
        ControllerAlbum controllerAlbum=new ControllerAlbum();
        assertEquals(null,controllerAlbum.findById(10));
    }
    @Test
    public void findByName(){
        ControllerAlbum controllerAlbum=new ControllerAlbum();
        Album x=controllerAlbum.findByName("Blue");
        assertEquals(4,x.getAlbum_id());
    }
    @Test
    public void findByName2(){
        ControllerAlbum controllerAlbum=new ControllerAlbum();
        assertEquals(null,controllerAlbum.findByName("Alex"));
    }

    @Test
    public void stergereTest(){
        ControllerAlbum controllerAlbum=new ControllerAlbum();
        controllerAlbum.stergere(3);
        assertEquals(null,controllerAlbum.findById(3));
    }

    @Test
    public void updateTest(){
        ControllerAlbum controllerAlbum=new ControllerAlbum();
        controllerAlbum.update(4,"descriereNoua");
        assertEquals("descriereNoua",controllerAlbum.findById(4).getAlbum_description());
    }






}
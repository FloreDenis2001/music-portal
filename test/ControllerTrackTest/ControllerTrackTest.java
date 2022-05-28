package ControllerTrackTest;

import controller.ControllerTrack;
import model.Track;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTrackTest {

    @Test
    public void afisareTest(){
        ControllerTrack controllerTrack=new ControllerTrack();
        controllerTrack.afisare();
    }

    @Test
    public void findById(){
        ControllerTrack controllerTrack=new ControllerTrack();
        assertEquals("rock",controllerTrack.findById(3).getTrack_type());
    }

   @Test
    public void findById2(){
        ControllerTrack controllerTrack=new ControllerTrack();
        assertEquals(null,controllerTrack.findById(11));
   }

   @Test
    public void adaugareTest(){
        ControllerTrack controllerTrack=new ControllerTrack();
       controllerTrack.adaugare(new Track(controllerTrack.nextId(),4,"Lazy","classic","descnoua"));
       assertEquals("Lazy",controllerTrack.findById(7).getTrack_name());
   }

   @Test
    public void stergereTest(){
        ControllerTrack controllerTrack=new ControllerTrack();
        controllerTrack.stergere(2);
        assertEquals(null,controllerTrack.findById(2));
   }
   @Test
    public void updateTest(){
        ControllerTrack controllerTrack=new ControllerTrack();
        controllerTrack.update(4,"descriereaNoua");
        assertEquals("descriereaNoua",controllerTrack.findById(4).getTrack_description());
   }

   @Test
    public void nextIdTest(){
        ControllerTrack controllerTrack=new ControllerTrack();
        assertEquals(7,controllerTrack.nextId());
   }

}
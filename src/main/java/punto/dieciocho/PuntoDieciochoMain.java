package punto.dieciocho;

import jdk.swing.interop.SwingInterOpUtils;
import utilities.MessagesWithJboss;

import java.util.ArrayList;

public class PuntoDieciochoMain {
    public static void main(String[] args) {
        ArrayList<Serie> seriesArray = new ArrayList<>();
        ArrayList<Videojuego> videoJuegosArray = new ArrayList<>();
        ArrayList<Object> entregadosArray = new ArrayList<>();
        MessagesWithJboss message=new MessagesWithJboss();
        Integer seriesEntregadas=0;
        Integer VidoJuegosEntregados=0;
        Serie serie1 = new Serie();
        Serie serie2 = new Serie("Stranger Things", "Matt y Ross Duffer");
        Serie serie3 = new Serie("Suits", 9, "Drama", "Universal Cable Productions");
        Videojuego videojuego1 = new Videojuego();
        Videojuego videojuego2 = new Videojuego("Dofus",120);
        Videojuego videojuego3 = new Videojuego("Pepsi Man",72,"Aventura","Kindle Imagine Develop");
        //Entregando series y videojuego
        serie1.entregar();
        serie3.entregar();
        videojuego3.entregar();
        //Agregar series al Array
        seriesArray.add(serie1);
        seriesArray.add(serie2);
        seriesArray.add(serie3);
        //Agregar videojuegos al Array
        videoJuegosArray.add(videojuego1);
        videoJuegosArray.add(videojuego2);
        videoJuegosArray.add(videojuego3);
        //Contar series y videojuegos
        for(int i=0;i<seriesArray.size();i++) {
            if (seriesArray.get(i).isEntregado()==true) {
               seriesEntregadas+=1;
               entregadosArray.add(seriesArray.get(i));
            }
        }
        for(int i=0;i<videoJuegosArray.size();i++) {
            if (videoJuegosArray.get(i).isEntregado()==true) {
                VidoJuegosEntregados+=1;
                entregadosArray.add(videoJuegosArray.get(i));
            }

        }
        message.printMessage("-----------------------------------\nSe encontraron "+seriesEntregadas+ " series entregadas y "+
                VidoJuegosEntregados+" videojuegos entregados. Se listan a continuación.");
        entregadosArray.forEach(Object -> {
            message.printMessage(Object.toString());
        });
        message.printMessage("-----------------------------------\nLa serie con mas temporadas es:\n"+serie3
                +"-----------------------------------\nEl videojuego con mas horas es:\n"+videojuego2);





    }
}

package strategy.ejercicio;

import java.util.ArrayList;

public class Client {
    public static void main(String []abx){
        ArrayList<Estudiante> estudiantes=new ArrayList<>();
        estudiantes.add(new Estudiante("Juan1",80));
        estudiantes.add(new Estudiante("Juan2",90));
        estudiantes.add(new Estudiante("Juan3",70));
        estudiantes.add(new Estudiante("Juan4",60));
        Colegio colegio = new Colegio(estudiantes);

        colegio.setStrategy(new Algoritmo1());
        colegio.execute();

        colegio.setStrategy(new Algoritmo2());
        colegio.execute();

        colegio.setStrategy(new Algoritmo3());
        colegio.execute();
    }
}

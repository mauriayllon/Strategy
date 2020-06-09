package strategy.ejercicio;

import java.util.ArrayList;

public class Algoritmo2 implements IStrategy {
    @Override
    public int execute(ArrayList<Estudiante> estudiantes) {
        System.out.println(" ");
        System.out.println("Ejecutando Insertion Sort");
        int i,j;
        for(i=1;i<estudiantes.size();i++){
            j = i-1;
            while(i>0 && estudiantes.get(j).getNota() > estudiantes.get(i).getNota()){
                Estudiante temp = estudiantes.get(i);
                estudiantes.set(i,estudiantes.get(j));
                estudiantes.set(j,temp);
            }
        }
        for(int k=0; k<estudiantes.size();k++)
        {
            System.out.print(estudiantes.get(k).getNota() + " ");
        }
        return 0;
    }
}

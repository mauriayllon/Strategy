package strategy.ejercicio;

import java.util.ArrayList;

public class Algoritmo3 implements IStrategy {
    @Override
    public int execute(ArrayList<Estudiante> estudiantes) {
        System.out.println(" ");
        System.out.println("Ejecutando Selection Sort");
        for (int outer = 0; outer < estudiantes.size(); outer++) {
            int minPosition=outer;
            for(int inner=outer;inner<estudiantes.size();inner++){
                if(estudiantes.get(inner).getNota()<estudiantes.get(minPosition).getNota()){
                    minPosition=inner;
                }
            }
            Estudiante temp=estudiantes.get(minPosition);
            estudiantes.set(minPosition,estudiantes.get(outer));
            estudiantes.set(outer,temp);
        }
        for(int k=0; k<estudiantes.size();k++)
        {
            System.out.print(estudiantes.get(k).getNota() + " ");
        }
        return 0;
    }
}

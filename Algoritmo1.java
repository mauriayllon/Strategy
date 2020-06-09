package strategy.ejercicio;

import java.util.ArrayList;

public class Algoritmo1 implements IStrategy {
    @Override
    public int execute(ArrayList<Estudiante> estudiantes) {
            System.out.println("Ejecutando Bubble Sort: ");
            for(int i=0; i<estudiantes.size(); i++)
            {
                for(int j=i + 1; j<estudiantes.size(); j++)
                {
                    if(estudiantes.get(i).getNota() > estudiantes.get(j).getNota())
                    {
                        Estudiante temp = estudiantes.get(i);
                        estudiantes.set(i,estudiantes.get(j));
                        estudiantes.set(j,temp);
                    }
                }

            }
        for(int i=0; i<estudiantes.size(); i++)
        {
            System.out.print(estudiantes.get(i).getNota() + " ");
        }
            return 0;
        }
}


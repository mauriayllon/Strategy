package strategy.ejercicio;

import java.util.ArrayList;

public class Colegio {
    private IStrategy strategy;
    private ArrayList<Estudiante> estudiantes;

    public Colegio(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void execute(){this.strategy.execute(this.estudiantes);
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}

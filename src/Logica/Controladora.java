package Logica;

import Persistencia.ControladoraPers;

public class Controladora {
    ControladoraPers controlPersis = new ControladoraPers();

    public void salvarPaciente(Paciente paci){
        controlPersis.salvarPaciente(paci);
    }

    public void modificarPaciente(Paciente paci){
        controlPersis.modificarPaciente(paci);
    }

    public Paciente traerPaciente(int numPaciente){
        return controlPersis.traerPaciente(numPaciente);
    }
}





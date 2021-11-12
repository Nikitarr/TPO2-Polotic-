
package Persistencia;

import Logica.Paciente;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPers {
    
    PacienteJpaController pacienteJpa = new PacienteJpaController();

    public void salvarPaciente (Paciente paci){
    
        try {
            pacienteJpa.create(paci);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPers.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void modificarPaciente (Paciente paci){
    
        try {
            pacienteJpa.edit(paci);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPers.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    public Paciente traerPaciente (int numPaciente){
        Paciente p = null;
        try {
            p = pacienteJpa.findPaciente(numPaciente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    
    }

}
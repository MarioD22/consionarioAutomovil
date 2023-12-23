
package com.concesionario.automovil.persistencia;

import com.concesionario.automovil.logica.Automovil;
import com.concesionario.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ControladoraPersistencia {

    AutomovilJpaController autoJPA = new AutomovilJpaController();
    
    public void AgregarAutomovil(Automovil auto) {
      
    autoJPA.create(auto);
    }

    public List<Automovil> traerAutos() {
        
    return autoJPA.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto) {
        try {
            autoJPA.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

    public Automovil traerAuto(int idAuto) {
    return autoJPA.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJPA.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}

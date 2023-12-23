
package com.concesionario.automovil.logica;

import com.concesionario.automovil.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {

    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void AgregarAutomovil(String modelo, String marca, String motor, String patente, int cantPuertas) {
        
        Automovil auto = new Automovil();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.AgregarAutomovil(auto);
        
    
    }

    public List<Automovil> traerAutos() {
       return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
       controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
    return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String patente, int cantPuertas) {
      //al auto le seteo los nuevos valores
      auto.setCantPuertas(cantPuertas);
      auto.setMarca(marca);
      auto.setModelo(modelo);
      auto.setMotor(motor);
      auto.setPatente(patente);
      
      //paso el auto modificado a la persistencia
      
      controlPersis.modificarAuto(auto);
        
    }

    
    
}

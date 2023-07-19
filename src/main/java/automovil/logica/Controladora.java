package automovil.logica;

import automovil.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    // 2 paso, creamos una instancia para poder controlar la controladora de la logica con la de la persistencia
    // esto significa creame una nueva variable o objeto o instancia de controladora de persistencia para que yo pueda utilizar en todos los metodos
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    // 1er paso Despues de agregar automovil en AltaAuto se creo este metodo aqui.
     public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        
     //3er paso
        automovil auto = new automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        
        //4 paso creamos el metodo agregar automovil y se crea el metodo en la clase Controladorapersistencia
        controlPersis.agregarAutomovil(auto);
        
    }

     //llamamos a la persistencia, este nos trae el metodo traer autos
    public List<automovil> traerAutos() {
     //la lista de autos que traiga los va a retornar a quien haya llamado este metodo( consulta automovil fue )
       return controlPersis.traerAutos();
        
        
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    
}

    public automovil traerAuto(int idAuto) {
        return controlPersis.traerAutos(idAuto);
    }

    public void modificarAuto(automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setPatente(patente);
        auto.setMotor(motor);
        auto.setCantPuertas(cantPuertas);
        
        
        //Le pido a la persis que modifique
        
        controlPersis.modificarAuto(auto);
        
    }
}
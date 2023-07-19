package automovil.persistencia;

import automovil.logica.automovil;
import automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    automovilJpaController autoJpa = new automovilJpaController(); //2 paso
    
    public void agregarAutomovil(automovil auto) { // 1 que se creo desde la clase controladora
     autoJpa.create(auto); // 3 paso y concluimos(Aqui ya se deberia poder ejecturar el programa y dar alta un automovil
    } // en el apartado dependencies hay que añadir add dependency y escribir mysql conector y add, despues clean and build.

    public List<automovil> traerAutos() {
        return autoJpa.findautomovilEntities(); // trae todos los registros q traiga de la tabla auto de la BBDD y lo devuelve en lista.
    }

    public void borrarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public automovil traerAutos(int idAuto) {
       return autoJpa.findautomovil(idAuto);
    }

    public void modificarAuto(automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

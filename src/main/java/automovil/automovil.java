package automovil;

import automovil.gui.Principal;


public class automovil {
    public static void main(String[] args) {
        Principal princ = new Principal(); //El main de la logica llama a la interfaz grafica, creando una instancia(un objeto principal) a esta variable(Objeto princ) asignarle un nuevo jframe principal
        princ.setVisible(true);// hacer que sea visible la pantalla principal
        princ.setLocationRelativeTo(null);// no tomes nada de referencia y que aparezca la pantalla en medio
    }
    
}
// esto despues de crear el Jframe Principal, se hace las 3 partes princ, visible y location
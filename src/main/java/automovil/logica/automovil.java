package automovil.logica;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class automovil  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;                                    
    private String modelo;
    private String marca;
    private String motor;
    private String color;
    private String patente;
    private int cantPuertas;

    public automovil() {
    }

    public automovil(int id, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        this.id = id;  
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.color = color;
        this.patente = patente;
        this.cantPuertas = cantPuertas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
    
    
    
}
// la logica recibe los datos de la interfaz grafica y crea el objeto. y ahora delego en la persistencia para que lo guarde en la BBDD
  // UNA CLASE SIEMPRE TIENE QUE TENER 3 cosas-> Atributos, constructores(uno vacio y otro con parametros) y getters(para obtener) y setters(setear)
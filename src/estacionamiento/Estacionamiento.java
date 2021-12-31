package estacionamiento;


/**
 *
 * @author Lucas
 */
public class Estacionamiento {

    // Atributos   
    private int capacidadAutos;
    private int capacidadMotos;
    private int capacidadBicis;
    private float tarifaAuto;

    // Constructor
    public Estacionamiento(int capacidadAutos, int capacidadMotos, int capacidadBicis, float tarifaAuto) {
        this.capacidadAutos = capacidadAutos;
        this.capacidadMotos = capacidadMotos;
        this.capacidadBicis = capacidadBicis;
        this.tarifaAuto = tarifaAuto;
    }

    // Getters para la capacidad del estacionamiento
    public int getCapacidadAutos() {
        return this.capacidadAutos;
    }

    public int getCapacidadMotos() {
        return this.capacidadMotos;
    }

    public int getCapacidadBicis() {
        return this.capacidadBicis;
    }

    // Metodos para aumentar o disminuir la capacidad
    public void aumentarCapacidadAutos() {
        capacidadAutos = getCapacidadAutos() + 1;
    }

    public void disminuirCapacidadAutos() {
        capacidadAutos = getCapacidadAutos() - 1;
    }

    public void aumentarCapacidadMotos() {
        capacidadMotos = getCapacidadMotos() + 1;
    }

    public void disminuirCapacidadMotos() {
        capacidadMotos = getCapacidadMotos() - 1;
    }

    public void aumentarCapacidadBicis() {
        capacidadBicis = getCapacidadBicis() + 1;
    }

    public void disminuirCapacidadBicis() {
        capacidadBicis = getCapacidadBicis() - 1;
    }

    // Setter para modificar la tarifa por hora de auto
    public void setTarifaAuto(float nuevaTarifa) {
        this.tarifaAuto = nuevaTarifa;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        Estacionamiento estacionamiento = new Estacionamiento(300, 50, 50, 100);
    }

}

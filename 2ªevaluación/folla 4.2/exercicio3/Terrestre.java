package exercicio3;

/**
 * Terrestre
 */
public class Terrestre extends Vehiculo implements Motor {

    int cantidadeRodas;
    String tipoVehiculo;

    public Terrestre(int cantidadeRodas, String tipoVehiculo, int velocidadeActual, int velocidadeMaxima) {
        this.cantidadeRodas = cantidadeRodas;
        this.tipoVehiculo = tipoVehiculo;
        this.velocidadeActual = velocidadeActual;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    void acelerar(int incremento) {
        velocidadeActual += incremento;
        if (velocidadeActual > velocidadeMaxima) {
            velocidadeActual = velocidadeMaxima;
        }
    }

    @Override
    void frear(int decremento) {
        velocidadeActual -= decremento;
        if (velocidadeActual < 0) {
            velocidadeActual = 0;
        }
    }

    @Override
    public int calculaRevolucionsMotor(int forza, int radio) {

        return forza * radio;
    }

}

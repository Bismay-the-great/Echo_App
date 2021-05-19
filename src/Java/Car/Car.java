package Car;


import java.util.Date;
import java.util.Objects;

public class Car {

    String Marca;
    String Modello;
    Date Anno;
    String Alimentazione;

    public Car() {
    }

    public Car(String marca) {
        Marca = marca;
    }

    public Car(String marca, String modello) {
        Marca = marca;
        Modello = modello;
    }

    public Car(String marca, String modello, Date anno, String alimentazione) {
        Marca = marca;
        Modello = modello;
        Anno = anno;
        Alimentazione = alimentazione;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModello() {
        return Modello;
    }

    public void setModello(String modello) {
        Modello = modello;
    }

    public Date getAnno() {
        return Anno;
    }

    public void setAnno(Date anno) {
        Anno = anno;
    }

    public String getAlimentazione() {
        return Alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        Alimentazione = alimentazione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Marca.equals(car.Marca) && Modello.equals(car.Modello) && Anno.equals(car.Anno) && Alimentazione.equals(car.Alimentazione);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Marca, Modello, Anno, Alimentazione);
    }

    @Override
    public String toString() {
        return "Car{" +
                "Marca='" + Marca + '\'' +
                ", Modello='" + Modello + '\'' +
                ", Alimentazione='" + Alimentazione + '\'' +
                '}';
    }
}

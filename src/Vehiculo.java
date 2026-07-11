public class Vehiculo {
    private static final int CIEN = 100;
    private String placa = null;
    private String marca;
    private double precio;
    private int cilindraje;
    private double impuestoCirculacion;
    private double cuotaMesGaraje = CIEN;

    public Vehiculo(String marca, double precio, int cilindraje) {
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        calcularImpuestoCirculacion();
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if (cuotaMesGaraje > 0) {
            this.cuotaMesGaraje = cuotaMesGaraje;
        }
        System.out.println("Valor inválido: No se puede procesar una cuota negativa");
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public void calcularImpuestoCirculacion() {
        System.out.println("2% importe del coche");
        this.impuestoCirculacion = this.precio * 0.02;
    }

    public boolean matricular(String placa) {
        if (placa.length() == 6) {
            this.placa = placa;
            return true;
        }
        return false;
    }
}

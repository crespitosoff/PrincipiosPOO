public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(boolean tieneSidecar) {
        super(marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void calcularImpuestoCirculacion() {
        if (tieneSidecar) {
            System.out.println("10% más importe del coche, o sea 12%");
            super.setImpuestoCirculacion(this.precio * 0.1)
            super.setCuotaMesGaraje(1.5);
        }
    }
}

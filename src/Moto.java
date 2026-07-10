public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void calcularImpuestoCirculacion() {
        if (tieneSidecar) {
            System.out.println("10% más importe del coche, o sea 12%");
            super.impuestoCirculacion = 0.12;
            super.cuotaMesGaraje = 1.5;
        }
    }
}

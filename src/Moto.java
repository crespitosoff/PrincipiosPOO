public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    @Override
    public void calcularImpuestoCirculacion() {
        if (tieneSidecar) {
            System.out.println("10% más importe del coche, o sea 12%");
            super.impuestoCirculacion = 0.12;
            super.cuotaMesGaraje = getCien() * 1.5;
        }
    }
}

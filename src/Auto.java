
public class Auto extends Vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;


    public Auto(boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
    }

    @Override
    public void calcularImpuestoCirculacion() {
        if (tieneRadio){
            System.out.println("Tiene Radio por lo tanto: Se incrementa 1% más al precio de la cuota");
            super.setImpuestoCirculacion(this.precio * 0.03);
        }
        if (tieneNavegador){
            System.out.println("Tiene navegador por lo tanto: Se incrementa 2% más al precio de la cuota");
            super.setImpuestoCirculacion(this.precio * 0.04);
        }
        if (super.cilindraje > 2499){
            super.setCuotaMesGaraje(120);
        }
    }
}

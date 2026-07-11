public interface iGaraje {
    public double calcularIngresos(Vehiculo registros) {
        int sumaIngresos = 0;
        for (int i = 0; i < registros.length; i++) {
            if (registros[i] != null) {
                sumaIngresos = +registros[i].precio;
            }
        }
    }

    public int calcularOcupacionPorTipoVehiculo(Vehiculo registros) {
        for (int i = 0; i < registros.length; i++) {
            
        }
    }
}
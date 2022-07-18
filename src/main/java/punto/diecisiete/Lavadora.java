package punto.diecisiete;

public class Lavadora extends Electrodomestico{
    private Double carga=5.0;

    public Lavadora() {
        super();
    }
    public Lavadora(Double precioBase, Double peso) {
        super(precioBase, peso);
    }
    public Lavadora(Double precioBase, String color, Double peso, Character consumoEnergetico, Double carga) {
        super(precioBase, color, peso, consumoEnergetico);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }
    @Override
    public Double calcularPrecioFinal(){
        Double precioFinalLavadora=0.0;
        if(this.carga>30.0){
            return precioFinalLavadora=super.calcularPrecioFinal()+50;
        }else{
            return precioFinalLavadora=super.calcularPrecioFinal();
        }
    }
}

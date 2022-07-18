package punto.diecisiete;

public class Television extends Electrodomestico {
    private Double resolucion=20.0;
    private Boolean sincronizadorTDT=false;

    public Television() {
        super();
    }

    public Television(Double precioBase, Double peso) {
        super(precioBase, peso);
    }

    public Television(Double precioBase, String color, Double peso, Character consumoEnergetico, Double resolucion, Boolean sincronizadorTDT) {
        super(precioBase, color, peso, consumoEnergetico);
        this.resolucion = resolucion;
        this.sincronizadorTDT = sincronizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public Boolean getSincronizadorTDT() {
        return sincronizadorTDT;
    }
    @Override
    public Double calcularPrecioFinal(){
        Double precioFinalTV=0.0;
        if(this.resolucion>40.0 && this.sincronizadorTDT==true){
            return precioFinalTV=super.calcularPrecioFinal()+((super.calcularPrecioFinal())*0.3)+50;
        }else if(this.resolucion>40.0){
            return precioFinalTV=super.calcularPrecioFinal()+((super.calcularPrecioFinal())*0.3);
        }else{
            return precioFinalTV=super.calcularPrecioFinal();
        }
    }
}

package punto.diecisiete;

import java.util.ArrayList;

public class Electrodomestico {
    protected Double precioBase=100.0;
    protected ArrayList coloresArray = new ArrayList();
    protected ArrayList<Character> consumoEnergeticoArray = new ArrayList();
    protected String color="Blanco";
    protected Double peso=5.0;
    protected Character consumoEnergetico='F';

    public void initArrays(){
        coloresArray.add("Blanco");
        coloresArray.add("Negro");
        coloresArray.add("Rojo");
        coloresArray.add("Azul");
        coloresArray.add("Gris");
        consumoEnergeticoArray.add('A');
        consumoEnergeticoArray.add('B');
        consumoEnergeticoArray.add('C');
        consumoEnergeticoArray.add('D');
        consumoEnergeticoArray.add('E');
        consumoEnergeticoArray.add('F');
    }

    public Electrodomestico() {
        initArrays();
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        initArrays();
    }

    public Electrodomestico(Double precioBase, String color, Double peso, Character consumoEnergetico) {
        this.precioBase = precioBase;
        this.color = color;
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;
        initArrays();
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color);
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public ArrayList getColoresArray() {
        return coloresArray;
    }

    public ArrayList<Character> getConsumoEnergeticoArray() {
        return consumoEnergeticoArray;
    }

    public String getColor() {
        return color;
    }

    public Double getPeso() {
        return peso;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }
    private	void comprobarConsumoEnergetico(char letra){
        Integer isInArray=consumoEnergeticoArray.indexOf(letra);
        if(isInArray>=0){
            consumoEnergetico=letra;
        }else{
            consumoEnergetico='F';
        }

    }
    private void comprobarColor(String colorElegido) {
        Integer isInArray=coloresArray.indexOf(colorElegido);
        if(isInArray>=0){
            color=colorElegido;
        }else{
            color="Blanco";
        }
    }
    public Double calcularPrecioFinal(){
        Double precioFinal=0.0;
        if(this.peso>=0 || this.peso<=19){
            precioFinal=10.0;
        }else if(this.peso>=20 || this.peso<=49){
            precioFinal=50.0;
        }else if(this.peso>=50 || this.peso<=79){
            precioFinal=80.0;
        }else if(this.peso>=80){
            precioFinal=100.0;
        }
        if(consumoEnergetico=='A'){
            precioFinal=precioFinal+100.0;
        }else if(consumoEnergetico=='B'){
            precioFinal=precioFinal+80.0;
        }else if(consumoEnergetico=='C'){
            precioFinal=precioFinal+60.0;
        }else if(consumoEnergetico=='D'){
            precioFinal=precioFinal+50.0;
        }else if(consumoEnergetico=='E'){
            precioFinal=precioFinal+30.0;
        }else if(consumoEnergetico=='F'){
            precioFinal=precioFinal+10.0;
        }
        return precioFinal=precioFinal+precioBase;
    }
}

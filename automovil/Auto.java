package automovil;

public class Auto extends Vehiculo {
    private int puertas;
    private static final int descuento = 10000;
    
    public Auto() {
        super();
    }

    public Auto(String marca, String color, int ruedas, int año, double precio, int puertas) {
        super(marca, color, ruedas, año, precio);
        this.puertas = puertas;
    }

    public void acelerar(){
        if(velocidad < 200){
            velocidad += 50;
            System.out.println("El vehiculo acelera");
            System.out.println("La velocidad es: "+velocidad);
        } else{
            System.out.println("El vehiculo alcanzó su máxima velocidad");
        }
    }
    
    public void frenar() {
        if(velocidad > 0){
            velocidad -= 50;
            System.out.println("El vehiculo esta frenando");
            System.out.println("La velocidad es: "+velocidad);
        }
        else{
            System.out.println("El vehiculo esta completamente frenado");
        }
    }

    public void setPuertas(int puertas){
        this.puertas = puertas;
    }

    public int getPuertas(){
        return puertas;
    }

    public int getDescuento(){
        return descuento;
    }

    public double getPrecioConDesc(){
       return getPrecio() - descuento;
    }

    public String toString(){
        return "Auto "+ getPatente();

    }

    
}

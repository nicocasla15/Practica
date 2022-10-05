package automovil;

public class Moto extends Vehiculo{
    private static int descuento = 5000;

    public Moto(){
        super();
    }

    public Moto(String marca, String color, int ruedas, int año, double precio){
        super(marca,color,ruedas,año,precio);
    }

    public void acelerar() {
        if(velocidad < 120){
            velocidad += 30;
            System.out.println("El vehiculo acelera");
            System.out.println("La velocidad es: "+velocidad);
        } else if(velocidad == 120) {
            System.out.println("El vehiculo alcanzó su máxima velocidad");
        }
        
    }

    public void frenar() {
        if(velocidad > 0){
            velocidad -= 30;
            System.out.println("El vehiculo esta frenando");
            System.out.println("La velocidad es: "+velocidad);
        }
        else{
            System.out.println("El vehiculo esta completamente frenado");
        }
    }

    public int getDescuento(){
        return descuento;
    }

    public double getPrecioConDesc(){
        return getPrecio() - descuento;
    }

    public String toString(){
        return "Moto "+getPatente();
    }

}

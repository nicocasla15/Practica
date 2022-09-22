package Nada;

public abstract class Vehiculo {
    private String marca;
    private String color;
    private int ruedas;
    private int año;
    private double precio;
    protected int velocidad = 0;
    private String patente;
    protected int multa;


    public Vehiculo() {
        marca = " ";
        color = " ";
        ruedas = 0;
        año = 0;
        precio = 0;
    }

    public Vehiculo(String marca, String color, int ruedas, int año, double precio) {
        this.marca = marca;
        this.color = color;
        this.ruedas = ruedas;
        this.año = año;
        this.precio = precio;

    }

    public void arrancar() {  
        System.out.println("El vehiculo " + color + " arranca");
        int velocidad = 0;
        this.velocidad = velocidad;
    }

    public abstract void acelerar();

    public abstract void frenar();

    public String getMarca(){
        return marca;
    }

    public String getColor(){
        return color;
    }

    public int getAño(){
        return año;
    }

    public double getPrecio(){
        return precio;
    }

    public double getRuedas(){
        return ruedas;
    }

    public int getVelocidad(){
        return velocidad;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setAño(int año){
        this.año = año;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setRuedas(int ruedas){ 
        this.ruedas = ruedas;
    }

    public String getPatente(){
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMulta(){
        return "La multa es de: "+multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

}

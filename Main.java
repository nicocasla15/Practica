package Nada;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Negro", 4, 2022, 500000.00, 5);
        Auto auto2 = new Auto("Chevrolet", "azul", 4, 2021, 400000,5);
        System.out.println(auto.getMarca());
        Moto moto = new Moto("Yamaha", "Azul", 2, 2021, 200000);
        moto.arrancar();
        moto.acelerar();
        moto.setAño(2018);
        System.out.println(moto.getAño());
        System.out.println(auto.getPuertas());
        System.out.println(moto.getDescuento());
        System.out.println(auto.getDescuento());
        System.out.println(auto.getPrecioConDesc());
        System.out.println(auto.getDescuento());
        auto.acelerar();
        auto.acelerar();
        auto.acelerar();
        auto.acelerar();
        auto.acelerar();
        RegistroAutomotor.setPatente(auto, "ggsdg999");
        RegistroAutomotor.setPatente(moto, "ddds42239");
        RegistroAutomotor.setPatente(auto2, "dfsf4444");
        System.out.println(auto.getPatente());
        System.out.println(auto2.getPatente());
        System.out.println(RegistroAutomotor.getList());
        RegistroAutomotor.setMulta(auto, 5000);
        RegistroAutomotor.setMulta(auto2, 2500);
        RegistroAutomotor.setMulta(moto, 3000);
        System.out.println(auto.getMulta());
        System.out.println(auto2.getMulta());
        System.out.println(RegistroAutomotor.getTotalMultas());
        System.out.println(RegistroAutomotor.getVehiculosConMultas());
        System.out.println(RegistroAutomotor.getMayorMulta());
    }
}        
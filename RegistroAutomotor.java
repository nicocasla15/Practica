package Nada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RegistroAutomotor {
    private static List<Vehiculo> vehiculosRegistrados = new ArrayList<>();
    private static List<Vehiculo> vehiculosConMultas = new ArrayList<>();
    private static List<Integer> contadorMultas = new ArrayList<>();
    public RegistroAutomotor(){
        super();
    }

    public static String getList(){
        return "Vehiculos Registrados: "+vehiculosRegistrados;
    }

    public static void setPatente(Vehiculo anyVehicle, String patente) {
       anyVehicle.setPatente(patente);
       vehiculosRegistrados.add(anyVehicle);
    }

    public static void setMulta(Vehiculo anyVehicle, int multa) {
        anyVehicle.setMulta(multa);
        vehiculosConMultas.add(anyVehicle);
        contadorMultas.add(multa);
    }

    public static void pagarMulta(Vehiculo anyVehicle, int montoPagar){
        anyVehicle.setMulta(anyVehicle.multa-montoPagar);
        System.out.println("Se completó el pago de la multa");
        contadorMultas.remove(Integer.valueOf(montoPagar));
    }

    public static int getTotalMultas(){
        int tot = contadorMultas.stream().mapToInt(Integer::intValue).sum();
        return tot;
    }

    public static String getVehiculosConMultas(){
        return "Los vehiculos con multas son: "+vehiculosConMultas.size()+""+vehiculosConMultas;
    }

    public static String getMayorMulta() {
        return "La multa de mayor monto es: " + Collections.max(contadorMultas);
    }
    

}

package Nada;

import java.util.ArrayList;
import java.util.List;

public class RegistroAutomotor {
    private static List<String> vehiculosRegistrados = new ArrayList<>();
    private static List<String> vehiculosConMultas = new ArrayList<>();
    private static int contadorMultas = 0;
    private static int contadorVehiculosConMultas = 0;
    private static int mayorMulta = 0;
    
    public RegistroAutomotor(){
        super();
    }

    public static String getList(){
        return "Vehiculos Registrados: "+vehiculosRegistrados;
    }

    public static void setPatente(Vehiculo anyVehicle, String patente) {
       anyVehicle.setPatente(patente);
       vehiculosRegistrados.add(""+anyVehicle);
    }

    public static void setMulta(Vehiculo anyVehicle, int multa) {
        anyVehicle.setMulta(multa);
        vehiculosConMultas.add(""+anyVehicle);
        contadorMultas += multa;
        contadorVehiculosConMultas += 1;
        if(multa > mayorMulta){
            mayorMulta = multa;
        }
    }

    public static int getTotalMultas(){
        return contadorMultas;
    }

    public static String getVehiculosConMultas(){
        return "Los vehiculos con multas son: "+contadorVehiculosConMultas+""+vehiculosConMultas;
    }

    public static String getMayorMulta() {
        return "La multa de mayor monto es: " + mayorMulta;
    }
    
}

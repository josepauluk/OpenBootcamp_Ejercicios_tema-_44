import java.util.Arrays;

public class javaSwitch {
    public static void main(String[] args) {
        var estacion = "PRIMAVERA";

        switch (estacion) {
            case "VERANO":
                System.out.println("Es verano");
            case "INVIERNO":
                System.out.println("Es invierno");
            case "OTOÑO":
                System.out.println("Es otoño");
            default:
                System.out.println(estacion);
        }
    }
}

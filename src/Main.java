import java.math.BigDecimal;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Karel Novotný";
        LocalDate dateOfBirth = LocalDate.of(1990, 5, 20);
        int contracts = 2;
        double soldCarrotsInTons = 5.2;
        String cityName = "Pardubice";
        String spz = "7P53425";
        double fuelEffiency = 6.2;
        String ipAdress = "192.168.48.39";
        double averageAmmountOfSoldCarrotPerContract = soldCarrotsInTons / contracts;
        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu je: " +averageAmmountOfSoldCarrotPerContract+ " tuny.");



    }
}
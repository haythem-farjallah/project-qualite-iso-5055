package haythem.cwe561;

public class TemperatureMonitor {
    public void monitorTemperatures(int[] temperatures) {
        int index = 0;
        while (index < temperatures.length) {
            int temp = temperatures[index];

            if (temp > 160) {
                System.out.println("Alerte : Température critique détectée : " + temp + "°F");
                if (temp < 150) {
                    System.out.println("Alerte maximale : Système de refroidissement activé !");
                }
            } else if (temp > 90) {
                System.out.println("Température élevée : " + temp + "°F");
            } else {
                System.out.println("Température normale : " + temp + "°F");
            }

            index++;
        }
    }
}


public class Main {
    public static double odlegloscXY(double[] x, double[] y){
        double wynik = 0;
        if (x == null || y == null) {
            throw new IllegalArgumentException("punkty sa nullami");
        }
        for (int i = 0; i < x.length; i++) {
            double wzor = Math.pow(x[i] - y[i], 2);
            wynik = wynik + wzor;
        }

        return Math.sqrt(wynik);
    }
}

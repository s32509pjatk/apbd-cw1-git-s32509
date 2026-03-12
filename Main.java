public class Main {
    public static double odlegloscXY(double[] x, double[] y){
        double wynik = 0;
        for (int i = 0; i < x.length; i++) {
            double wzor = Math.pow(x[i] - y[i], 2);
            wynik = wynik + wzor;
        }

        return Math.sqrt(wynik);
    }
}

public class Main {

    public static double odlegloscXY(double[] x, double[] y){
        double wynik = 0;
        if (x == null || y == null) {
            throw new IllegalArgumentException("punkty sa nullami");
        }
        if (x.length == 0) {
            return 0;
        }

        if (x.length != y.length) {
            throw new IllegalArgumentException("punkty nie maja tych samych wymiarów");

        }
        for (int i = 0; i < x.length; i++) {
            wynik += Math.pow(x[i] - y[i], 2);
        }

        return Math.sqrt(wynik);
    }


    public double calculateAverage(int[] values){

        double wynik=0;

        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        for (int val : values) {
            wynik += val;
        }
        return  wynik / values.length;

    }
    public int calculateMax(int[] values){
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int maxValue=values[0];
        for(int val : values){
            if(maxValue<val)
                maxValue=val;

        }
        return maxValue
    }

    public int calculateMin(int[] values) {

        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int minValue = values[0];

        for (int val : values) {
            minValue = Math.min(minValue, val);

        }
        return minValue;
    }

}

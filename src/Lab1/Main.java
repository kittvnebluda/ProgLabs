package Lab1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //make array with a numbers
        short[] a = new short[8];
        for(short i = 1; i < 9; i++) {
            a[i - 1] = (short)(i * 2);
        }

        Random rnd = new Random();

        //make array with random numbers
        float[] x = new float[16];
        for(int i = 0; i < 16; i++) {
            float rand_num = rnd.nextInt(15 + 10) - 10 + rnd.nextFloat();
            x[i] = (float)Math.floor(rand_num * 10) / 10;
        }

        //make 2 dim array with formula
        double[][] c = new double[8][16];
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 16; j++) {
                switch (a[i]) {
                    case 14 -> c[i][j] = Math.tan(Math.pow(Math.pow(x[j], 1 / 3f) / 2, Math.asin((x[j] + 2.5) / 25)));
                    case 4, 6, 10, 16 -> c[i][j] = Math.pow((1 - Math.tan(Math.tan(x[j]))) / 3, 2);
                    default -> c[i][j] = Math.sin(Math.log(3 / Math.pow(Math.sin(x[j]), 2)));
                }
            }
        }

        //output 2 dim array
        for(double[] c_: c) {
            for(int i = 0; i < 15; i++) {
                System.out.printf("%.2f ", c_[i]);
            }
            System.out.printf("%.2f\n", c_[15]);
        }
    }
}
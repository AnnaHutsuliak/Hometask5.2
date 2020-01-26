package epam.com;
import java.util.Arrays;
public class Task {
    public static void main(String[] args) {
        double[] firstArray = new double[5];
        firstArray[0] = (Math.random() * -100);
        firstArray[1] = (Math.random());
        firstArray[2] = (Math.random()) * -100;
        firstArray[3] = (Math.random());
        firstArray[4] = (Math.random());
        System.out.println(Arrays.toString(firstArray));

        double[] secondArray = new double[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] < 0)
                secondArray[i] = firstArray[i];
        }
        System.out.println(Arrays.toString(secondArray));


        double[] thirdArray = new double[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] > 0)
                thirdArray[i] = firstArray[i];
        }
        System.out.println(Arrays.toString(thirdArray));

    }
}

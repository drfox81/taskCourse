import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int buffer;
        int[] arrayA={1,2,3,4,5,6,7,8,9};

        for (int i=0; i<arrayA.length/2;i++){
            buffer = arrayA[i];
            arrayA[i]=arrayA[arrayA.length-1-i];
            arrayA[arrayA.length-1-i]=buffer;
        }
        System.out.println(Arrays.toString(arrayA));
    }
}
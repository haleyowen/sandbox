import java.util.Scanner;

public class MessingWithNumbers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("How many numbers are you using: ");
        int size = sc.nextInt();

        float[] arr = new float[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Index " + i + ": ");
            arr[i] = sc.nextFloat();
        }
        
        double total = 0;
        for(int i = 0; i < size; i++) {
            total += arr[i];           
        }
        double avg = total/size;
        double avgsqd = Math.pow(avg, 2);
        double totalsqd = 0;

        for(int i = 0; i < size; i++) {
            totalsqd += Math.pow(arr[i], 2);  
        }
        double avgtotalsqd = totalsqd/size;
        double ans = Math.sqrt(avgtotalsqd - totalsqd);
        System.out.println("Average = " + avg);
        System.out.println("Answer = " + ans);
    }
}

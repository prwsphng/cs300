// to find the 30% of ค่าระดับของเสียจากบริเวณรอบอ่างทดลองของสาหร่ายแต่ละชนิด
import java.util.*;
public class Average{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // input size of array
        int n = scan.nextInt();

        // create arr 
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        // index pf 30%
        double temp = Math.ceil(n*0.3);

        // sorting 
        Arrays.sort(arr);

        int sum = 0;
        for(int i=0; i< (int)temp; i++){
            sum += arr[i];
        }
        int result = sum / (int)temp;

        System.out.println(result);
        scan.close();
    }
}

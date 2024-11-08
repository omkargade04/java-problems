import java.util.Scanner;

public class code1{

    public static int smallestMissingElement(int[] arr, int n) {
        int l = 0;
        int h = n - 1;

        while(l <= h) {
            int mid = l + (h-l)/2;

            if(arr[mid] == arr[0] + mid) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return arr[0] + l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) {
            int e = sc.nextInt();
            arr[i] = e;
        }

        int ans = smallestMissingElement(arr, n);
        System.out.println("Smallest missing element: " + ans);
    }
}
import java.util.Arrays;
import java.util.Scanner;
public class Array{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++)
            myArray[i] = sc.nextInt();
        Arrays.sort(myArray);
        
        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }
        double average = (double) sum / myArray.length;
        
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(myArray));
        System.out.println("Tổng của các phần tử trong mảng: " + sum);
        System.out.println("Giá trị trung bình của các phần tử trong mảng: " + average);
        
        sc.close();
	}
}
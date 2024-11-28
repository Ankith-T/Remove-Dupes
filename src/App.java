import java.util.Scanner;
import java.util.LinkedHashSet;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter Ten Numbers: ");
        int tenNums[] = new int[10];
        for (int i=0; i<10; i++){
            tenNums[i] = numScanner.nextInt();
        }
        numScanner.close();
        eliminateDuplicates(tenNums);
        }
    public static int[] eliminateDuplicates(int[] list){
        LinkedHashSet<Integer> newList = new LinkedHashSet<Integer>();
        for (int i = 0; i<10; i++){
            newList.add(list[i]);
        }
        System.out.print("Distinct Numbers inputted are " + newList);
        return list;
    }
    

}

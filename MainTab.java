import java.util.Scanner;
public class MainTab{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int size = 0;
   
    //table creation
    System.out.println("enter the size of table");
    size = input.nextInt();
    int [] T = new int [size];
    int [] Texple = {10,20,5,3,4};
   
    //table fill
    for(int i=0;i<T.length;i++){
        System.out.println("enter the value of T["+i+"]");
        T[i]=input.nextInt();    
    }

    //table sum
    int sumTab =0;
    for(int i=0;i<T.length;i++){
        sumTab = sumTab + T[i];    
    }
    System.out.println("the sum of Table is = "+sumTab);

   
       
    

}
}
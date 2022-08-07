import java.util.Scanner;
public class MainTab{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int size = 0;
    int temp;
   
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

    //table min and max
    int minTab = T[0];
    int maxTab = T[0];
    for(int i=0;i<T.length;i++){
     if (T[i]<minTab){
        minTab = T[i];
     }else if (T[i]<maxTab){
        maxTab = T[i];
     }
       
    }
    System.out.println("the min of Table is = "+minTab);
    System.out.println("the max of Table is = "+maxTab);
    /* 
     *  inverse table  T
    //inverse table compteur
    for(int j=T.length-1;j>=0;j--){
          
          System.out.println("T["+(T.length-1-j)+"]= "+ T[j]);
    }
    
    */
    // trier le tableau 
    int [] r = new int [size];
    for (int i =0 ; i < size ;  i++){
        r[i]= T[size-i-1];
    }
   // print reverse tab
   for ( int i=0 ; i<r.length;i++)
   System.out.print(r[i]+" ");
   System.out.println();



/* tri  */
   
        for ( int i=0 ; i<T.length-1;i++){
         for ( int j=i+1 ; j<T.length;j++){
            if(T[i]>T[j]){
               temp =T[i];
               T[i]=T[j];
               T[j]= temp;
            }
         }
           
        }


      /* tri  a bulle */
   
      for ( int i=0 ; i<T.length-1;i++){
         for ( int j=0 ; j<T.length-1-i;j++){
            if(T[j]<T[j+1]){
               temp =T[j];
               T[j]=T[j+1];
               T[j+1]= temp;
            }
         }
           
        }







   /*print T  */
   for ( int i=0 ; i<T.length;i++)
   System.out.print(T[i]+" ");
   System.out.println();
    
    }

    


      
      
  
    



   
       
    

}

public class MainTab{

public static void main(String []args) {
    int [] T = {10,20,5,3,4};
    int SumTab=0, MaxTab =0; 
    // the sum  
    for(int i=0;i<T.length;i++)
    SumTab = SumTab +T[i];
    System.out.println("the sum of tab is "+SumTab);
   // the max 
    for (int i=0 ;i<T.length;i++){
        if (T[i]>=T[i+1])
        MaxTab =T[i];
        else 
        MaxTab =T[i+1];
    }
    System.out.println(MaxTab);
}
}
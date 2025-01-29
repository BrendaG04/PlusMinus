import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) throws Exception {

        List<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(-1);        
        arr.add(0);
        arr.add(1);        
        arr.add(0);
        arr.add(-1);        
        arr.add(1);
        arr.add(1);        
        arr.add(-1);
        plusMinus(arr);

    }


    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int zeroC=0;
    int positiveC=0;
    int negativeC=0;
    int n= arr.size();
    
    for (int i=0; i<arr.size();i++){
        if (arr.get(i)>0){
            positiveC++;     
        } else if (arr.get(i)<0){
            negativeC++;
        } else {
            zeroC++;
        }   
    }
    
    double positiveR= (double) positiveC/n;
    double negativeR= (double) negativeC/n;
    double zeroR= (double) zeroC/n;

    System.out.printf("%.6f%n", positiveR);
    System.out.printf("%.6f%n", negativeR);
    System.out.printf("%.6f%n", zeroR);
    }

}


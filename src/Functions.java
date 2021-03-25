import java.util.Arrays;

public class Functions {


    static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    static int sum()
    {
        int sum = 0;
        int i;

        for (i = 0; i < numbers.length; i++)
            sum +=  numbers[i];

        return sum;
    }

    static int nrImpare(){

        int nrImpare=0;
        int i;

        for(i=0;i<numbers.length;i++){
            if(numbers[i]%2!=0){
              nrImpare++;
            }
        }
        return nrImpare;
    }

    static int maiMare(){
        int a = 7;
        int i;

        for(i=0;i<= numbers.length;i++){
            if(a<i){
                System.out.println(i + " este mai mare decat "+ a);
            }
        }return i ;
    }

    public static void main(String[] args) {
         System.out.println(sum());
         System.out.println(nrImpare());
         System.out.println(maiMare());
    }
}
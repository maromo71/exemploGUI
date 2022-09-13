public class Main {
    public static void main(String[] args) {
        int x[] = {1,3,5,7,9,11};
      //  for (int i = 0; i < x.length; i++) {
       //     System.out.println(x[i]);
       // }
        for(int y : x){
            System.out.println(y);
        }
        System.out.printf("O valor eh %d \n", x[1]);
    }
}
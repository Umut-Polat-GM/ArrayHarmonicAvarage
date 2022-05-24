public class ArrayAvarage {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        double sum=0;

        for (double i:arr){
            sum+=1/i;
        }
        System.out.println(sum);
    }
}

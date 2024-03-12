import java.util.Arrays;

public class Odd {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        System.out.println("Odd : ");
        Arrays.stream(nums).filter(a->a%2 != 0).forEach(System.out::println);
        System.out.println("Even : ");
        Arrays.stream(nums).filter(a->a%2 == 0).forEach(a -> System.out.print(a +" "));
    }
}

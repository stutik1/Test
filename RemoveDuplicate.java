import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(2, 5, 7, 2, 9, 5, 8, 3, 4, 7, 6, 8, 9);
        int[] arr= {1,1,3,4,5,5,6};
       // Arrays.stream(arr).distinct().forEach(System.out::println);
       // lists.stream().distinct().forEach(System.out::println);
        lists.stream().filter(a->a%2==0).forEach(System.out::println);
        lists.stream().filter(a->a%2!=0).forEach(a->System.out.print(a+" "));
    }
}

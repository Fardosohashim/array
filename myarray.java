package array;

public class myarray {
    public static void main(String[] args) {
        int add[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : add)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}

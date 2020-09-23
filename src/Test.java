import java.util.*;
import java.util.stream.Collectors;
/**
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * */
public class Test {
    static int testA[] = {1, 3, 6, 4, 1, 2};
    static int testB[] = {1, 2, 3};
    static int testC[] = {-1, -3};

    public static void main(String[] args) {
        System.out.println(solution(testA)+ " expected 5");
        System.out.println(solution(testB)+ " expected 4");
        System.out.println(solution(testC)+ " expected 1");
    }
    public static int solution(int[] A) {
        Arrays.sort(A);
        int val = 0;
        for(int i = 0, j = i+1; j <= A.length; i ++, j++) {
            if(j < A.length && A[i] + 1 < A[j] || j == A.length) {
               val = A[i] + 1;
               break;
            }
        }
        return val > 0 ? val : 1;
    }
}

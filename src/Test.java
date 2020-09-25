import java.util.Arrays;

/**
 * This is a demo task.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * <p>
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * <p>
 * Given A = [1, 2, 3], the function should return 4.
 * <p>
 * Given A = [−1, −3], the function should return 1.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class Test {
    static int[] testA = {1, 3, 6, 4, 1, 2};
    static int[] testB = {1, 2, 3};
    static int[] testC = {-1, -3};

    public static void main(String[] args) {
        System.out.println(solution(testA) + " expected 5");
        System.out.println(solution(testB) + " expected 4");
        System.out.println(solution(testC) + " expected 1");
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i <= A.length - 1; i++)
            if (i + 1 < A.length && A[i] + 1 < A[i + 1] || i + 1 == A.length)
                return A[i] + 1 > 0 ? A[i] + 1 : 1;
        return 0;
    }
}

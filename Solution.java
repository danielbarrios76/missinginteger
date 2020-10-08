import java.util.Arrays;

public class Solution {

    private static int find(int[] array){
      int number = 0;
      int i = 0;

      while(i < array.length) {
        if (array[i] > 0) {
          if (find(array, (array[i] + 1)) < 0) {
            number = array[i]+ 1;
            i=array.length;
          }
        }
        i++;
      }
      if (number == 0) {
        number = array[array.length - 1] + 1;
      }
      return number;
    }


    private static int find(int[] array, int target){
	    int index = Arrays.binarySearch(array, target);
	    return (index < 0) ? -1 : index;
    }

    public static int solution(int[] A) {
      int number = 0;
      Arrays.sort(A);
      
      if (A[A.length-1] < 0) {
          number = 1;
      } else {
        if (find(A, 1) == -1){
          number = 1;
        } else {
          number = find(A);
        }
      }

      return number;
    }

    public static void main(String[] args) {

      //Example arrays 
      int[] array1 = {1, 3, 6, 4, 1, 2};
      int[] array2 = {-1,-3,-4,-6,-3,-2,-1,-1,-1,-6,-6,-2};
      int[] array3 = {-1,3,2};
      int[] array4 = {1,2,3};
      int[] array5 = {0,1,3,4,5,};
      int[] array6 = {-10,-21,-258,321545,-654687, 1,3};
        
      System.out.println(Solution.solution(array1));
      System.out.println(Solution.solution(array2));
      System.out.println(Solution.solution(array3));
      System.out.println(Solution.solution(array4));
      System.out.println(Solution.solution(array5));
      System.out.println(Solution.solution(array6));
    
    }




  }




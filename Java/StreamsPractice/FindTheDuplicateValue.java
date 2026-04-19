package StreamsPractice;

public class FindTheDuplicateValue {
    public static void main(String[] args) {


    int[] arr = {1, 3, 4, 2, 2, 5,5, 3};

    for(int i = 0; i< arr.length -1; i++) {

          int val = i +1;

          while(val < arr.length-1 && arr[i]!=arr[val] ) {
              val++;
//              System.out.println(" Val " +val);
          }
          if(val!=i){
              System.out.println("Answer "+arr[val]);
          }

      }

    }

}

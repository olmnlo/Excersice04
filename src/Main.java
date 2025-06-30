import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        1.Write a Java program to test if the first and the last element of an array of
//        integers are same. The length of the array must be greater than or equal to
//        2 Test Data:
//        array = 50, -20, 0, 30, 40, 60, 10
//        Sample Output: false

        int[] numbers1 = {50,-20,0,30,40,60,10};
        System.out.println(numbers1[0]== numbers1[numbers1.length-1]);

//        2.Write a Java program to find the numbers greater than the average of the
//        numbers of a given array.
//                Original Array:
//        [1, 4, 17, 7, 25, 3, 100]
//        Expected Output:
//        The average of the said array is: 22.0 The numbers in the said array that are
//        greater than the average are: 25 100
        int[] numbers2 = {1, 4, 17, 7, 25, 3, 100};
        int total1 = 0;
        for (int n: numbers2){
            total1+=n;
        }
        ArrayList<Integer> greater_than_avg = new ArrayList<>();
        double average = (double)total1/numbers2.length;
        for (int n: numbers2){
            if(n > average){
                greater_than_avg.add(n);
            }
        }
        System.out.printf("the average of the said array is: %.2f The numbers in the said array that are greater than average are: %s\n", average, greater_than_avg);

//       3. Write a Java program to get the larger value between first and last
//        element of an array of integers.
        int[] numbers3 = {20, 40, 30};
        int max;
        if (numbers3[0] >= numbers3[numbers3.length-1]){
            max = numbers3[0];
        }else{
            max = numbers3[numbers3.length-1];
        }
        System.out.println("Larger value is: "+ max);


//        4.Write a Java program to swap the first and last elements of an array and
//        create a new array.
        int[] numbers4 = {20, 30, 40};
        ArrayList<Integer> new_array = new ArrayList<>();

        for (int i = 0; i < numbers4.length; i++) {
            new_array.add(numbers4[i]);
        }
        int first = numbers4[0];
        int last = numbers4[numbers4.length-1];
        new_array.set(0, last);
        new_array.set(new_array.size()-1, first);
        System.out.println("New array after swapping the first and last elements: "+ new_array);


//        5. Write a program that places the odd elements of an array before the
//        even elements.

        ArrayList<Integer> numbers5 = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        //2,3,40,1,5,9,4,10,7
        numbers5.add(2);
        numbers5.add(3);
        numbers5.add(40);
        numbers5.add(1);
        numbers5.add(5);
        numbers5.add(9);
        numbers5.add(4);
        numbers5.add(10);
        numbers5.add(7);

        for (Integer n : numbers5){
            if(n % 2 == 0){
                even.add(n);
            }else{
                odd.add(n);
            }
        }

        ArrayList<Integer> new_array2 = new ArrayList<>();
        new_array2.addAll(odd);
        new_array2.addAll(even);
        System.out.println(new_array2);

//        6. Write a program that test the equality of two arrays.
       ArrayList<Integer> first_array = new ArrayList<>();
       first_array.add(2);
       first_array.add(3);
       first_array.add(6);
       first_array.add(6);
       first_array.add(4);
       ArrayList<Integer> second_array = new ArrayList<>();
       second_array.add(2);
       second_array.add(3);
       second_array.add(6);
       second_array.add(6);
       second_array.add(4);
       System.out.println(first_array.equals(second_array));


    }
}
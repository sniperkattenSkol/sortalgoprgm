// Nils E Lindfors TE15 
// 2017-04-03
// 09:50
public class sorterING {


    public static void main(String[] args) {
        int [] numbers = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75,77,99,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19};
        double [] numbersDouble  = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};
        String [] numbersString = {"aab" , "aaa", "ai" ,"aeea","aaAAaf","klks", "AAaaaaaaaaaaaaaaaaaaaaaaaaaal"};

        //Alla print metoder är enbart för test programet samt int, double och string arrayn.
        binarySearch searchBinary = new binarySearch();
        Sort staticRunner = new Sort();

        staticRunner.selSortInt(numbers);
        staticRunner.printArray(numbers);
        searchBinary.BinarySearch(numbers, 999);
        //staticRunner.printArray(numbers);


       /* staticRunner.selSortDouble(numbersDouble);
        staticRunner.printArrayDouble(numbersDouble);
75
        staticRunner.selSortStringLength(numbersString);
        staticRunner.printArrayString(numbersString);
*/
      // staticRunner.selSortStringAlpha(numbersString);
       //staticRunner.printArrayString(numbersString);

    }

}
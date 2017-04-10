// Nils E Lindfors TE15 
// 2017-04-03
// 09:50
public class sorterING {


    public static void main(String[] args) {
        int [] numbers = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};
        double [] numbersDouble  = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};
        String [] numbersString = {"aab" , "aaa", "ai" ,"aeea","aaaaf","klks", "aaaaaaaaaaaaaaaaaaaaaaaaaaaal"};

        //Alla print metoder är enbart för test programet samt int, double och string arrayn.

        Sort staticRunner = new Sort();
        staticRunner.selSortInt(numbers);
        staticRunner.printArray(numbers);

        staticRunner.selSortDouble(numbersDouble);
        staticRunner.printArrayDouble(numbersDouble);

        staticRunner.selSortStringLength(numbersString);
        staticRunner.printArrayString(numbersString);

       staticRunner.selSortStringAlpha(numbersString);
       staticRunner.printArrayString(numbersString);

    }

}
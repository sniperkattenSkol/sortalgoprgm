// Nils E Lindfors TE15 
// 2017-04-03
// 11:04
public class Sort {





//INT
    //byter plats på två stycken ints i en int array
    public void swap(int a, int b, int[]array){
        int tmpA = array[a];
        array[a] = array[b];
        array[b] = tmpA;

    }
    //print int array
    public void printArray(int[]array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    //Sorterar en int array i storleksordning minst till störst
    public void selSortInt(int[]numbers) {
        for (int i = 0; i < numbers.length; i++ ) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    swap(i,j,numbers);
                }
            }
        }

    }

    //DOUBLE
    //Byter plats på två stycken double i en Array
    public void swapdouble(int a, int b, double[]array){
        double tmpA = array[a];
        array[a] = array[b];
        array[b] = tmpA;

    }
    //Skriver ut en double array
    public void printArrayDouble(double[]array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    //Sorterar en double array från störst till minst
    public void selSortDouble(double[]numbers) {
        for (int i = 0; i < numbers.length; i++ ) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    swapdouble(i,j,numbers);
                }
            }
        }

    }
    //STRING
   //Sort by string, char length

    //Byter plats på två stycken platser i en string array
    public void swapString(int a, int b, String[]array){
        String tmpA = array[a];
        array[a] = array[b];
        array[b] = tmpA;

    }
    //Skriver ut en String Array
    public void printArrayString(String[]array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    //Sorterar string i storleksordning minst till störst
    public void selSortStringLength(String[]numbers) {
        for (int i = 0; i < numbers.length; i++ ) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i].length() < numbers[j].length()) {
                    swapString(i,j,numbers);
                }
            }
        }

    }

    //STRING ALPHA

    //Tar ut en bokstav ur en string från en string array
    public int charToInt(int whatStringIndex, int whatChar, String [] array){
        char asciChar = array[whatStringIndex].charAt(whatChar);
        int asciINT = (int) asciChar;
        return asciINT;
    }


    ///fixa så att det spelar ingen roll för stora eller små bokstäver samt att fixa fel såsom special chars och siffror.

    public void selSortStringAlpha(String[]numbers) {
        for (int i = 0; i < numbers.length; i++ ) {
            for (int j = 0; j < numbers.length; j++) {
                //om de börjar pä samma bokstav så går den in i loopen som kollar bokstäver tills de
                if (charToInt(i,0,numbers) == charToInt(j,0,numbers)){
                   //tar reda på vilket som är det minsta i antal bokstäver
                    int smallest = Math.min(numbers[i].length() , numbers[j].length());
                   llloop:
                   //En loop för att gå igenom alla bokstäver i orden
                    for (int c = 0; c < smallest; c++){
                       //Om c == minsta "ordet" i karaktärer så avbryter den loopen och om den minsta är j så byter den plats med i
                       if(c == smallest){
                            if (smallest == numbers[j].length()) {
                               swapString(i,j,numbers);
                            }else {
                                break llloop;
                            }
                         //Annars om j @ c är större än i @ c så byter de plats
                         //Avbryter loopen när detta uppnås då man behöver inte gå igenom resterande bokstäver
                        }else if (charToInt(i,c,numbers) < charToInt(j,c,numbers)){
                            swapString(i,j,numbers);
                            c = smallest + 1;
                        }
                    }
                }else if (charToInt(i,0,numbers) < charToInt(j,0,numbers)) {
                        swapString(i,j,numbers);
                    }

                }
            }
        }




}

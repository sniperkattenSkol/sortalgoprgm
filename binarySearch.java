// Nils E Lindfors TE15 
// 2017-04-10
// 08:57
public class binarySearch {

    public void BinarySearch(int[] data, int item) {
        int x = data.length -1; //e.g 10][ "0 to 10" ,
        int y = 0;
        int index;
        boolean trueisnotfalse = true;// Min break
        while(trueisnotfalse) {
            index = (y+x)/2;
            if (y>x) { //Om den inte kan dela längre så hoppar den ur
                System.out.println("ett heltal mindre än noll");
                trueisnotfalse = false;
            }else if (data[index] < item) {     // Om den är till höger
                y = index + 1;
            } else if (data[index] > item) {    // Om den är till vänster
                x = index -1;
            } else {
                //data[index] == item
                System.out.println(item + " finns på index " + index + " i arrayen");
                trueisnotfalse = false;
            }
        }

    }
}

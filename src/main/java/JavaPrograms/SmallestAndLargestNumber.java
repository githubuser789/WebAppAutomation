package JavaPrograms;

public class SmallestAndLargestNumber {
    public static void main(String[] args) {
        returnSmallNumber();
    }

    public static int returnSmallNumber(){
        int[] numberArray= new int[]{5,2,7,9,1};
       int largeNumber,smallNumber;
        smallNumber=numberArray[0];
        largeNumber=numberArray[0];
        for (int i=1;i<numberArray.length;i++) {
            if(numberArray[i]>largeNumber) {
                largeNumber=numberArray[i];
            }
            else if(numberArray[i]<smallNumber)
            {
                smallNumber=numberArray[i];
            }
        }
        System.out.println(smallNumber);
        System.out.println(largeNumber);
        return smallNumber;
    }
}

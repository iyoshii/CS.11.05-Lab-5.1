public class ArrayUtility {

    public static void print(int[] array) {
        for(int i=0; i<array.length; i++){
            if(i == array.length - 1){
                System.out.print(array[i]+"\n");
            }
            else{
                System.out.print(array[i]+", ");
            }
        }
    }


    public static int sum(int[] array) {
        int result=0;
        for(int i:array){
            result=result+i;
        }
        return result;
    }

    public static double average(int[] array) {
        int count=0;
        for(int i:array){
            count=count+i;
        }
        double result=(double) count / array.length;
        result=(int)(result*100);
        result=result/100;
        return result;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i=1; i<array.length; i++) {
            if(array[i]<min) {
                min=array[i];
            }
        }

        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i=1; i<array.length; i++){
            if(array[i]>max){
                max=array[i];
            }
        }

        return max;
    }


    public static int evenCount(int[] array) {
        int count=0;
        for(int i:array){
            if(i%2==0){
                count++;
            }
        }

        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversed=new int[array.length];
        for(int i=0; i<array.length; i++){
            if(i!=array.length-1){
                reversed[i]=array[array.length-i-1];
            }
            else{
                reversed[i]=array[0];
            }
        }
        return reversed;
    }


    public static void reverseTwo(int[] array) {
        int front=0;
        int end=array.length-1;
        while(front<end){
            int current=array[front];
            array[front]=array[end];
            array[end]=current;
            front++;
            end--;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i:array) {
            if(i==num) {
                return true;
            }
        }

        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(String i:array){
            if(i.equals(str)){
                return true;
            }
        }

        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i=0; i<array.length; i++){
            array[i]=array[i]*2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for(int i=0; i<array.length; i++){
            array[i]=array[i]*n;
        }
    }

    public static String toString(int[] array) {
        String result="";
        for(int i=0; i<array.length; i++){
            if(i==array.length-1){
                result += array[i];
            }
            else{
                result += array[i]+", ";
            }
        }

        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i=0; i<array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void shiftRight(int[] array) {
        int last=array[array.length-1];
        for (int i=array.length-1; i>0; i--) {
            array[i]=array[i-1];
        }

        array[0]=last;
    }

    public static void shiftLeft(int[] array) {
        int first=array[0];
        for (int i=1; i<array.length; i++) {
            array[i-1]=array[i];
        }

        array[array.length-1]=first;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int shift=n%array.length;
        for (int i=0; i<shift; i++) {
            int last=array[array.length-1];

            for (int j=array.length-1; j > 0; j--) {
                array[j]=array[j - 1];
            }

            array[0]=last;
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int shift=n%array.length;
        for (int i=0; i<shift; i++) {
            int first=array[0];

            for (int j=1; j<array.length; j++) {
                array[j-1]=array[j];
            }

            array[array.length-1]=first;
        }
    }
}

package Questions.ArarysQuestions;

public class ArraysQuestions2 {
    public static void main(String[] args) {

    }

    // Search and return index of array element
    public static int searchAndReturnIndex (int[] arr, int searchEle)
    {
        for (int i=0; i< arr.length; i++)
        {
            if (arr[i]==searchEle)
            {
                return i;
            }
        }
        return -1;
    }

    // Count total number of positive and negative in array
    public static int[] countAndReturnInArr(int[] arr)
    {
        int pos = 0;
        int neg = 0;
        int[] arr1 = new int[2];
        for(int i:arr){
            if(i>0)
            {
                pos++;
            }
            else if(i == 0){
                continue;
            }
            else {
                neg++;
            }
        }
        arr1[0]=pos;
        arr1[1]=neg;
        return arr1;
    }

}

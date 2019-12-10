public class Sort {

    public static void main(String[] args) {
        int[] arr = {1,9,2,8,3,5,7,6,4,0};
        arr = bubbleSort(arr);
        for (int i : arr){
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("---------------------");
        int arr1[] = {21,33,65,87,95,46,58,19,70};
        arr1 = sort(arr1);
        for (int i : arr1){
            System.out.print(i + ",");
        }
    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return  arr;
    }

    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        return arr;
    }

}

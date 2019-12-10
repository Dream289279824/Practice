public class BinaryAlgorithm {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a = 5;
        int b = findNum(arr, a);
        int c = findIndex(arr, a, 0, arr.length - 1);
        System.out.println(b);
        System.out.println(c);
    }

    /**
     * 递归
     * @param arr
     * @param a
     * @param i
     * @param i1
     * @return
     */
    private static int findIndex(int[] arr, int a, int i, int i1) {

        int mid = (i + i1) / 2;
        if (arr[mid] == a){
            return mid;
        }else if (a > arr[mid]){
            return findIndex(arr, a, mid + 1, i1);
        }else {
            return findIndex(arr, a, i, i1 - 1);
        }

    }

    /**
     * 非递归
     * @param arr
     * @param a
     * @return
     */
    private static int findNum(int[] arr, int a) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max){
            int mid = (min + max) / 2;
            if (a == arr[mid]){
                return mid;
            }else if (a > arr[mid]){
                min = mid + 1;
            }else {
                max = mid - 1;
            }
        }
        return -1;
    }

}

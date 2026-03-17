public class CheckSortedArray {
    static boolean sorted(int[] arr, int index, String order) {
        if (index == arr.length) {
            return true;
        }//we also find asc and desc in this problem
        // logic for asc and dec
        if (order == null) {
            if (arr[index] > arr[index - 1]) {
                order = "asc";
            } else if (arr[index] < arr[index - 1]) {
                order = "desc";
            }
        }

        if (order != null) {

            if (order == "asc") {
                if (arr[index] > arr[index - 1]) {
                    return false;
                }
            } else {

                if (arr[index] < arr[index - 1]) {
                    return false;
                }
            }

        }

        return sorted(arr, index + 1, order);
    }

    public static void main(String[] args) {
        int arr[] = { 10,10,10,10,10,10};

        System.out.println(sorted(arr, 1, ""));

    }
}

public class Main {
	public static void BubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int idk = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = idk;
                }
            }
        }
    }
	public static void main(String[] args) {

	}
}
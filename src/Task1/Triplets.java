package Task1;

public class Triplets {
    public static void main(String[] args) {

        Triplets triplets = new Triplets();
        int[] array = {4, 4, 2, 4, 3};
        int[] array2 = {1, 1, 2, 2, 3};

        int result = triplets.countingTriplets(array);
        int result2 = triplets.countingTriplets(array2);
        System.out.println(result);
        System.out.println(result2);

    }

    public int countingTriplets(int[] num) {

        int ans = 0;
        for (int i = 0; i < num.length; ++i) {
            for (int j = i + 1; j < num.length; ++j) {
                for (int k = j + 1; k < num.length; ++k) {
                    if (num[i] != num[j] && num[i] != num[k] && num[j] != num[k])
                        ans++;
                }
            }
        }
        return ans;
    }


}

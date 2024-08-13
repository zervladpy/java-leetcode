public class PlusOne {

    public int[] plusOne(int[] digits) {

        int add = 1;
        int pos = digits.length - 1;

        while (add == 1) {
            if (pos < 0) {
                int[] temp = new int[digits.length + 1];
                temp[0] = 1;
                return temp;
            }
            if (digits[pos] == 9) {
                digits[pos] = 0;
                pos--;
            } else {
                digits[pos] += 1;
                add = 0;
            }
        }

        return digits;
    }

}

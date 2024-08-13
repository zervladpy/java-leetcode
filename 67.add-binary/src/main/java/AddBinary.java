public class AddBinary {

    public String addBinary(String a, String b) {

        /// Match the lengths of string inserting 0 on the shortest string start
        int diff = Math.abs(a.length() - b.length());

        if (a.length() < b.length()) {
            StringBuilder aBuilder = new StringBuilder(a);
            for (int i = 0; i < diff; i++) {
                aBuilder.insert(0, "0");
            }
            a = aBuilder.toString();
        } else if (a.length() > b.length()) {
            StringBuilder bBuilder = new StringBuilder(b);
            for (int i = 0; i < diff; i++) {
                bBuilder.insert(0, "0");
            }
            b = bBuilder.toString();
        }

        StringBuilder result = new StringBuilder();

        /// flag for carry value
        boolean add = false;

        for (int i = a.length() - 1; i >= 0; i--) {
            char aChar = a.charAt(i);
            char bChar = b.charAt(i);

            if (aChar == '0' && bChar == '0') {
                result.insert(0, add ? "1" : "0");
                add = false;
            }
            if (aChar == '1' && bChar == '0' || aChar == '0' && bChar == '1') {
                result.insert(0, add ? "0" : "1");
            }

            if (aChar == '1' && bChar == '1') {
                result.insert(0, add ? "1" : "0");
                add = true;
            }

        }

        if (add) {
            result.insert(0, "1");
        }

        return result.toString();
    }

}

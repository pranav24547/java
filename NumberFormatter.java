package ex_5;
public class NumberFormatter {
    public static void main(String[] args) {
        String inputString = "1234567"; // Replace with your desired input

        
        String cleanedInput = inputString.replace(",", "");

        
        long number = Long.parseLong(cleanedInput);

        
        String formattedOutput = formatWithCommas(number);

        System.out.println("Input String: " + inputString);
        System.out.println("Output String: " + formattedOutput);
    }

    public static String formatWithCommas(long number) {
        StringBuilder result = new StringBuilder();
        String numberStr = Long.toString(number);

        int count = 0;
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            result.insert(0, numberStr.charAt(i));
            count++;
            if (count % 3 == 0 && i > 0) {
                result.insert(0, ',');
            }
        }

        return result.toString();
    }
}

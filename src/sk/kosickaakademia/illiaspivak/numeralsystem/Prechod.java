package sk.kosickaakademia.illiaspivak.numeralsystem;

public class Prechod {
    public String DecToHex(int dec){
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
        String hex = "";
        while (dec != 0) {
            int rem = dec % 16;
            hex = hexDigits[rem] + hex;
            dec = dec / 16;
        }
        return hex;
    }

    public String DecToOctal(int dec){
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7'};
        String oct = "";
        while (dec != 0) {
            int rem = dec % 8;
            oct = hexDigits[rem] + oct;
            dec = dec / 8;
        }
        return oct;
    }

    public String DecToBinary(int dec){
        char[] hexDigits = {'0', '1'};
        String oct = "";
        while (dec != 0) {
            int rem = dec % 2;
            oct = hexDigits[rem] + oct;
            dec = dec / 2;
        }
        return oct;
    }

    public static int convertBinaryToDecimal(int binaryDigit) {
        int decimal = 0;
        int n = 0;
        int temp = 0;
        while (binaryDigit > 0) {
            temp = binaryDigit % 10;
            decimal += temp * Math.pow(2, n);
            binaryDigit = binaryDigit / 10;
            n++;
        }
        return decimal;
    }
    public static int convertOctalToDecimal(int OctalDigit) {
        int decimal = 0;
        int n = 0;
        int temp = 0;
        while (OctalDigit > 0) {
            temp = OctalDigit % 10;
            decimal += temp * Math.pow(8, n);
            OctalDigit = OctalDigit / 10;
            n++;
        }
        return decimal;
    }
    public static int convertHexToDecimal(String HexDigit) {
        int len = HexDigit.length();
        int exp = 0;
        int result = 0;
        for (int i = len - 1; i >= 0; i--) {
            char z = HexDigit.charAt(i);
            switch (z) {
                case '0':
                    result = result + 0;
                    break;
                case '1':
                    result = result + (int) Math.pow(16, exp);
                    break;
                case '2':
                    result = result + 2 * (int) Math.pow(16, exp);
                    break;
                case '3':
                    result = result + 3 * (int) Math.pow(16, exp);
                    break;
                case '4':
                    result = result + 4 * (int) Math.pow(16, exp);
                    break;
                case '5':
                    result = result + 5 * (int) Math.pow(16, exp);
                    break;
                case '6':
                    result = result + 6 * (int) Math.pow(16, exp);
                    break;
                case '7':
                    result = result + 7 * (int) Math.pow(16, exp);
                    break;
                case '8':
                    result = result + 8 * (int) Math.pow(16, exp);
                    break;
                case '9':
                    result = result + 9 * (int) Math.pow(16, exp);
                    break;
                case 'A':
                    result = result + 10 * (int) Math.pow(16, exp);
                    break;
                case 'B':
                    result = result + 11 * (int) Math.pow(16, exp);
                    break;
                case 'C':
                    result = result + 12 * (int) Math.pow(16, exp);
                    break;
                case 'D':
                    result = result + 13 * (int) Math.pow(16, exp);
                    break;
                case 'E':
                    result = result + 14 * (int) Math.pow(16, exp);
                    break;
                case 'F':
                    result = result + 15 * (int) Math.pow(16, exp);
                    break;
            }
            exp++;
        }
        return result;
    }
    public boolean isHexadecimalNumber(String value){
        // "1254" true
        // "E8" true
        // "T15" false
        // "ae4d" true
        // "14d!" false
        return false;
    }

    public boolean isBinaryNumber(String value){
        return false;
    }
    public boolean isOctalNumber(String value){
        //"8125" false
        // 7777777777777777777000777  true
        return false;
    }
}

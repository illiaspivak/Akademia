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
}

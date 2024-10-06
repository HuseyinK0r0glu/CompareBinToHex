public class Main {
    public static void main(String[] args) {

        boolean isBinaryAndHexSame = compareBinToHex("0001000000000000","1000");

        if(isBinaryAndHexSame){
            System.out.println("Binary and hex values are same");
        }else {
            System.out.println("They are not same");
        }

    }

    public static boolean compareBinToHex(String binary,String hex){
        int n1 = convertFromBase(binary,2);
        int n2 = convertFromBase(hex,16);

        if(n1 < 0 || n2 < 0){
            return false;
        }

        return n1 == n2;
    }

    public static int convertFromBase(String number,int base){
        if(base < 2 || (base > 10 && base != 16)){
            return -1;
        }

        int value = 0;
        for(int i = number.length()-1;i>=0;i--){
            int digit = number.charAt(i) - '0';
            if(digit < 0 || digit >= base){
                return -1;
            }

            int exp = number.length() - i - 1;
            value += digit * Math.pow(base,exp);
        }

        return value;
    }
}

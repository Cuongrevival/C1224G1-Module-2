public class DemSoNguyenTo_2 {
    public static void main(String[] args) {
        int num;
        for (num = 2; num <= 100; num++) {
            if(checkPrime(num)){
                System.out.print(num + " ");
            }
        }
    }
    public static boolean checkPrime(int n) {
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

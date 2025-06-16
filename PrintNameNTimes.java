public class PrintNameNTimes {
    
    public static void printNameNTimes(int n) {
        if(n == 0) {
            return;
        }
        System.out.println("Saurabh");
        printNameNTimes(n-1);
    }
    
    public static void main(String[] args) {
        printNameNTimes(5);
    }    
}

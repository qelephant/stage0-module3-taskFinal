package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int m, n, sum = 0;
        m = number;
        while(m > 0){
            n = m % 10;
            sum = sum * 10 + n;
            m = m / 10;
        }
        System.out.println(sum);
    }
}

public class HanoiTower {
    public static void hanio(int n, char src, char des, char aux){
        if(n == 1 ) System.out.println("Disk 1 moved from "+src+ " to " +des);
        else{
            hanio(n-1, src, aux, des);
            System.out.println("Disk " +n+ " moved from "+src+ " to " +des);
            hanio(n-1, aux, des, src);
        }
    }

    public static void main(String[] args) {
        hanio(3, 'A', 'C', 'B');
    }
}

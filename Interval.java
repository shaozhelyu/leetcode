public interface Interval extends Comparable<Interval> {
    int start();
    int end();
    default int length(){
        return end()-start();    }
}

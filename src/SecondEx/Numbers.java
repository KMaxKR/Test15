package SecondEx;

public class Numbers {
    private double number;
    private double by;
    public void setNumber(double set){
        this.number = set;
    }
    public double divideBy(double by) throws RuntimeException{
        if(by == 0){
            throw new RuntimeException("IllegalArgumentException");
        }else{
            this.by = by;
        }
        return number / by;
    }
}

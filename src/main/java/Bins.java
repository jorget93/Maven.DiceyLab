
public class Bins {
    private Integer[] bins;
    private Integer[] holder;

    public Bins(Integer min, Integer max){
        this.bins = new Integer[(max - min) + 1] ;
        this.holder = new Integer[(max - min) + 1];
        for(int i = 0; i <= (max - min); i++){
            bins[i] = min + i;
            holder[i] = 0;
           // System.out.println(bins[i]);
        }
    }

    public Integer getBin(Integer a) {
        for(int i = 0; i < bins.length; i++){
            if (bins[i] == a){
                return holder[i];
            }
        } return null;
    }

    public void incrementBin(Integer rolls) {
        for(int i = 0; i < bins.length; i++){
            if (bins[i] == rolls){
                holder[i] = holder[i] + 1;
            }
        }
    }
}

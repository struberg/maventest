

/**
 * another dumb test bean
 */
public class BeanB {
    private int j;
    private BeanA a;

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getAi() {
        return a.getI();
    }
}

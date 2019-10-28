public class Triangle{
    private double base;
    private double hight;

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }
    /**
     * @return the hight
     */
    public double getHight() {
        return hight;
    }
    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }
    /**
     * @param hight the hight to set
     */
    public void setHight(double hight) {
        this.hight = hight;
    }
    public Triangle(double b, double h){
        base = b;
        hight = h;
    } 

}
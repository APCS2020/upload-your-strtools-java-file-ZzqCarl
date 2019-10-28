public class Circle{
    private double radius = 1.0;
    private String color = "red";
    
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public Circle(){
        color = "red";
        radius = 1.0;
    }
    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }

}
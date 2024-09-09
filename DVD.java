

// Inheritance (pewaris)
public class DVD extends product {
    private int length;
    private double rating;
    private String studio;

    public DVD() {
        super(); //Constructor dari superclass
        length = 0;
        rating = 0.0;
        studio = "";
    }


    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

// Override dari superclass Product
public void print() {
    super.print();
    System.out.println("Length:\t" + length);
    System.out.println("Total Rating:\t" + rating);
    System.out.println("Studio:\t" + studio);
}


}

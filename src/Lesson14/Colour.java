package Lesson14;

public enum Colour {
    BLACK("черный"),
    WHITE("белый"),
    BLUE("синий"),
    GREEN("зеленый");
    private String russianColour;
    Colour(String russianColour){
        this.russianColour=russianColour;

    }

    @Override
    public String toString() {
        return  russianColour ;
    }
}

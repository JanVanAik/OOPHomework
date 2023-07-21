package Lesson_6.work1;

public class Square extends Figure {
    int height;
    public Square(int width){
        this.width = width;
        this.height = width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }
}


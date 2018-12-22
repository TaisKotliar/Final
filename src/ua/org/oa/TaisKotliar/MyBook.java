package ua.org.oa.TaisKotliar;

public class MyBook extends Book {

    @Override
    void setTitle(String s) {
        title = s;
    }

    @Override
    String getTitle() {
        return "The title is: " + title;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

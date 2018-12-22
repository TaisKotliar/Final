package ua.org.oa.TaisKotliar;

public abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}
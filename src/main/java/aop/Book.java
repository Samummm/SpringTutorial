package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Тайна двух океанов")
    private String name;
    @Value("Г.Б.Адамов")
    private String author;

    @Value("1938")
    private int yeasOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYeasOfPublication() {
        return yeasOfPublication;
    }
}

package Lap1.Book;

import java.util.Arrays;

public class Book {
    private String namebook; // название книги
    private Publisher namepublisher; // ссылка на экземляр издательство
    private int year; // год издания
    private String author[]; // автор книги


    public String getNamebook() {
        return namebook;
    }

    public Book(String namebook, int year, Publisher namepublisher) {
        this.namebook = namebook;
        this.namepublisher = namepublisher;
        this.year = year;

    }

    public Book(String namebook, String[] author, int year, Publisher namepublisher) {
        this.namebook = namebook;
        this.namepublisher = namepublisher;
        this.year = year;
        this.author = author;
    }


    public void setNamebook(String namebook) {
        if (namebook.isEmpty()) {
            throw new IllegalArgumentException("Напишите название книги");
        } else {
            this.namebook = namebook;

        }
    }

    public Publisher getNamepublisher() {
        return namepublisher;
    }

    public void setNamepublisher(Publisher namepublisher) {
        if (namepublisher == null) {
            throw new IllegalArgumentException("Укажите название издательство!");
        } else {
            this.namepublisher = namepublisher;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Введите коректное значение года");
        } else {
            this.year = year;
        }
    }

    public String[] getAuthor() {
        return author;
    }

    public int getAuthors() {
        return author.length;
    }

    public void setAuthor(String... author) {
        if (author != null && author.length > 0 && !Arrays.asList(author).stream().anyMatch(String::isBlank)) {
            if (this.author== null) {
                this.author = author;

            } else {
                String[] newauthor = Arrays.copyOf(this.author, this.author.length + author.length);
                System.arraycopy(author, 0, newauthor, this.author.length, author.length);
                this.author = newauthor;
            }
        } else {
            throw new IllegalArgumentException("Книга не существует");
        }

    }

    public String getAuthor(int index) {
        try {
            return author[index];
        } catch (Exception e) {
            System.out.println("Введите индекс автора");
            return null;
        }

    }

    public void print() {
        System.out.print(namebook);
        System.out.print(namepublisher);
        System.out.print(year);
        namepublisher.print();
        if (author != null) {
            System.out.print("");
            for (String author : author) {
                System.out.print(author);
            }
        } else {
            System.out.print("");

        }

    }

    public static void printALL(Book[] booklist) {
        if (booklist != null) {
            for (Book book : booklist) {
                if (book != null) {
                    book.print();
                }
            }
        }
    }

        public static void main (String[]args){
            Publisher prospeck = new Publisher("Проспект", "Москва");
            Publisher piter = new Publisher("Пиер", "Санкт-Петербург");
            Publisher bhw = new Publisher("БХВ", "Санкт-Петербург");
            Publisher dialectika = new Publisher("Диалектика", "Киев");

            Book[] booklist = new Book[5];
            booklist[0] = new Book("Computer Science: основы прогроммирования на Java, ООП, алгоритмы структуру данных"+ new String[]{"Седжевик Роберт","Уэйн Кевин"}, 2018, piter);
            booklist[1] = new Book("Разработка требований к программному обеспечению, 3-ое издание, дополненное"+ new String[]{"Вингрерс Карл"}, 2019, bhw);
            booklist[2] = new Book("Java. Полное руководство, 10-ое издание"+ new String[]{"Гербердт Шилдт"}, 2018, dialectika);
            booklist[3] = new Book("C/C++. Процедурное программирование"+new String[]{"Полубенцева М.И."}, 2017, bhw);
            booklist[4] = new Book("Конституция РФ", 2020, prospeck);
            printALL(booklist);

        }
    }




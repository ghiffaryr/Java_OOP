package com.tutorial;

class Book{
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    void display(){
        System.out.println("\n Book title\t: " + this.title);
        System.out.println("Author\t: " + this.author);
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Mambangkik batang tarandam", "Ghiffary Rifqialdi");
        book1.display();

        //show the address
        String addressBook1 = Integer.toHexString(System.identityHashCode(book1));
        System.out.println(addressBook1);

        //object assignment
        Book book2 = book1;
        book2.display();
        String addressBook2 = Integer.toHexString(System.identityHashCode(book2));
        System.out.println(addressBook2);

        //both changed because book1 and book2 are on the same address or reference
        book2.title = "Basaba";
        book1.display();
        book2.display();

        //add object to methods
        function(book2);
        book1.display();
        book2.display();
    }

    //this shows that parameter is passed by reference
    public static void function(Book bookData){
        String addressBookData = Integer.toHexString(System.identityHashCode(bookData));
        System.out.println("address inside function is " + addressBookData);
        bookData.author = "Yo";
    }
}
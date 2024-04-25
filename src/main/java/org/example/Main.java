package org.example;

public class Main {
    public static void main(String[] args) {
        Author lovecraft = new Author("Howard", "Lovecraft");
        Book whispers = new Book("The Whisperer in Darkness", lovecraft, 1931);

        Author baudrillard = new Author("Jean", "Baudrillard");
        Book society = new Book("The consumer society", baudrillard, 1970);

        society.setYearOfPublication(2010);
    }
}
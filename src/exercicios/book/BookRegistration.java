package exercicios.book;

import exercicios.book.enums.Language;

import java.util.HashMap;
import java.util.Map;

public class BookRegistration {
    private static Map<Integer, Book> bookHashMap = new HashMap<>();
    private static int index = 0;

    public static void main(String[] args) {


        insertBook(101, "livro Primeiro", "A editora", "o autor", "2019", Language.FRANCE);
        insertBook(102, "livro Segundo", "A editora2", "o autor2", "2020", Language.ENGLISH);
        insertBook(103, "livro Terceiro", "A editora3", "o autor3", "2021", Language.SPANISH);
        insertBook(104, "livro Quarto", "A editora3", "o autor4", "2022", Language.CHINESE);
        printBooks();
        removeBook(102);
        updateBook(101,"Melhorando o nome", "editora", "The author","2000");
        System.out.println("");
        printBooks();
        numberOfBooks();

    }

    public static void insertBook (int id, String name, String publisher, String author, String year, Language language){
        Book newBook = new Book(id,name,publisher,author,year, language);
        bookHashMap.putIfAbsent(newBook.getId(), newBook);
        index += 1;
    }

    public static void removeBook(int id){
        if (index > 0 ) {
            bookHashMap.remove(id);
            System.out.println("id: " + id + " successfully removed!!");
            index -= 1;
        }
        else{
            System.out.println("No books registered here!");
        }
    }

    public static void printBooks(){
        if (index > 0 ) {
            bookHashMap.forEach((key, value) -> {System.out.println(key + " => " + value);});
        }
        else{
            System.out.println("No books registered here!");
        }
//        for (Integer key : bookHashMap.keySet()) {
//            System.out.println(key + " => " + bookHashMap.get(key));
//        }
    }

    public static void updateBook(int id, String name, String publisher, String author, String year){
        if(index > 0){
            bookHashMap.get(id).setName(name);
            bookHashMap.get(id).setPublisher(publisher);
            bookHashMap.get(id).setAuthor(author);
            bookHashMap.get(id).setYear(year);
        }
        else{
            System.out.println("No books registered here!");
        }
    }

    public static int numberOfBooks(){
        System.out.print("Number of books registered: ");
        return index;
    }




}

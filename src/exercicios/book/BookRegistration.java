package exercicios.book;

import exercicios.book.enums.Language;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class BookRegistration {
    private static final Map<Integer, Book> bookHashMap = new HashMap<>();
    private static int index = 0;

    public static void main(String[] args) {

//Criando arquivo .bin
        try {
            File file = new File("MyFirstBinFile.bin");
            if (! file.exists()){ file.createNewFile(); }
            try ( FileOutputStream fos = new FileOutputStream(file);
                  ObjectOutputStream oop = new ObjectOutputStream(fos) ) {
                oop.writeObject(insertBook(101, "Primeiro", "A editora", "o autor", "2019", Language.FRANCE));
                oop.writeObject(insertBook(102, "Segundo", "A editora2", "o autor2", "2020", Language.ENGLISH));
                oop.writeObject(insertBook(103, "Terceiro", "A editora3", "o autor3", "2021", Language.SPANISH));
                oop.writeObject(insertBook(104, "Quarto", "A editora4", "o autor4", "2022", Language.CHINESE));
                oop.writeObject(insertBook(105, "Quinto", "A editora5", "o autor5", "2023", Language.FRANCE));
            }
            System.out.println("Book successfully registered!");
            printBooks();

        } catch (IOException e) { System.err.println("error creating file"); }

//---------------------------------------------------------//------------------------------------------------------------------

//Ler arquivo .bin
        try {
            File file = new File("MyFirstBinFile.bin");
            if (file.exists()){
                try ( FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis) ) {
                        Object livros = (Book) ois.readObject();
                    System.out.println("Read data: ");
                    System.out.println(bookHashMap.get(101).toString());
                    System.out.println(bookHashMap.get(102).toString());
                    System.out.println(bookHashMap.get(103).toString());

                } catch (ClassNotFoundException ex) { System.err.println("error reading file"); }
            }
        } catch (IOException e) { System.err.println("error opening file"); }

    }


    public static Object insertBook (int id, String name, String publisher, String author, String year, Language language){
        Book newBook = new Book(id,name,publisher,author,year, language);
        bookHashMap.putIfAbsent(newBook.getId(), newBook);
        index += 1;
        return null;
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

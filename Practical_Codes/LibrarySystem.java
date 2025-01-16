import java.util.ArrayList;
import java.util.*;

class Library {
  public ArrayList<Book> books = new ArrayList<Book>();
  public ArrayList<Member> members = new ArrayList<Member>();

  public void addMember(Member member) {
    this.members.add(member);
  }

  public Boolean isMemberIdExist(String id) {
    Boolean isExist = false;
    for (Member member : this.members) {
      if (member.id == id) {
        isExist = true;
      }
    }
    return isExist;
  }

  public void giveBook(String bookId, String memberId) {
    Book book = this.getBookById(bookId);
    this.books.remove(book);

    Member member = this.getMemberById(memberId);
    int memberIndex = this.getMemberIndex(member);
    this.members.get(memberIndex).borrowedBooks.add(book);
  }

  public void receiveBook(String bookId, String memberId) {
    Book book = this.getBookById(bookId);
    this.books.add(book);

    Member member = this.getMemberById(memberId);
    int memberIndex = this.getMemberIndex(member);
    this.members.get(memberIndex).borrowedBooks.remove(book);
  }

  private int getMemberIndex(Member member) {
    return this.members.indexOf(member);
  }

  private Member getMemberById(String id) {
    for (Member member : this.members) {
      if (member.id.equals(id)) {
        return member;
      }
    }
    return null;
  }

  private Book getBookById(String id) {
    for (Book book : this.books) {
      if (book.id.equals(id)) {
        return book;
      }
    }
    return null;
  }
}

class Book {
    public String id;
    public String title;
}

class Member {
    public String id;
    public String name;
    public ArrayList<Book> borrowedBooks = new ArrayList<Book>();
  
    public void receiveBook(Book book) {
      this.borrowedBooks.add(book);
    }
  
    public void giveBook(Book book) {
      this.borrowedBooks.remove(book);
    }
  }
  
class Main {

    static Scanner scan = new Scanner(System.in);
    static Library library = new Library();
  
    public static void main(String[] args) {
      initLibraryData();
  
      String isContinue = "y";
  
      while (isContinue.equals("y")) {
        showMenu();
        int selectedMenu = chooseMenu();
  
        if (selectedMenu == 1) {
          showBooks();
        } else if (selectedMenu == 2) {
          showMembers();
        } else if (selectedMenu == 3) {
          addMember();
        } else if (selectedMenu == 4) {
          borrowBook();
        } else if (selectedMenu == 5) {
          returnBook();
        } else {
          System.out.println("wrong input");
        }
  
        System.out.print("continue ? ");
        isContinue = scan.next();
      }
    }
  
    public static void showMenu() {
      System.out.println("================================");
      System.out.println("1. show books list");
      System.out.println("2. show members list");
      System.out.println("3. add member");
      System.out.println("4. borrow book");
      System.out.println("5. return book");
      System.out.println("================================");
    }
  
    public static void initLibraryData() {
      Book book1 = new Book();
      book1.id = "1";
      book1.title = "pemrograman java";
  
      Book book2 = new Book();
      book2.id = "2";
      book2.title = "pemrograman oop";
  
      Book book3 = new Book();
      book3.id = "3";
      book3.title = "pemrograman android";
  
      Member member1 = new Member();
      member1.id = "1";
      member1.name = "aka";
  
      Member member2 = new Member();
      member2.id = "2";
      member2.name = "budi";
  
      Member member3 = new Member();
      member3.id = "3";
      member3.name = "tono";
  
      library.books.add(book1);
      library.books.add(book2);
      library.books.add(book3);
  
      library.members.add(member1);
      library.members.add(member2);
      library.members.add(member3);
    }
  
    public static int chooseMenu() {
      System.out.print("choose menu : ");
      int pilihan = scan.nextInt();
      return pilihan;
    }
  
    public static void showBooks() {
      for (Book book : library.books) {
        System.out.println(book.id + " " + book.title);
      }
    }
  
    public static void showMembers() {
      for (Member member : library.members) {
        System.out.println(member.id + " " + member.name);
      }
    }
  
    public static void addMember() {
      Member member = new Member();
  
      System.out.print("id : ");
      member.id = scan.next();
  
      System.out.print("name : ");
      member.name = scan.next();
  
      library.addMember(member);
    }
  
    public static void borrowBook() {
      System.out.print("id member : ");
      String memberId = scan.next();
  
      System.out.print("id book : ");
      String bookId = scan.next();
  
      library.giveBook(memberId, bookId);
    }
  
    public static void returnBook() {
      System.out.print("id member : ");
      String memberId = scan.next();
  
      System.out.print("id book : ");
      String bookId = scan.next();
  
      library.receiveBook(memberId, bookId);
    }
  }



/*
 * OUTPUT :
 ================================
1. show books list
2. show members list
3. add member
4. borrow book
5. return book
================================
choose menu : 1
1 Programming in Java
2 Programming in Python
3 Programming in Android
continue ? Y/N y
================================
1. show books list
2. show members list
3. add member
4. borrow book
5. return book
================================
choose menu : 2
1 aka
2 budi
3 tono
continue ? Y/N y
================================
1. show books list
2. show members list
3. add member
4. borrow book
5. return book
================================
choose menu : 3
id : 4
name : Yaki
continue ? Y/N y
================================
1. show books list
2. show members list
3. add member
4. borrow book
5. return book
================================
choose menu : 2
1 aka
2 budi
3 tono
4 Yaki
continue ? Y/N y
================================
1. show books list
2. show members list
3. add member
4. borrow book
5. return book
================================
choose menu : 4
id member : 3
id book : 1
continue ? Y/N y
================================
1. show books list
2. show members list
3. add member
4. borrow book
5. return book
================================
choose menu : 1
1 Programming in Java
2 Programming in Python
continue ? Y/N 5
 */
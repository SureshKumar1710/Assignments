package library.transactions;

import library.books.Books;
import library.members.Member;

public class Transaction 
{
    private Member member;
    private Books book;
    private String transactionType; 

    public Transaction(Member member, Books book, String transactionType) 
    {
        this.member = member;
        this.book = book;
        this.transactionType = transactionType;
    }

    public void displayTransaction() 
    {
        System.out.println(transactionType + " transaction: " + member.getName() + " " + transactionType + "ed '" + book.getTitle() + "'");
    }
}

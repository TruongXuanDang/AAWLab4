package com.demo.action;

import com.demo.dao.BookDAO;
import com.demo.entity.Book;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class ListAction extends ActionSupport {
    private List<Book> books;

    public String execute(){
        BookDAO dao = new BookDAO();
        books = dao.getBook();
        if(books.size()>0)
        {
            return "success";
        }
        else
        {
            return "bad";
        }


    }
}

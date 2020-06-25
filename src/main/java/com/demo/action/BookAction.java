package com.demo.action;

import com.demo.dao.BookDAO;
import com.demo.entity.Book;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

public class BookAction extends ActionSupport {
    BookDAO dao = new BookDAO();
    private String name;
    private String summary;

    public String execute()
    {
        if(ServletActionContext.getRequest().getMethod().equals("GET")){

            return  "getrequest";
        }
        BookDAO dao = new BookDAO();
        Book entity = new Book();
        entity.setBookName(name);
        entity.setSummary(summary);
        entity.setAuthorId(1);
        entity.setCategoryId(1);
        entity.setPublisherId(1);
        return "success";
    }
}

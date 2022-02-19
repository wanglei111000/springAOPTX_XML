package com.st.sp.service;

import com.st.sp.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;


public class BookService {
@Autowired
private BookDao bookDao;
public void checkout(String userName,String number)  {
        bookDao.updateStock(number);
        int price = bookDao.getPrice(number);
        bookDao.updateBalance(userName,price);

    }
}

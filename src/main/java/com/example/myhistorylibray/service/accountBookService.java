package com.example.myhistorylibray.service;

import com.example.myhistorylibray.entity.accountBook;
import com.example.myhistorylibray.repository.accountBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class accountBookService {
    @Autowired
    private accountBookRepository accountBookRepository;

    public void insert (accountBook account) throws Exception{
        System.out.println("Service Start");
//        System.out.println(account.getAccount_no());
//        System.out.println(account.getContent());
//        System.out.println(account.getUsed());
//        System.out.println(account.getPay());
//        System.out.println(account.getUsedate());
//        System.out.println(account.getPayment());
        accountBookRepository.save(account);
        System.out.println("Service End");
    }
}

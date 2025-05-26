package com.zuizui.service;

import com.zuizui.model.Account;
import com.zuizui.service.exception.InsufficientFundsException;

public interface TransferService {
    // 空的TransferService接口
    void transfer(Account fromAccount, Account toAccount, double amount) throws InsufficientFundsException;
}
package com.SynergisticIT.Libary.service;

import com.SynergisticIT.Libary.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User saveUser(User user);

    User getUserByID(int id);

    User updateUser(User user);

    void deleteUserByID(int id);

//    void borrowBook(List<Book> borrowBooks);

}

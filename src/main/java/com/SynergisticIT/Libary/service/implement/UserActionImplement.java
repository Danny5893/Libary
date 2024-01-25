package com.SynergisticIT.Libary.service.implement;

import com.SynergisticIT.Libary.model.User;
import com.SynergisticIT.Libary.repository.UserRepository;
import com.SynergisticIT.Libary.service.UserService;

import java.util.List;

public class UserActionImplement implements UserService {
    private UserRepository userRepository;

    public UserActionImplement(UserRepository userRepository){
        super();
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserByID(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserByID(int id) {
        userRepository.deleteById(id);
    }


}

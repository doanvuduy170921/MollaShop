package com.duydoanvu.services;

import java.util.List;

import com.duydoanvu.models.User;

public interface UserService {
	User findByUserName(String userName);
}

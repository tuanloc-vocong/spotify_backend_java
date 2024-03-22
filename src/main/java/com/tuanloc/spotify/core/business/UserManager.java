package com.tuanloc.spotify.core.business;

import com.tuanloc.spotify.core.business.abstracts.UserService;
import com.tuanloc.spotify.core.dataAccess.UserRepository;
import com.tuanloc.spotify.core.entities.User;
import com.tuanloc.spotify.core.utilities.DataResult;
import com.tuanloc.spotify.core.utilities.Result;
import com.tuanloc.spotify.core.utilities.SuccessDataResult;

import java.util.List;

public class UserManager implements UserService {
    private UserRepository userRepository;

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>(userRepository.findAll(), "All users listed");
    }

    @Override
    public DataResult<User> getById(int id) {
        return new SuccessDataResult<User>(userRepository.findById(id).orElse(null), "User listed");
    }

    @Override
    public Result add(User user) {
        return null;
    }

    @Override
    public Result update(User user) {
        return null;
    }

    @Override
    public Result delete(int id) {
        return null;
    }
}

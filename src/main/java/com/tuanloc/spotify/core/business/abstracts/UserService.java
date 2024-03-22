package com.tuanloc.spotify.core.business.abstracts;

import com.tuanloc.spotify.core.entities.User;
import com.tuanloc.spotify.core.utilities.DataResult;
import com.tuanloc.spotify.core.utilities.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    DataResult<List<User>> getAll();
    DataResult<User> getById(int id);
    Result add(User user);
    Result update(User user);
    Result delete(int id);
}

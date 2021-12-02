package com.example.springboot.dao;



import com.example.springboot.model.Role;

import java.util.List;

public interface RoleDao {
    List<Role> getAll();

    Role getById(long id);

    Role getByName(String roleName);

    Role save(Role role);

    void delete(Role role);

    void update(Role role);
}

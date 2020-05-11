package az.sphynx.pubs.service.inter;


import az.sphynx.pubs.entity.User;

import java.util.List;

public interface UserServiceInter {
    public User findById(Integer id);

    public List<User> findAll();

    public int save(User user);

    public User update(az.sphynx.pubs.bean.User user);
}

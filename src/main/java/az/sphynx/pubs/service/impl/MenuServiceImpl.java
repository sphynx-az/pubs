package az.sphynx.pubs.service.impl;

import az.sphynx.pubs.dao.MenuDAOInter;
import az.sphynx.pubs.entity.Menu;
import az.sphynx.pubs.service.inter.MenuServiceInter;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MenuServiceImpl implements MenuServiceInter {

    @Autowired
    MenuDAOInter aMenuDaoInter;

    @Override
    public List<Menu> findAll() {
        return (List<Menu>) aMenuDaoInter.findAll();
    }

    @Override
    public Menu findById(Integer id) {
        return aMenuDaoInter.findById(id).get();
    }

    @Override
    public Menu save(Menu vMenu) {
        return aMenuDaoInter.save(vMenu);
    }

    @Override
    public int deleteById(Integer id) {
        aMenuDaoInter.deleteById(id);
        return 0;
    }
}
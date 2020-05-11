package az.sphynx.pubs.service.impl;

import az.sphynx.pubs.dao.MenuCategoryDAOInter;
import az.sphynx.pubs.entity.MenuCategory;
import az.sphynx.pubs.service.inter.MenuCategoryServiceInter;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MenuCategoryServiceImpl implements MenuCategoryServiceInter {

    @Autowired
    MenuCategoryDAOInter aMenuCategoryDaoInter;

    @Override
    public List<MenuCategory> findAll() {
        return (List<MenuCategory>) aMenuCategoryDaoInter.findAll();
    }

    @Override
    public MenuCategory findById(Integer id) {
        return aMenuCategoryDaoInter.findById(id).get();
    }

    @Override
    public MenuCategory save(MenuCategory vMenuCategory) {
        return aMenuCategoryDaoInter.save(vMenuCategory);
    }

    @Override
    public int deleteById(Integer id) {
        aMenuCategoryDaoInter.deleteById(id);
        return 0;
    }
}
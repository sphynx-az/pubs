package az.sphynx.pubs.service.inter;

import az.sphynx.pubs.entity.MenuCategory;
import org.springframework.stereotype.Service;
import java.util.List;
@Service 
public interface MenuCategoryServiceInter{
List<MenuCategory> findAll();
MenuCategory findById(Integer id);
MenuCategory save(MenuCategory vMenuCategory);
int deleteById(Integer id);
}
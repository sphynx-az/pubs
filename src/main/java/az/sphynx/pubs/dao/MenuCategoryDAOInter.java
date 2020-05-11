package az.sphynx.pubs.dao;
import az.sphynx.pubs.entity.MenuCategory;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
@Transactional
public interface MenuCategoryDAOInter extends CrudRepository<MenuCategory, Integer> {

}
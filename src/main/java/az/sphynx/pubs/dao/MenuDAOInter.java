package az.sphynx.pubs.dao;
import az.sphynx.pubs.entity.Menu;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
@Transactional
public interface MenuDAOInter extends CrudRepository<Menu, Integer> {

}
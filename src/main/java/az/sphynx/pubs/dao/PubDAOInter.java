package az.sphynx.pubs.dao;
import az.sphynx.pubs.entity.Pub;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
@Transactional
public interface PubDAOInter extends CrudRepository<Pub, Integer> {

}
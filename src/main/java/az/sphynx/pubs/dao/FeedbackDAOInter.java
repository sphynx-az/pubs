package az.sphynx.pubs.dao;
import az.sphynx.pubs.entity.Feedback;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
@Transactional
public interface FeedbackDAOInter extends CrudRepository<Feedback, Integer> {

}
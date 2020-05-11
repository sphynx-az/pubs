package az.sphynx.pubs.service.inter;

import az.sphynx.pubs.entity.Feedback;
import org.springframework.stereotype.Service;
import java.util.List;
@Service 
public interface FeedbackServiceInter{
List<Feedback> findAll();
Feedback findById(Integer id);
Feedback save(Feedback vFeedback);
int deleteById(Integer id);
}
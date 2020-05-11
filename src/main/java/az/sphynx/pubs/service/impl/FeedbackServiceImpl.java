package az.sphynx.pubs.service.impl;

import az.sphynx.pubs.dao.FeedbackDAOInter;
import az.sphynx.pubs.entity.Feedback;
import az.sphynx.pubs.service.inter.FeedbackServiceInter;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class FeedbackServiceImpl implements FeedbackServiceInter {

    @Autowired
    FeedbackDAOInter aFeedbackDaoInter;

    @Override
    public List<Feedback> findAll() {
        return (List<Feedback>) aFeedbackDaoInter.findAll();
    }

    @Override
    public Feedback findById(Integer id) {
        return aFeedbackDaoInter.findById(id).get();
    }

    @Override
    public Feedback save(Feedback vFeedback) {
        return aFeedbackDaoInter.save(vFeedback);
    }

    @Override
    public int deleteById(Integer id) {
        aFeedbackDaoInter.deleteById(id);
        return 0;
    }
}
package az.sphynx.pubs.service.inter;

import az.sphynx.pubs.entity.Pub;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PubServiceInter {
    List<Pub> findAll();

    Pub findById(Integer id);

    Pub save(Pub vPub);

    int deleteById(Integer id);
}
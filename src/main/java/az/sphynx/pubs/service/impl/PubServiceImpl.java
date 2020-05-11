package az.sphynx.pubs.service.impl;
import az.sphynx.pubs.dao.PubDAOInter;
import az.sphynx.pubs.entity.Pub;
import az.sphynx.pubs.service.inter.PubServiceInter;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;@Service
public class PubServiceImpl implements PubServiceInter {

@Autowired
PubDAOInter aPubDaoInter;
@Override
public List<Pub> findAll() {
return (List<Pub>)aPubDaoInter.findAll();
}
@Override
public Pub findById(Integer id) {
return aPubDaoInter.findById(id).get();
}
@Override
public Pub save(Pub vPub) {
 return aPubDaoInter.save(vPub);
}
@Override
public int deleteById(Integer id) {aPubDaoInter.deleteById(id);
 return 0;
}
}
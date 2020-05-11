package az.sphynx.pubs.service.impl;

import az.sphynx.pubs.entity.AuthGroup;
import az.sphynx.pubs.service.inter.AuthGroupServiceInter;
import az.sphynx.pubs.dao.AuthGroupDataInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthGroupServiceImpl implements AuthGroupServiceInter {
    @Autowired
    AuthGroupDataInter authGroupDataInter;

    @Override
    public AuthGroup findById(Integer id) {
        return authGroupDataInter.findById(id).get();
    }
}

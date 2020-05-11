package az.sphynx.pubs.service.inter;

import az.sphynx.pubs.entity.AuthRole;

import java.util.List;

public interface RoleServiceInter {
    public AuthRole findById(Integer id);

    public List<AuthRole> findAll();

    public AuthRole save(AuthRole role);
    
}

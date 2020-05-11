package az.sphynx.pubs.dao;

import az.sphynx.pubs.entity.AuthGroup;
import az.sphynx.pubs.entity.AuthGroupRole;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
public interface AuthGroupRoleDaoInter extends CrudRepository<AuthGroupRole, Integer> {

    List<AuthGroupRole> findByGroupId(AuthGroup group);
}

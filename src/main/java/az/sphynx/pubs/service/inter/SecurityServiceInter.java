package az.sphynx.pubs.service.inter;


import az.sphynx.pubs.bean.CustomUserDetail;
import org.springframework.stereotype.Service;

@Service
public interface SecurityServiceInter {

     CustomUserDetail getLoggedInUserDetails();

     void reloadRoles();
}

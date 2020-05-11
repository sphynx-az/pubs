package az.sphynx.pubs.service.inter;

import az.sphynx.pubs.entity.Menu;
import org.springframework.stereotype.Service;
import java.util.List;
@Service 
public interface MenuServiceInter{
List<Menu> findAll();
Menu findById(Integer id);
Menu save(Menu vMenu);
int deleteById(Integer id);
}
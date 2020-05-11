package az.sphynx.pubs.service.inter;

import az.sphynx.pubs.entity.BannerImage;
import org.springframework.stereotype.Service;
import java.util.List;
@Service 
public interface BannerImageServiceInter{
List<BannerImage> findAll();
BannerImage findById(Integer id);
BannerImage save(BannerImage vBannerImage);
int deleteById(Integer id);
}
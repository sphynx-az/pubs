package az.sphynx.pubs.service.inter;

import az.sphynx.pubs.entity.WebsiteSettings;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WebsiteSettingsServiceInter {
    List<WebsiteSettings> findAll();

    WebsiteSettings findById(Integer id);

    WebsiteSettings save(WebsiteSettings vWebsiteSettings);

    int deleteById(Integer id);
}
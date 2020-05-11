package az.sphynx.pubs.controller.rest;

import az.sphynx.pubs.dao.UserDataInter;
import az.sphynx.pubs.dto.UserDTO;

import az.sphynx.pubs.entity.Pub;
import az.sphynx.pubs.service.inter.PubServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/rest")
public class RestController {

    @Autowired
    UserDataInter userDataInter;
    @Autowired
    PubServiceInter pubServiceInter;

    @RequestMapping(value = "/getUserData/{id}")
    public UserDTO getUserData(@PathVariable("id") Integer id) {
        UserDTO userDTO = new UserDTO(userDataInter.findById(id).get().getEmail(), userDataInter.findById(id).get().getPassword());
        return ResponseEntity.ok(userDTO).getBody();
    }

    @RequestMapping(value = "/getPubData/{id}")
    public Pub getPubData(@PathVariable("id") Integer id) {
        Pub pub = pubServiceInter.findById(id);
        return ResponseEntity.ok(pub).getBody();
    }

}

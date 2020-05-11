/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.sphynx.pubs.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.List;

/**
 * @author Thinkpad
 */
@Entity
@Table(name = "pub")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Pub.findAll", query = "SELECT p FROM Pub p")
        , @NamedQuery(name = "Pub.findById", query = "SELECT p FROM Pub p WHERE p.id = :id")
        , @NamedQuery(name = "Pub.findByFbUrl", query = "SELECT p FROM Pub p WHERE p.fbUrl = :fbUrl")
        , @NamedQuery(name = "Pub.findByInstagramUrl", query = "SELECT p FROM Pub p WHERE p.instagramUrl = :instagramUrl")
        , @NamedQuery(name = "Pub.findByLocation", query = "SELECT p FROM Pub p WHERE p.location = :location")
        , @NamedQuery(name = "Pub.findByName", query = "SELECT p FROM Pub p WHERE p.name = :name")
        })
public class Pub implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "fb_url")
    private String fbUrl;
    @Size(max = 255)
    @Column(name = "instagram_url")
    private String instagramUrl;
    @Size(max = 2000)
    @Column(name = "location")
    private String location;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 2000)
    @Column(name = "about")
    private String about;
    @Size(max = 255)
    @Column(name = "phone")
    private String phone;
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pubId")
    private List<Menu> menuList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pubId")
    private List<Feedback> feedbackList;

    public Pub() {
    }

    public Pub(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFbUrl() {
        return fbUrl;
    }

    public void setFbUrl(String fbUrl) {
        this.fbUrl = fbUrl;
    }

    public String getInstagramUrl() {
        return instagramUrl;
    }

    public void setInstagramUrl(String instagramUrl) {
        this.instagramUrl = instagramUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @XmlTransient
    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(List<Feedback> feedbackList) {
        this.feedbackList = feedbackList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pub)) {
            return false;
        }
        Pub other = (Pub) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.brotherhood.com.sphynx.entity.Pub[ id=" + id + " ]";
    }

}

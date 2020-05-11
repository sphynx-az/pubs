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
 *
 * @author Thinkpad
 */
@Entity
@Table(name = "auth_group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AuthGroup.findAll", query = "SELECT a FROM AuthGroup a")
    , @NamedQuery(name = "AuthGroup.findById", query = "SELECT a FROM AuthGroup a WHERE a.id = :id")
    , @NamedQuery(name = "AuthGroup.findByName", query = "SELECT a FROM AuthGroup a WHERE a.name = :name")})
public class AuthGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupId")
    private List<AuthGroupRole> authGroupRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupId")
    private List<User> userList;

    public AuthGroup() {
    }

    public AuthGroup(Integer id) {
        this.id = id;
    }

    public AuthGroup(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<AuthGroupRole> getAuthGroupRoleList() {
        return authGroupRoleList;
    }

    public void setAuthGroupRoleList(List<AuthGroupRole> authGroupRoleList) {
        this.authGroupRoleList = authGroupRoleList;
    }

    @XmlTransient
    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
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
        if (!(object instanceof AuthGroup)) {
            return false;
        }
        AuthGroup other = (AuthGroup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.brotherhood.com.sphynx.entity.AuthGroup[ id=" + id + " ]";
    }
    
}

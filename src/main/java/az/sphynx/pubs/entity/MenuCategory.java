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
@Table(name = "category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MenuCategory.findAll", query = "SELECT m FROM MenuCategory m")
    , @NamedQuery(name = "MenuCategory.findById", query = "SELECT m FROM MenuCategory m WHERE m.id = :id")
    , @NamedQuery(name = "MenuCategory.findByName", query = "SELECT m FROM MenuCategory m WHERE m.name = :name")})
public class MenuCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "categoryId")
    private List<Product> productList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoryId")
    private List<Menu> menuList;

    public MenuCategory() {
    }

    public MenuCategory(Integer id) {
        this.id = id;
    }

    public MenuCategory(Integer id, String name) {
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
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @XmlTransient
    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
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
        if (!(object instanceof MenuCategory)) {
            return false;
        }
        MenuCategory other = (MenuCategory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.brotherhood.com.sphynx.entity.MenuCategory[ id=" + id + " ]";
    }
    
}

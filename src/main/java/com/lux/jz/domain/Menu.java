package com.lux.jz.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 菜单实体类.
 */
@Entity
@Table(name = "menu")

public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Id
    private Long id;
    /**
     * 名称
     */
    @Column(length = 50)
    public String menuName;
    /**
     * 请求url
     */
    @Column(length = 50)
    public String url;
    /**
     * 类型
     */
    @Column(length = 10)
    public String type;
    /**
     * 图标
     */
    @Column(length = 20)
    public String icon;
    /**
     * 排序号
     */
    @Column(length = 20)
    public String orderNum;
    /**
     * 菜单级别
     */
    @Column(length = 10)
    public String menuLevel;
    /**
     * 父级id
     */
    @Column(length = 20)
    public String parentId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel;
    }

    @Override
    public String toString() {
        return "Menu{" +
            "id=" + id +
            ", menuName='" + menuName + '\'' +
            ", url='" + url + '\'' +
            ", type='" + type + '\'' +
            ", icon='" + icon + '\'' +
            ", orderNum='" + orderNum + '\'' +
            ", menuLevel='" + menuLevel + '\'' +
            ", parentId='" + parentId + '\'' +
            '}';
    }
}

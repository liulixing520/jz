package com.lux.jz.service;

import com.lux.jz.domain.Menu;
import com.lux.jz.repository.MenuRepository;
import com.lux.jz.security.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 菜单服务类
 */
@Service
@Transactional
public class MenuService {

    private final Logger log = LoggerFactory.getLogger(MenuService.class);


    @Autowired
    private MenuRepository menuRepository;

    /**
     * @return a list of current users all the menu
     */
    public List<Menu> getMenu() {
        String login =SecurityUtils.getCurrentUserLogin().get();
        return menuRepository.findByLogin(login);
    }

}

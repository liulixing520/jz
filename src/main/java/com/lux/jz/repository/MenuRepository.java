package com.lux.jz.repository;

import com.lux.jz.domain.Menu;
import com.lux.jz.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the User entity.
 */
@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

    /**
     *
     * @param login
     * @return
     */
    @Query(value = " select DISTINCT jm.* from jhi_user ju \n" +
        "LEFT  JOIN jhi_user_authority jua on jua.user_id =ju.id\n" +
        "LEFT JOIN jhi_authority_menu jam on jam.authority_name = jua.authority_name\n" +
        "LEFT JOIN jhi_menu jm on jm.id = jam.menu_id \t\n" +
        "where ju.login = ?1" ,nativeQuery = true)
    List<Menu> findByLogin(String login);


}

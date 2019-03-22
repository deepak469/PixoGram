package com.pixogram.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pixogram.models.Friends;

/**
 * Persistence layer for User entity
 * Adds findByUsername method for use with authentication
 * @author Ed
 *
 */
@Repository
public interface FriendRepository extends JpaRepository<Friends, Integer>
{
	@Query(value = "SELECT * from friends WHERE user_id = :userid",
    		nativeQuery = true
    )
	public List<Friends> findFriendsByUserId(@Param("userid") int userid);
}
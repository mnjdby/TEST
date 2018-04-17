package com.fullerton.olp.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fullerton.olp.model.UserDetail;

//@Repository
public interface UserDetailRepository extends GenericDao<UserDetail, Long> {

	  @Query("SELECT count(*) FROM UserDetail ud  WHERE ud.mobile = :mobile and ud.professionalDetail.panNumber = :panNumber and createdOn > :dateCreated ")
 	  Long getPanCount(@Param("mobile") String mobile, @Param("panNumber") String panNumber, @Param("dateCreated") Date dateCreated);
}
package com.techno.doctorappointmentapp.service;

import java.util.List;

import com.techno.doctorappointmentapp.pojo.DoctorPOJO;
import com.techno.doctorappointmentapp.pojo.DoctorsPOJO;
import com.techno.doctorappointmentapp.pojo.RatingPOJO;
import com.techno.doctorappointmentapp.pojo.UserPOJO;

public interface UserService {

	String addRating(RatingPOJO ratingPOJO);

	List<DoctorPOJO> searchDoctors(String search);

	UserPOJO deleteUserById(Long userId);

	List<DoctorsPOJO> getDoctors();

}

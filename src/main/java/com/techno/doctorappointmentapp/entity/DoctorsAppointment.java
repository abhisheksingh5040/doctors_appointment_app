package com.techno.doctorappointmentapp.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name="dba_doctor_appointment")
public class DoctorsAppointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="doctor_booking_id")
	private Long doctorAppointentId;
	@Column(name="booking_date")
	private LocalDate localDate;
	@Column(name="booking_time")
	private LocalTime localTime;
	
	private String status;
	private String note;
}
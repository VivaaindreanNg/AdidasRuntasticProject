package com.webapp.adidasruntastic.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class SportsSession {

	@Id
	private String id;
	
	@Field("date")
	private Date creationDate = new Date();
	
	@Field("start_time")
	private Long startTime;
	
	@Field("end_time")
	private Long endTime;
	
	@Field("created_at")
	private Long createdAt;
	
	@Field("updated_at")
	private Long updatedAt;
	
	@Field("start_time_timezone_offset")
	private Integer startTimeTimezoneOffset;
	
	@Field("end_time_timezone_offset")
	private Integer endTimeTimezoneOffset;
	
	/** Meters */
	@Field("distance")
	private Integer distance;
	
	@Field("duration")
	private Integer duration;
	
	@Field("elevation_gain")
	private Integer elevationGain;
	
	@Field("elevation_loss")
	private Integer elevationLoss;
	
	@Field("average_speed")
	private Double averageSpeed;
	
	@Field("calories")
	private Integer calories;
	
	@Field("longitude")
	private Double longitude;
	
	@Field("latitude")
	private Double latitude;
	
	@Field("max_speed")
	private Double maxSpeed;
	
	@Field("pause_duration")
	private Integer pauseDuration;
	
	@Field("duration_per_km")
	private Integer durationPerKm;
	
	@Field("temperature")
	private Integer temperature;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Long getStartTime() {
		return startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getEndTime() {
		return endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}

	public Long getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Long updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getStartTimeTimezoneOffset() {
		return startTimeTimezoneOffset;
	}

	public void setStartTimeTimezoneOffset(Integer startTimeTimezoneOffset) {
		this.startTimeTimezoneOffset = startTimeTimezoneOffset;
	}

	public Integer getEndTimeTimezoneOffset() {
		return endTimeTimezoneOffset;
	}

	public void setEndTimeTimezoneOffset(Integer endTimeTimezoneOffset) {
		this.endTimeTimezoneOffset = endTimeTimezoneOffset;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getElevationGain() {
		return elevationGain;
	}

	public void setElevationGain(Integer elevationGain) {
		this.elevationGain = elevationGain;
	}

	public Integer getElevationLoss() {
		return elevationLoss;
	}

	public void setElevationLoss(Integer elevationLoss) {
		this.elevationLoss = elevationLoss;
	}

	public Double getAverageSpeed() {
		return averageSpeed;
	}

	public void setAverageSpeed(Double averageSpeed) {
		this.averageSpeed = averageSpeed;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Integer getPauseDuration() {
		return pauseDuration;
	}

	public void setPauseDuration(Integer pauseDuration) {
		this.pauseDuration = pauseDuration;
	}

	public Integer getDurationPerKm() {
		return durationPerKm;
	}

	public void setDurationPerKm(Integer durationPerKm) {
		this.durationPerKm = durationPerKm;
	}

	public Integer getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "SportsSession [id=" + id + ", creationDate=" + creationDate + ", startTime=" + startTime + ", endTime="
				+ endTime + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", startTimeTimezoneOffset="
				+ startTimeTimezoneOffset + ", endTimeTimezoneOffset=" + endTimeTimezoneOffset + ", distance="
				+ distance + ", duration=" + duration + ", elevationGain=" + elevationGain + ", elevationLoss="
				+ elevationLoss + ", averageSpeed=" + averageSpeed + ", calories=" + calories + ", longitude="
				+ longitude + ", latitude=" + latitude + ", maxSpeed=" + maxSpeed + ", pauseDuration=" + pauseDuration
				+ ", durationPerKm=" + durationPerKm + ", temperature=" + temperature + "]";
	}
}

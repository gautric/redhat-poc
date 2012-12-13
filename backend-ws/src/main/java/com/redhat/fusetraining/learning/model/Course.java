package com.redhat.fusetraining.learning.model;

import java.util.Calendar;

/**
 * 
 * @author mzottner
 * 
 */
public class Course {

	protected String title;

	protected String content;

	protected Calendar startDate;

	protected Calendar stopDate;

	protected Calendar examDate;

	protected long maxStudent;

	/**
	 *
	 */
	public Course() {
	}

	public Course(String title, String content, Calendar startDate, Calendar stopDate, Calendar examDate, long maxStudent) {
		super();
		this.title = title;
		this.content = content;
		this.startDate = startDate;
		this.stopDate = stopDate;
		this.examDate = examDate;
		this.maxStudent = maxStudent;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public Calendar getStopDate() {
		return stopDate;
	}

	public void setStopDate(Calendar stopDate) {
		this.stopDate = stopDate;
	}

	public Calendar getExamDate() {
		return examDate;
	}

	public void setExamDate(Calendar examDate) {
		this.examDate = examDate;
	}

	public long getMaxStudent() {
		return maxStudent;
	}

	public void setMaxStudent(long maxStudent) {
		this.maxStudent = maxStudent;
	}
}

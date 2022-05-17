package com.todo.model;

import java.time.LocalDate;

public class Todo {
	private Long id;
	private String title;
	private String description;
	private LocalDate dueDate;
	private Boolean isCompleted;

	// 생성자
	public Todo(Long passedid, String title, LocalDate dueDate, String description) {
		this.id = passedid;
		this.title = title;
		this.dueDate = dueDate;
		this.description = description;
		this.isCompleted = false;
	}

	// 생성자 오버로딩
	public Todo(String title, String description, LocalDate dueDate) {
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
	}

	// 생성자 오버로딩
	public Todo(Long id, String title, String description, LocalDate dueDate, Boolean isCompleted) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.isCompleted = isCompleted;
	}

	// getter, setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Boolean getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", description=" + description + ", dueDate=" + dueDate
				+ ", isCompleted=" + isCompleted + "]";
	}

	public Todo(Builder builder) {
		this.id = builder.id;
		this.title = builder.title;
		this.description = builder.description;
		this.dueDate = builder.dueDate;
		this.isCompleted = builder.isCompleted;
	}

	// 내부에 정적클래스 생성
	// Builder 적용
	// 정적인 클래스 Builder 생성
	public static class Builder {
		private Long id;
		private String title;
		private String description;
		private LocalDate dueDate;
		private Boolean isCompleted;

		// 필수적인 필드 : id
		public Builder(Long id) {
			this.id = id;
		}

		public Builder title(String title) {
			this.title = title;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Builder dueDate(LocalDate dueDate) {
			this.dueDate = dueDate;
			return this;
		}

		public Builder isCompleted(Boolean isCompleted) {
			this.isCompleted = isCompleted;
			return this;
		}

		public Todo build() {
			return new Todo(this);
		}
	}
}

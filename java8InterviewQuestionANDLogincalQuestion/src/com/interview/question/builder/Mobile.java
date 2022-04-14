package com.interview.question.builder;

public class Mobile {

	private String name;
	private String color; 
	private String processor;
	private String ram;
	
	private Mobile(Builder builder) {
		this.name = builder.name;
		this.color = builder.color;
		this.processor = builder.processor;
		this.ram = builder.ram;
	}
	
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", color=" + color + ", processor=" + processor + ", ram=" + ram + "]";
	}

	public String getName() {
		return this.name;
	}
	public String getColor() {
		return this.color;
	}
	public String getProcessor() {
		return this.processor;
	}
	public String getRam() {
		return this.ram;
	}
	
	
	
	static class Builder{
		private String name;
		private String color; 
		private String processor;
		private String ram;
		
		public Mobile build() {
			return new Mobile(this);
		}
		
		public Builder(String name) {
			this.name = name;
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setColor(String color) {
			this.color = color;
			return this;
		}
		
		public Builder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}
		
		public Builder setRam(String ram) {
			this.ram = ram;
			return this;
		}
	}
}

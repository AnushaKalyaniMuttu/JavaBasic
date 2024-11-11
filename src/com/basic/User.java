package com.basic;


public class User {
		private Integer userId;
		private String userName;
		private Float userSalary;
		private boolean isPermanentUser;
		
		
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public Float getUserSalary() {
			return userSalary;
		}
		public void setUserSalary(Float userSalary) {
			this.userSalary = userSalary;
		}
		public boolean isPermanentUser() {
			return isPermanentUser;
		}
		public void setPermanentUser(boolean isPermanentUser) {
			this.isPermanentUser = isPermanentUser;
		}
		
		@Override
		public String toString() {
			return "User [userId=" + userId +
					", userName=" + userName +
					", userSalary=" + userSalary+
					", isPermanentUser=" + isPermanentUser + "]";
		}
		


		public User(Integer userId,String userName, Float userSalary, boolean isPermanentUser) {
			this.userId=userId;
			this.userName=userName;
			this.userSalary=userSalary;
			this.isPermanentUser=isPermanentUser;
		}
		
		
		public User() {
		}
		
	
}

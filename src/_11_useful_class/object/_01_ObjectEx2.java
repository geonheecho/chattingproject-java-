package _11_useful_class.object;

import java.util.Arrays;

//java.lang.Object
//Object : 모든 객체의 조상
/*
 * clone()
 * equals()
 * getClass()
 * hashCode()
 * toString()
 */
//clone을 쓰지 않을때
class Room{
	private String id;
	private String password;
	private boolean isAuthorized;
	private String role;
	private String[] privilege;

	private int roomNum;
	private String roomType;

	//getter//setter
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public void check_In(Member user) {
		this.id = user.getId();
		this.password = user.getPassword();
		this.isAuthorized = user.isAuthorized();
		this.role = user.getRole();
		this.privilege = Arrays.copyOfRange(user.getPrivilege(), 0, user.getPrivilege().length);
	}
	//check_out
	public Member toMember() {
		return new Member()
				.setId(this.id)
				.setPassword(this.password)
				.setRole(this.role)
				.setAuthorized(this.isAuthorized)
				.setPrivilege(Arrays.copyOfRange(this.privilege, 0, this.privilege.length));
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", password=" + password + ", isAuthorized=" + isAuthorized + ", role=" + role
				+ ", privilege=" + Arrays.toString(privilege) + ", roomNum=" + roomNum + ", roomType=" + roomType + "]";
	}
}


class Member{
	private String id;
	private String password;
	private boolean isAuthorized;
	private String role;
	private String[] privilege;

	//getter//setter
	public String getId() {
		return id;
	}
	public Member setId(String id) {
		this.id = id;
		return this;
	}
	public String getPassword() {
		return password;
	}
	public Member setPassword(String password) {
		this.password = password;
		return this;
	}
	public boolean isAuthorized() {
		return isAuthorized;
	}
	public Member setAuthorized(boolean isAuthorized) {
		this.isAuthorized = isAuthorized;
		return this;
	}
	public String getRole() {
		return role;
	}
	public Member setRole(String role) {
		this.role = role;
		return this;
	}
	public String[] getPrivilege() {
		return privilege;
	}
	public Member setPrivilege(String[] privilege) {
		this.privilege = privilege;
		return this;
	}
	@Override		//alt+shift+s+s
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", isAuthorized=" + isAuthorized + ", role=" + role
				+ ", privilege=" + Arrays.toString(privilege) + "]";
	}


}// class Member

public class _01_ObjectEx2 {
	public static void main(String[] args) {
		Member check_in_user = new Member()
				.setId("abc")
				.setPassword("1234")
				.setRole("student")
				.setAuthorized(true)
				.setPrivilege(new String[] {"w","r"});
		System.out.println(check_in_user);

		Room room = new Room();
		room.setRoomNum(1001);
		room.setRoomType("VIP");
		room.check_In(check_in_user);
		System.out.println(room);

		Member check_out_user = room.toMember();
		System.out.println(check_out_user);
	}//main
}//

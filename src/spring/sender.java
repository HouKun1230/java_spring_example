package spring;

public class sender {
	
	private String msg;
	
	public void setMsg(String message)
	{
		this.msg = message;
	}
	
	public void getMsg()
	{
		System.out.println("Sender send you :" + msg);
	}

}

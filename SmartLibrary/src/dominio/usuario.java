package dominio;
public class usuario {
	
	String nick;
	String password;
	
	public usuario (String nick, String password) {		
		this.nick = nick;
		this.password = password;
	}

	public String getNick() {
		return nick;
	}

	public String getPassword() {
		return password;
	}	
	
}

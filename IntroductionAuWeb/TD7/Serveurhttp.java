import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ServeurHttpD extends Server {

	public ServeurHttpD (int port) throws IOException {
		super(port,true);
	}

	public void dialogue () throws IOException {
		try {
			String typereq = null;
			acceptConn();
			typereq = getRequete();
			if (typereq != null) repRequete(typereq);
			closeConn();
		} catch (IOException e) {
			System.out.println("Problem! Closing the connection");
			closeConn();
		}
	}

	private void repRequete(String typereq) throws IOException {
		writeline(typereq);
	}

	private String getRequete() throws IOException {
		String typereq = null;
		String preligne = null;
		String httpArgs, ligne;
		preligne = readline();
		if (preligne != null) typereq = analyseReq(preligne);
		if (typereq == null) return null;
		boolean fin = false;

		while (!fin) {
			ligne = readline();
			if (ligne == null) return null;
			if (ligne.isEmpty()) fin = true;
		}

		if (preligne.startsWith("POST")) {
			httpArgs = readcars(5); // Ceci est pour l'instant un nombre arbitraire
			debug("reçu " + httpArgs);
		}

		return typereq;
	}

	private String analyseReq(String ligne) {
		String[] treq = ligne.split(" ");
		if (treq.length != 3) return null;
		if (!(treq[0].equals("GET") || treq[0].equals("POST"))) {
			return null;
		}
		return "Bien reçu. Au revoir";
	}

	public static void main(String[] args) {
		ServeurHttpD myserver = null;
		try {
			myserver = new ServeurHttpD(1234);
		} catch (IOException e) {
			System.out.println("Problem while creating server!");
			System.exit(-1);
		}
		try {
			while (true) {
				myserver.dialogue();
			}
		} catch (IOException e) {
			System.out.println("Problem while comm... Closing the connection");
		}
		finally {
			System.out.println("Killing the server");
			myserver.close();
		}
	}
}

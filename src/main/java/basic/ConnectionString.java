package basic;

public class ConnectionString {
    public static void main(String[] args) {
        String conn = "ILAZPWVSQL001.us.ad.wellpoint.com\\\\ASP1P,18551";
        int firstIndex = conn.indexOf("\\\\");
        String hostName = conn.substring(0,firstIndex);
        System.out.println(hostName);
        String portNumber = conn.substring(conn.indexOf(",")+1);
        System.out.println(portNumber);
        String fullConnString = hostName + ":" + portNumber;
        System.out.println(fullConnString);
    }
}

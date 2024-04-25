public class Main {
    public static void main (String [] args){
        AppConfig config = AppConfig.getInstance();
        config.setServerUrl("https://url.server.com.gt");
        config.setPort(5504);
        System.out.println("Server url:" + config.getServerUrl());
        System.out.println("Port:" + config.getPort());

        AppConfig config2 = AppConfig.getInstance();
        config2.setServerUrl("https://url.server2.com.gt");
        config2.setPort(5505);
        System.out.println("Server url 2:" + config2.getServerUrl());
        System.out.println("Port 2:" + config2.getPort());

        AppConfig config3 = AppConfig.getInstance();
        System.out.println("Server url 3:" + config3.getServerUrl());
        System.out.println("Port 3:" + config3.getPort());
    }
}

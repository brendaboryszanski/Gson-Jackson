import org.eclipse.jetty.server.Server;
import org.joda.time.DateTimeZone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {

    private static final int DEFAULT_PORT = 9290;

    private static final String CONTEXT_NAME = "/";

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    private final Server server;

    private Main(String[] args) throws IOException {
        this.server = this.createNewServer(args);
    }

    public static void main(String[] args) throws Exception {
        Main server = new Main(args);
        server.run();
    }

    private Server createNewServer(String[] args) throws IOException {
        int port = args.length > 0 ? Integer.parseInt(args[0]) : DEFAULT_PORT;
        String contextPath = args.length > 1 ? args[1] : CONTEXT_NAME;

        Server server = new Server(port);
        server.setStopAtShutdown(true);
        DateTimeZone.setDefault(DateTimeZone.UTC);

        return server;
    }

    private void run() throws Exception {
        this.server.start();
        this.server.join();
        LOGGER.info("Server Started");
    }
}

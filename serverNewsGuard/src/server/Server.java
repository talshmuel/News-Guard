package server;
import engine.Engine;


public class Server {
    Engine engine;
    AuthController authController;

    public Server()
    {
        authController = new AuthController(engine);
    }
}

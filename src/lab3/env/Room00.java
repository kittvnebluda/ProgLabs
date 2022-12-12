package lab3.env;

import lab3.Env;
import lab3.Human;
import lab3.Room;

public class Room00 extends Env implements Room {

    public Room00(Env ... container) {
        super.setEnv(container);
    }

    @Override
    public void moveHuman(Human human, Env env) {
        for(Env e: getEnv()) {
            e.removeHuman(human);
        }
    }
}

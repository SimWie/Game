package mario.jade;

import java.awt.event.KeyEvent;

public class LevelScene extends Scene {

    public LevelScene() {
        System.out.println("Level Scene");
        Window.get().r = 1;
        Window.get().g = 0;
        Window.get().b = 0;
    }


    @Override
    public void update(float dt) {
        if (KeyListener.isKeyPressed(KeyEvent.VK_SPACE)) {
            Window.changeScene(0);
        }

    }
}

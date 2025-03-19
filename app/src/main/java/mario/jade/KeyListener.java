package mario.jade;

import static org.lwjgl.glfw.GLFW.GLFW_PRESS;
import static org.lwjgl.glfw.GLFW.GLFW_RELEASE;

public class KeyListener {

    private static KeyListener instance;
    @SuppressWarnings("FieldMayBeFinal")
    private boolean keyPressed[] = new boolean[350];

    // Sicherstellen, dass keine Instanz erstellt werden kann
    private KeyListener() {
    }

    // Bei aufrufen von Get prüffen ob es schon eine Instanz gib, wenn nicht eine erstellen.
    public static KeyListener get() {
        if (KeyListener.instance == null) {
            KeyListener.instance = new KeyListener();
        }
        return KeyListener.instance;
    }

    
    public static void keyCallback(long window, int key, int scancode, int action, int mods) {
        if (action == GLFW_PRESS) {
            if (key < get().keyPressed.length) {
                get().keyPressed[key] = true;
            }
        } else if (action == GLFW_RELEASE) {
            get().keyPressed[key] = false;
        }
    }

    // getter für Abfrage ob Taste gedrückt ist
    public static boolean isKeyPressed(int keyCode) {
        if (keyCode < get().keyPressed.length) {
        return get().keyPressed[keyCode];
        } else {
            return false;
        }
    }
}

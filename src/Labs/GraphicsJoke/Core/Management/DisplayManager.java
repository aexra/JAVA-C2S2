package Labs.GraphicsJoke.Core.Management;

import Labs.GraphicsJoke.Core.Drawing.Window;
import Labs.GraphicsJoke.Core.Structs.NativeWindowSettings;

public class DisplayManager {
    public static Window createWindow(NativeWindowSettings settings) {
        return new Window(settings);
    }
}

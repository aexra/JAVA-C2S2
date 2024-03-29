package Labs.GraphicsJoke.Core.Management;

import Labs.GraphicsJoke.Core.Management.Textures.Texture2D;
import Labs.GraphicsJoke.Core.Management.Textures.TextureFactory;

public class ResourceManager {
    public static Texture2D LoadTexture(String textureName) {
        return TextureFactory.Load(textureName);
    }
}

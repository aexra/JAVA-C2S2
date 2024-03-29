package Labs.GraphicsJoke.Core.Drawing;

import Labs.GraphicsJoke.Core.Interfaces.ITransformable;

public class Figure implements ITransformable {

    public void validate() {}
    public void invalidate() {}
    public void forceUpdate() {}

    @Override
    public boolean translate() { return true; }
    @Override
    public boolean rotate() { return true; }
    @Override
    public boolean scale() { return true; }

    
    
}

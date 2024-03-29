package Labs.GraphicsJoke.Core.Rendering.Buffers;

import java.util.LinkedList;

public class BufferLayout {
    private LinkedList<BufferElement> _elements;
    private int _stride;

    public BufferLayout() {
        _stride = 0;
        _elements = new LinkedList<BufferElement>();
    }

    public LinkedList<BufferElement> GetBufferElements() {
        return _elements;
    }
    public int GetStride() {
        return _stride;
    }
    public <T> void Add(int count, boolean normalized) {
        ///
    }
}

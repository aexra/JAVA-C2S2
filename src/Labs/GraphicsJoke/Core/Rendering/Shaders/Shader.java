package Labs.GraphicsJoke.Core.Rendering.Shaders;

public class Shader {
    public Shader(String filePath) {

    }

    public boolean compileShader() {
        return true;
    }
    public int getUniformLocation() {
        return 0;
    }
    public void use() {

    }

    public static ShaderProgramSource parseShader(String filePath) {
        return new ShaderProgramSource("vertex", "fragment");
    }
}

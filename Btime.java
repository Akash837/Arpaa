import java.io.IOException;

public class Btime
{
    public static void main(String args[]) throws IOException
    {
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"quser\"");
    }
}
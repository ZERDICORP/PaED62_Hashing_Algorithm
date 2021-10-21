import java.io.IOException;

public class PaED62
{
	public static String hash(String sInput)
	{
		char[] result = new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz").toCharArray();

		for (int j = 0; j < sInput.length(); ++j)
			for (int i = 0; i < result.length; ++i)
				result[i] = (char)((((int)result[i] * (i + 1)) + ((int)sInput.charAt(j) * (j + 1))) % (126 - 33) + 33);

		return new String(result);
	}

	public static void main(String[] args)
	{
		System.out.println(hash("Hello, world!"));
		System.out.println(hash("Hello, world! "));

		try
		{
			System.in.read();
		}
		catch (IOException e) {e.printStackTrace();}
	}
}
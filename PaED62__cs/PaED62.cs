using System;

class PaED62
{
	static string hash(string sInput)
	{
		char[] sResult = new string("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz").ToCharArray();

		for (int j = 0; j < sInput.Length; ++j)
			for (int i = 0; i < sResult.Length; ++i)
				sResult[i] = (char)((((int)sResult[i] * (i + 1)) + ((int)sInput[j] * (j + 1))) % (126 - 33) + 33);

		return new string(sResult);
	}

	static void Main(string[] args)
	{
		Console.WriteLine(hash("Hello, world!"));
		Console.WriteLine(hash("Hello, world! "));

		Console.ReadKey();
	}
}
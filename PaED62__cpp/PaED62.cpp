#include <iostream>

std::string hash(std::string sInput)
{
	std::string sOutput = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	for (int j = 0; j < sInput.size(); ++j)
		for (int i = 0; i < sOutput.size(); ++i)
			sOutput[i] = (char)((((int)sOutput[i] * (i + 1)) + ((int)sInput[j] * (j + 1))) % (126 - 33) + 33);

	return sOutput;
}

int main(int argc, char const *argv[])
{
	std::cout << hash("Hello, world!") << std::endl;
	std::cout << hash("Hello, world! ") << std::endl;

	system("pause > nul");
	return 0;
}
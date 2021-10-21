const hash = (sInput) =>
{
	sOutput = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".split("");

	for (let j = 0; j < sInput.length; ++j)
		for (let i = 0; i < sOutput.length; ++i)
			sOutput[i] = String.fromCharCode(((sOutput[i].charCodeAt(0) * (i + 1)) + (sInput.charCodeAt(j) * (j + 1))) % (126 - 33) + 33);

	return sOutput.join("");
};

console.log(hash("Hello, world!"));
console.log(hash("Hello, world! "));
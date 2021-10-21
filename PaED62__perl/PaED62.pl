#!/usr/bin/perl -l

use strict;
use warnings;

sub hash
{
	my @input = split(//, $_[0]);
	my @output = split(//, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");

	for (my $j = 0; $j < scalar(@input); $j++)
	{
		for (my $i = 0; $i < scalar(@output); $i++)
		{
			$output[$i] = chr(((ord($output[$i]) * ($i + 1)) + (ord($input[$j]) * ($j + 1))) % (126 - 33) + 33);
		}
	}

	return join("", @output);
}

print(hash("Hello, world!"));
print(hash("Hello, world! "));

<STDIN>;
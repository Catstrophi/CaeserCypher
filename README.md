# CaeserCypher
caeser cypher

The main method is the entry point of the program. It calls the coder method with the input word "Hello World" and a shift of -3, and prints the result.
The convert method takes a character let and an integer shift as parameters. It performs the character conversion based on the shift value.
Inside the convert method, the code checks if the character let is uppercase, lowercase, or whitespace using the Character class methods isUpperCase, isLowerCase, and isWhitespace.

If the character is uppercase, the code applies the shift by adding the shift value, subtracting the ASCII value of 'A' (65), taking the modulus 26 to wrap around the alphabet, and adding back the ASCII value of 'A' to get the resulting character.

If the character is lowercase, the code applies a similar process but uses the ASCII value of 'a' (97) instead.

If the character is whitespace, it is preserved as a space character.
The resulting character is stored in the rslt variable and returned.

The coder method takes a string word and an integer shift as parameters. It iterates over each character in the word string.
For each character, it calls the convert method and concatenates the result to the fnal string.
After iterating through all characters, the fnal string is returned as the result of the cipher encoding.
The main method calls the coder method with the input word "Hello World" and a shift of -3, and the resulting encoded string is printed.

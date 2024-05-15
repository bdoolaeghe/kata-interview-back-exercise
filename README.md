# interview-back-exercise back

Write a program that convert an input number into a string according to the following rules :

 * If the number is divisible by 3 or contains 3, replace 3 by "Neo";
 * if the number is divisible by 5 or contains 5, replace 5 by "So";
 * if the number contains 7, replace 7 by "Ft".
 * Divisors have high predecence, the content is analyzed in the order of appearance.
 * If no match, return the input number as a string.
 
 Here is a list of examples :

- 1 should return: '1'
- 3 should return 'NeoNeo'
- 5 should return 'SoSo'
- 7 should return 'Ft'
- 9 should return 'Neo'
- 51 should return 'NeoSo'
- 53 should return 'SoNeo'
- 33 should return 'NeoNeoNeo'
- 27 should return 'NeoFt'
- 15 should return 'NeoSoSo'


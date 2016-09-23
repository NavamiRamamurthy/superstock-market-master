# superstock-market-master
Simple stock application

Steps to run:
mvn test 
mvn package
java -jar target/{jarname}.jar

Requirements

Provide working source code that will:

a. For a given stock:

i.    Calculate the dividend yield.
ii.   Calculate the P/E Ratio.
iii.  Record a trade, with timestamp, quantity of shares, buy or sell indicator and price.
iv.   Calculate Stock Price based on trades recorded in past 15 minutes.
b. Calculate the GBCE All Share Index using the geometric mean of prices for all stocks

Constraints & Notes

Written in one of these languages:

Java, C#, C++, Python.
No database or GUI is required, all data need only be held in memory.

Formulas and data provided are simplified representations for the purpose of this exercise.

Global Beverage Corporation Exchange

Stock Symbol	Type	Last Dividend	Fixed Dividend	Par Value
TEA	Common	0		100
POP	Common	8		100
ALE	Common	23		60
GIN	Preferred	8	2%	100
JOE	Common	13		250

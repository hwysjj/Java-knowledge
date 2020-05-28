# Java Learning Journey

## Command

```bash
# build code
$ javac xxx.java

# run code
$ java xxx
```

## Main Function

- Public static void main(String[] args), entry for java program
- Params (String[] args, String [] args, or String args[])
- Name of java file must be consistent with class name to be defined
- Could define multiple classes in one java file, but pulic class should have only one.

## Binary Number

### 1's complement

- Positive numbers are simply represented as Binary number number. There is nothing to do for positive binary number.  *e.g. **1's complement** of +6 (00000110) is 00000110*
- If the number is negative then it is represented using 1’s complement. First represent the number with positive sign and then take 1’s complement of that number.  *e.g. **1's complement** of -6 (10000110) is 11111001*

### 2's complement

- **2’s complement** of a binary number is 1 added to the **1’s complement** of the binary number.
- The main difference between 1′ s complement and 2′ s complement is that 1′ s complement has two representations of 0 (zero) – 00000000, which is positive zero (+0) and 11111111, which is negative zero (-0); whereas in 2′ s complement, there is only one representation for zero – 00000000 (+0) because if we add 1 to 11111111 (-1), we get 00000000 (+0) which is the same as positive zero. This is the reason why 2′ s complement is generally used.

``` 
e.g. System.out.println(~4);

4: (00000100) as 2’s complement
~4: (11111011) as 2’s complement
-1: (11111010) as 1’s complement
(10000101) as true code
# output: -5 
```

## Java Data Type

### 1. value type

byte short int long float double char boolean

### 2. referece type

class interface array

## Memory

### Stack

- store local variable
- auto release space

### Heap

- store object via new ()
- release via System.gc

### Method Area

- store class information, static variable, const string

## Package

### Normal Package in JDK

- lang (auto load)
- net
- io
- util

## Import

import [package name].[class name]

## Import Static

Math.abs() -> abs()

## Integer

- ValueOf (save to cache array if value rage is -128 ~ 127)




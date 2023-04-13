## Fizzbuzz

# Overview

Output integers ranging from 1 to n replacing any number divisible by 3 with the word "fizz", and any number divisible by 5 with the word "buzz", and any number divisible by both 3 and 5 with the word "fizzbuzz".

e.g.
fizzbuzz(35) = {1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz, 16, 17, fizz, 19, buzz, fizz, 22, 23, fizz, buzz, 26, fizz, 28, 29, fizzbuzz, 31, 32, fizz, 34, buzz}

# Analysis

class FizzBuzzGenerator
    generate(n : integer) : List<String>

class FizzBuzzPresenter
    present(generatedFizzBuzzList : List<String>) : String

main(int n) {
    print(new FizzBuzzPresenter().present(new FizzBuzzGenerator().generate(n)))
}


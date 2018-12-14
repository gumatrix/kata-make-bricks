# Make Bricks Kata

## Transformation Priority Premise

This kata applies the ideas presented in the [Transformation Priority Premise](http://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html)
by Uncle Bob and attempts to reenact decisions that were made in the [Prime Factor Kata](http://butunclebob.com/ArticleS.UncleBob.ThePrimeFactorsKata)
to further my understanding.

### Transformations

1. Null
2. Null to Constant
3. Constant to Variable
4. Add Computation
5. Split Flow
6. Variable to Array
7. Array to Container
8. If to While
9. Recurse
10. Iterate
11. Assign
12. Add Case

## Initial requirements

We want to make a row of bricks that is goal inches long. We have a number of small bricks (1" ea) and big bricks 
(5" ea). Return true if it is possible to make the goal by choosing from the given bricks. This is a little 
harder than it looks and can be done without any loops. See [CodingBat.com](https://codingbat.com/prob/p183562).

## Acceptance Criteria

* __Given__ a supply of _< small >_ bricks
* __And__ a supply of _< big >_ bricks
* __And__ a goal to make a row of bricks _< goal >_ inches long
* __When__ a row of bricks is made from the bricks provided
* __Then__ achieving _< goal >_ inches long is _< output >_

| small | big     | goal   | output |
|-------|---------|--------|--------|
| 0     | 0       | 0      | true   |
| 1     | 1       | 0      | true   |
| 1     | 0       | 2      | false  |
| 2     | 0       | 2      | true   |
| 3     | 0       | 2      | true   |
| 3     | 0       | 2      | true   |
| 1     | 1       | 2      | false  |
| 1     | 0       | 5      | false  |
| 5     | 0       | 5      | true   |
| 0     | 1       | 5      | true   |
| 1     | 1       | 5      | true   |
| 2     | 0       | 4      | false  |
| 4     | 1       | 4      | true   |
| 0     | 2       | 6      | false  |
| 6     | 1       | 6      | true   |
| 1     | 1       | 6      | true   |
| 9     | 0       | 10     | false  |
| 9     | 1       | 10     | true   |
| 0     | 2       | 10     | true   |
| 0     | 4       | 20     | true   |
| 15    | 1       | 20     | true   |
| 14    | 1       | 20     | false  |
| 2     | 1000000 | 100003 | false  |

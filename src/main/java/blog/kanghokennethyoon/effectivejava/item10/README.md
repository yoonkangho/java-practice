## Item 10: Redefine equals() using normal protocol

### Be cautious with this method

Violating constraints for equals() may jeopardize other code using the instance.

### Don't redefine equals() unless it's necessary.

An instance will always be equal only to itself.

If the situation falls under any of following, don't redefine it.

- Instances are innately unique.
- There's no need to check instances' logical equality.
- Redefined equals() of parent class works for child class.
- Class is private / package-private and there's no need to call equals().

### Then when should we redefine equals()?

It's when we need to check logical equality rather than object equality.
Often, value classes fall under this case.
We'd want to compare whether the values of the instances are same, not the instance itself.

### Equivalence relation

equals() should satisfy all of below

- reflexivity: for all non-null reference x, x.equals(x) = true
- symmetry: for all non-null references x, y, if x.equals(y) = true, then y.equals(x) = true
- transitivity: for all non-null references x, y, z, if x.equals(y) = true and y.equals(z) = true, then x.equals(z) = true
- consistency: for all non-null references x, y, repeated calls for x.equals(y) will always return true or always return false
- non-null: for all non-null reference x, x.equals(null) = false

### Examples of bad equals()

- java.sql.Timestamp
- java.net.URL

### General guide for implementing equals()

1. use == to check self-reference for perf optimization
2. use instanceof to check type
3. cast the input to proper type
4. compare all core fields to return true if all match or else return false
    - use == for primitive type fields
    - use equals() for reference type fields
    - use Float.compare() or Double.compare() for Float and Double
5. add unit tests to guarantee equivalence relations

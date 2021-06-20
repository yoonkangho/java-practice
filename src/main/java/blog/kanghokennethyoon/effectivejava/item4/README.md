## Item4: use private constructor to prevent instantiation

### When?

There are cases that where a class is meant to be used as a collection of static methods and static fields.

It does not follow OOP, but it does serve purpose, such as java.util.Arrays or java.lang.Math.

By default, if no constructor exists, compiler creates a no-arg constructor. Users cannot know whether the constructor is auto-generated or not.

To avoid this, we can add a private constructor.
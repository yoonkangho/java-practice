## Item3: use private constuctor or enum to guarantee singleton

### Singleton?

Everything tangible in java belongs to a class, which by default, can serve to instantiate multiple instances.

There are cases where there must be only one instance of a class.

Such instance is called a **singleton**.

### Ways to create singleton

1. public static final member variable
    - very explicit and simple
2. static factory
    - can later return different instance to different contexts
3. enum
    - similar to method 1 but more concise
    - no effort required to serialize
    - can't inherit other class 

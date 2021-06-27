## Item 9: Use try-with-resources over try-finally.

### When?

There are many cases in java programming where a resource must be explicitly closed with close().

Code becomes much more clean for AutoCloseable resources with try-with-resources block. 
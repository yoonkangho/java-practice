## Item 8: Do not use finalizer nor cleaner.

### Just don't.

They're unpredictable, their behavior differs depending on the GC implementation, and has performance / security issues. 
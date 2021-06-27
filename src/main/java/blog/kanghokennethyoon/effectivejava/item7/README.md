## Item 7: release references to objects after use

### Watch out for memory leaks

Be cautious of how GC works, where objects continue to hold references to obsolete objects.

Appropriately scope references.

Explicitly assign null where necesary.

Watch out for classes that manage their own memory.

Make use of WeakHashMap.

 

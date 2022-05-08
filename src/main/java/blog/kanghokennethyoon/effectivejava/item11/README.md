## Item 11: When redefining equals(), redefine hashCode() as well

### Any class redefining equals() should redefine hashCode().

Otherwise, protocol for hashCode will be violated and HashMap<> or HashSet<> of the class will not function properly.

Specification for Object defines that if two instances are equal according to equals(), then their hashCode() should return same value as well.


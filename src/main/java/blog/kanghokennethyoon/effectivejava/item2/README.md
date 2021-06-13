## Item2: Consider builder if constructor has many parameters

### Why not other options?

When constructor should have many parameters,

- telescoping constructor pattern
    - becomes verbose, less readable
    - have to count to put parameter at right index

- java beans
    - requires calling many setters
    - is inconsistent until all fields become set


### Builder pattern

1. client gets builder (with required params if any)
2. client uses builder to set optional parameters
3. client calls builder.build() to get the resulting instance

#### Pros

- works well with hierarchically designed classes
- can use multiple variable arguments

#### Cons

- overhead: must create builder before creating instance
- code gets verbose when there are few parameters

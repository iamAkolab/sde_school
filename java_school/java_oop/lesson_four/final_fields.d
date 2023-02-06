# Final fields

The final keyword can also be used to describe fields. However, unlike with methods, a final field has nothing to do with inheritance!

A final field is simply a constant variable! In other words, a variable that is only to be set once and is not allowed to change ever again!

A good example of a final field is defining math constants, like PI:

```
public class MathLib{
   public final double PI = 3.14;
}
```

This basically means that even though the field is public, you are not allowed to change the value of PI anywhere (inside or outside of this class).
```
public static void main(String [] args){
   MathLib mathlib = new MathLib();
   mathlib.PI = 0; // This is not allowed and will show a compiler error!
}
```

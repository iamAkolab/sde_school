# Final methods
Being able to override any method could be dangerous. If someone creates a class with a certain method, they assume this method behaves in a certain way.

That's why, if you want to protect your method from being overridden in a child class you can prefix it with the keyword final.

A final method can still be accessed by the child class (if the permissions allow so) but cannot be overridden, hence you can guarantee that any final method will behave exactly like the parent's implementation.

Here's an example:

```
public class Room{
   private double width;
   private double height;
   public Room(double width, double height){
      this.width = width;
      this.height =height;
   }
   public final double getArea(){
      return width*height;
   }
}
```

Now if another class extends Room, no matter what type of room it is it shouldn't be allowed to override the method getArea because the area should always be calculated the same way:

```
public class LivingRoom extends Room{
   // The constructor simply calls the parent's constructor using super()
   public LivingRoom(double width, double height){
        super(width,height);
    }
   // Not allowed to override getArea() here
}
```
But since the method is public, it means that it's also available in the child class:
```
LivingRoom myLivingRoom = new LivingRoom(5,3);
double area = myLivingRoom.getArea();
System.out.println(area);
```

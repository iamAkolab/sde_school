# The Contacts Manager
Assume you're writing a Java program that's responsible for storing and managing all your friends' contact information.

We'll start by creating a class that's responsible for storing all contact information of a single person, it will look something like this:

```
class Contact{
   String name;
   String email;
   String phoneNumber;
}
```

All fields, no methods, since a contact object itself won't be "doing" much actions itself in the scope of this program, it's merely a slightly 
more advanced data type that can store a few strings in 1 variable

Next, let's create the class that will be in charge of adding and searching for contacts. Since it will be managing all the contacts, I'll call it ContactsManager:
This class will be storing the contacts in an array, which means one of its fields will be an array of Contacts, another field will be an int representing the number 
of friends added to the array, this int will help us know where in the array was the last contact added so we can continue to add more contacts into the array later 
as we will see.

```
class ContactsManager {
   // Fields:
   Contact [] myFriends;
   int friendsCount;
}
```

Okay, now let's create a default constructor that will initialize those fields.

```
class ContactsManager {
   // Fields:
   Contact [] myFriends;
   int friendsCount;
   // Constructor:
   ContactsManager(){
      this.friendsCount = 0;
      this.myFriends = new Contact[500];
   }
}
```
he friendsCount starts from 0 and will increment every time we add a new contact later.

The Contact array myFriends (just like any array) needs to be initialized using the new keyword and we chose to reserve enough space in the array to store up 
to 500 contacts.

# The ContactsManager class methods

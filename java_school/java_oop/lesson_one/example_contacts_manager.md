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
the friendsCount starts from 0 and will increment every time we add a new contact later.

The Contact array myFriends (just like any array) needs to be initialized using the new keyword and we chose to reserve enough space in the array to store up 
to 500 contacts.

# The ContactsManager class methods
The first method we will create in the ContactsManager class is the addContact method which will add a Contact object to the Contact array myFriends:

```
  void addContact(Contact contact){
      myFriends[friendsCount] = contact;
      friendsCount++;
   }
  ```
  
The method addContact takes a Contact object as an input parameter, and uses the friendsCount value to fill that slot in the array with the contact that was passed into the method.
Then, since we need to move that counter to point to the following slot in the array, we increment friendsCount using the increment operation ++

Now, let's add another method called searchContact that will search through the array using a name String and return a Contact object once a match is found:
```
Contact searchContact(String searchName){
   for(int i=0; i<friendsCount; i++){
      if(myFriends[i].name.equals(searchName)){
         return myFriends[i];
      }
   }
   return null;
}
```

This method loops over the array, and for each element myFriends[i] it compares the name field to the searchName value using this if statment.
This if statement will evaluate to true if the searchName is equal to the name field in the Contact stored in myFriends[i]

If it was a match, the loop will return the matching Contact object myFriends[i]. Otherwise. it will return null indicating that it could not find that contact.

Putting all this together, our ContactsManager class will look like this:

```
class ContactsManager {
   // Fields:
   Contact [] myFriends;
   int friendsCount;

   // Constructor:
   ContactsManager(){
      friendsCount = 0;
      myFriends = new Contact[500];
   }

   // Methods:
   void addContact(Contact contact){
      myFriends[friendsCount] = contact;
      friendsCount++;
   }

   Contact searchContact(String searchName){
      for(int i=0; i<friendsCount; i++){
         if(myFriends[i].name.equals(searchName)){
            return myFriends[i];
         }
      }
      return null;
   }
}
```



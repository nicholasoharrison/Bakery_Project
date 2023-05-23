My project is a simple user interface for a bakery. Its intended users would be the bakery
employees when taking/cashing out an order. The program would first take the name and phone
number (10-digit phone number) of the customer for later use on the receipt, added to the Person class.
After those were entered (correctly) the main screen would be displayed with the 4 main categories
of the bakery. If one of those buttons was pressed, the screen would change to the specific items in
that category. Once a specific item was pressed, that item, part of the Item class would be added to
the ArrayList holding all the bakery items. The four main categories have their own classes, children
of the item class. Those child classes has their specific category name listed and saved in the class.
So, when an item from one of those categories is pressed, a constructor will create and add an object from
the child class to the ArrayList. In addition to that, the price of the item will be added to the
total price variable displayed on the screen as well. Once the order is complete, an Order object is
created, taking in the Person object created with the name and phone number, as well as the ArrayList of
Items. That ArrayList is then looped through to get the category, name, and price of each object,
printing them to the Receipt.txt file. The total is then calculated and displayed with the tax amount
and grand total. From there, the Receipt.txt file is read and displayed in the label on the final
screen of the GUI, showing the receipt wrote to the file properly.

Difficulties arose when creating the GUI, trying to get all the buttons spaced out properly within
the stage, making the interface look more professional. I learned more about action events for
many of the controls and different ways to use those action events when I was messing around
with different types of events. I also struggled to find a way to read a file to display on a page
of my GUI, which was solved by reading it to a string and adding that string to a label. To keep my
code organized, I used many comments to separate each part of the code out, so I could easily see where
a certain part began and ended so that I did not modify code in the wrong areas.


## **Assignment Three by Nikhil Sethi (1213414)**
---
### **TASK ONE**


**Question one: How to increase the size of the button or fit the button in the whole form?**
*I managed to do this by searching up for this on google and the result I found was that we can 
set the button as MAX height and MAX width so button gets bigger in the size and fits the whole form. 
The piece of code that implemented was btn.setMaxWidth(Double.MAX_VALUE); and btn.setMaxHeight(Double.MAX_VALUE); 
This allowed the button to cover the whole form(stage).* 

**Question two: How to display a message box (stage) in the form?**
*To display a message box we need to make a new stage and a scene so another window can pop up when the 
button is pressed. Or another possibility is that we can use ‘Vbox’ which appears when a button is pressed 
and a click event will trigger. To use Vbox, we need to import some javafx libraries.*

**Question three: Does the stage automatically resize when the object are added to it?**
*Yes, it auto resize the form by default. When multiple object were added to the form, it kept resizing*

---


### **TASK TWO**

**Question one: What happens If this changes “launch(args)” to “launch(args[0])”?**
*In the main method when launch(args[0]) is added the program does not run at all, 
it throws an exception error because I think it ask for an argument in the command line.*

**Question two: When pressing the enter key it does not trigger anything. It is triggered when Space key pressed. Why?** 
*The space key gets automatically fired, I think its by default. The fucntion setDefaultButton(true) does not work
because there are multiple button that can be pressed. I think the Enter key needs the focus rather than space key,
then it will work.*


**Question three: How to switch between scenes?**
*For switching between scenes, the javafx requires 2 of every object that has been declared and need a stage variable
and building 2 panes, and creating two scenes, and then button click event to switch between the scenes. But the javafx
can only show one scene at one time not multiple scenes.*
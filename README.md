# DynamicFragments
this project shows communication between fragments
Create an android app to demonstrate communication between Dynamic fragments involving BottomNavigationBar.
Ans:
1- In this question we have work with the Dynamic fragments. Dynamic fragments are usually applied when we have to work with Bottom Navigation Bar which need 3 to 5 fragments. Dynamic Fragments use the java code to implement and work the fragment functionality.
Dynamic Fragments uses these methods:
FragmentManager().beginTransaction()
                               .replace(R.id.container, fragment)
		       .commit()
2- Bottom Navigation Bar helps in switching between fragments those it contains inside it. It makes easy to explore and view the activities in single click.
It is a part of google material design implementation 
3 -Communication between fragments have to modular not directly linked to each other, they should not be aware of their presence in app component.
To communicate between fragments an activity is required in between to receive the data from one fragment and send it to other.
We use interface for that specific purpose.
 public void onAttach(Context context)
 public void onDetach()

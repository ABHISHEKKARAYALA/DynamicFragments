# DynamicFragments
<br>this project shows communication between fragments</br>
<br>Create an android app to demonstrate communication between Dynamic fragments involving BottomNavigationBar.</br>
<br>Ans:</br>
<br>1- In this question we have work with the Dynamic fragments. Dynamic fragments are usually applied when we have to work with Bottom Navigation Bar which need 3 to 5 fragments. Dynamic Fragments use the java code to implement and work the fragment functionality.
Dynamic Fragments uses these methods:</br>
<br>FragmentManager().beginTransaction()</br>
                               <br>.replace(R.id.container, fragment)<br>
		       <br>.commit()</br>
<br>2- Bottom Navigation Bar helps in switching between fragments those it contains inside it. It makes easy to explore and view the activities in single click.</br>
<br>It is a part of google material design implementation </br></br>
<br>3 -Communication between fragments have to modular not directly linked to each other, they should not be aware of their presence in app component.</br>
<br>To communicate between fragments an activity is required in between to receive the data from one fragment and send it to other.
We use interface for that specific purpose.</br>
<br> public void onAttach(Context context)</br>
 <br>public void onDetach()</br>

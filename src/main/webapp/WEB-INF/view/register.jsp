<h2>Student Registration Form</h2>
<form action="register"> <!-- it will return register action along with data in key value pair to register controller -->
	First Name: <input type="text" name="fname"
		placeholder="Enter first name"><br> Last Name: <input
		type="text" name="lname" placeholder="Enter last name"><br>
	Address: <input type="text" name="add" placeholder="Enter address"><br>
	Contact No: <input type="number" name="phno" placeholder="Enter Ph No"><br>
	Gender: <input type="radio" name="gender" value="m">Male <input
		type="radio" name="gender" value="f">Female<br> Language
	known: <input type="checkbox" name="language" value="Marathi">Marathi
	<input type="checkbox" name="language" value="Hindi">Hindi <input
		type="checkbox" name="language" value="English">English<br>
	<input type="submit" value="Submit">
</form>

<!-- here data is too large so for that in Java we create form binding class for student .
we create form binding class in project structure  -->
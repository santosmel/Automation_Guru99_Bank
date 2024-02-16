<!DOCTYPE html>
<html lang="en">
<head>
<title>CSS Template</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: #1E90FF;
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: white;
}

/* Container for flexboxes */
section {
  display: -webkit-flex;
  display: flex;
}

/* Style the navigation menu */
nav {
  -webkit-flex: 1;
  -ms-flex: 1;
  flex: 1;
  background: #ccc;
  padding: 20px;
}

/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}

/* Style the content */
article {
  -webkit-flex: 3;
  -ms-flex: 3;
  flex: 3;
  background-color: #f1f1f1;
  padding: 10px;
}

/* Style the footer */
footer {
  background-color: #1E90FF;
  padding: 10px;
  text-align: center;
  color: white;
}

/* Responsive layout - makes the menu and the content (inside the section) sit on top of each other instead of next to each other */
@media (max-width: 600px) {
  section {
    -webkit-flex-direction: column;
    flex-direction: column;
  }
}
</style>
</head>
<body>

<header>
  <h2 id="home">Test Automation Guru99 Bank Demo website</h2>
  <p>This is the guide for the Test Automation done for the Guru99 Bank Demo website</p>
</header>

<section>
  <nav>
    <ul>
      <li><a href="#TestDetails">Test Details</a></li>	  
    </ul>
	    <ul>
      <li><a href="#Login">Login</a></li>
    </ul>
  </nav>
  
  <article>
    <h1 id="TestDetails">Test Details</h1>
	<p>URL: <a href="https://demo.guru99.com/v4">https://demo.guru99.com/v4</a></p>
	<p>For the access, just follow the "Steps to Generate Access"</p>
	<img src=screenshot_README/visit_here.png>
	<hr>
	<h1 id="Login">Login Test Steps</h1>
	<p>1. Open the browser.</p>
	<p>2. Go to <a href="https://demo.guru99.com/v4">https://demo.guru99.com/v4</a>.</p>
	<p>3. In 'UserID', provide the User ID.</p>
	<p>4. In the 'Password', provide the Password.</p>
	<p>5. Click the 'LOGIN' button.</p>
	<p>6. 'Login Successful' shown in the console.</p>
	<p>7. Quit driver.</p>



  </article>
</section>

<footer>
  <p><a href="#home">Home</a></p>
</footer>

</body>
</html>


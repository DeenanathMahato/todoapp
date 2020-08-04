<header class="header">
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container">
			<a class="navbar-brand" href="index.jsp"> 
				<img src="<c:url value="/resources/imgs/todologo.png"></c:url>" width="30" height="30" 
					class="d-inline-block align-top" alt="logo"> Mytodo
			</a> 
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="home">Home<span
							class="sr-only">(current)</span></a></li>
					<li class="nav-item"><a class="nav-link" href="about">About</a></li>
					<li class="nav-item"><a class="nav-link" href="contact">Contact Us</a></li>
					<li class="nav-item"><a class="nav-link" href="login">Login</a></li>
					<li class="nav-item"><a class="nav-link" href="register">Sign Up</a></li>
				</ul>
				<form action="search" class="form-inline my-2 my-lg-0" target="_blank">
			      <input class="form-control mr-sm-2" name="querybox" type="search" placeholder="Search" aria-label="Search">
			      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			    </form>
			</div>
		</div>
	</nav>
</header>

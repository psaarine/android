<div id="login-container">
	<div class="main-color" id="loginmaincard">
		<div id="main-content">
			<div id="logo-container"></div>
			<label>username</label>
			<input type="text" id="username-input" name="username-input">
			<label>password</label>
			<input type="text" id="password-input" name="password-input">
		</div>
	</div>
</div>

<style>
	label {
	text-align:left;
	padding: 10px;
	border: 1px solid black;
	}
	input {

	padding:5px;
	margin-left:5px;
	}
	#logo-container {
	border: 1px solid red;
	height: 300px;
	}
	#login-container {
	display: flex;
	justify-content: center;
	width: 100%;
	height: 100%;
	}
	#loginmaincard {
		margin-top: 50px;
		border-radius:15px;
	}
	#main-content {
		border-radius:15px;
		width: 400px;
		height: 600px;
		margin: 20px;
		background-color:floralWhite;
		display: flex;
		flex-direction: column;
	}
</style>

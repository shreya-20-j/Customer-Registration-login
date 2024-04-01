<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
   <div class="main">
  <!-- Sign up form -->
   <section class="signup">
       <div class="container">
           <div class="signup-content">
               <div class="signup-form">
                   <h2 class="form-title">Sign up</h2>
                   <form action="register" method="POST" class="register-form" id="register-form">
                       <div class="form-group">
                           <label for="name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                           <input type="text" name="name"  placeholder="Your Name" required/>
                       </div>
                       <div class="form-group">
                           <label for="age"><i class="zmdi zmdi-email"></i></label>
                           <input type="number" name="age"  placeholder="Your Age" required/>
                       </div>
                       <div class="form-group">
                           <label for="email"><i class="zmdi zmdi-email"></i></label>
                           <input type="email" name="email"  placeholder="Your Email" required/>
                       </div>
                        <div class="form-group">
                           <label for="phoneno"><i class="zmdi zmdi-email"></i></label>
                           <input type="text" name="phoneno"  placeholder="Your Phone Number" required/>
                       </div>
                        <div class="form-group">
                           <label for="address"><i class="zmdi zmdi-email"></i></label>
                           <input type="text" name="address"  placeholder="Your Address" required/>
                       </div>
                       <div class="form-group">
                           <label for="pass"><i class="zmdi zmdi-lock"></i></label>
                           <input type="password" name="pass"  placeholder="Password" required/>
                       </div>
                       <div class="form-group">
                           <label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
                           <input type="password" name="re_pass"  placeholder="Repeat your password" required/>
                       </div>
                     
                       <div class="form-group form-button">
                           <input type="submit" name="signup" id="signup" class="form-submit" value="Register"/>
                       </div>
                   </form>
               </div>
               <div class="signup-image">
                   <figure><img src="image1.png" alt="sing up image"></figure>
                   <a href="#" class="signup-image-link">I am already member</a>
               </div>
           </div>
       </div>
   </section>
   </div>
   


</body>
</html>
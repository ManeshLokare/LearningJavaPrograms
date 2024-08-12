package ex_100824_Encapsulation.Ex_002;

public class VWOLogin {
       // Encapsulation -> private,data hiding (getter and setter methods)
    // getter -> only readable/ fetch the data ( Have Return Type)
    // Setter -> only modifiable / update the value (does not have return type)

        private  String username;
        private  String password;

        public VWOLogin(String username,String password)
        {
            this.username=username;
            this.password=password;
        }

        public String getUsername()
        {
            return username;
        }
        public String getPassword()
        {
            return password;
        }
        public void setUsername(String username)
        {
         this.username=username;
        }
        public void setPassword (String password)
        {
          this.password=password;
        }


}

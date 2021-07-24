package salarycalculator;


public class app {
        public static void main(String[] args) {
                User user = new User();
                User.hours();
                User.pay();
                System.out.println("total salary: " + user.salary());
        }
}
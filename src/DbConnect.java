import java.sql.*;
import java.util.Scanner;

public class DbConnect {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DbConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ECommerce_Management?" + "user=root");
            st = con.createStatement();

        } catch (ClassNotFoundException | SQLException bug) {
            System.out.println("Error: " + bug);
        }
    }

    
    
    
    public void getData_Buyer() {
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("\nBuyer Name :");
            String Buyer_Name = input.nextLine();
            
            System.out.print("\nBuyer Gender :");
            String Buyer_Gender = input.nextLine();
            
            System.out.print("\nBuyer Email:");
            String Buyer_Email = input.nextLine();
            
            System.out.print("\nBuyer Phone :");
            String Buyer_Phone = input.nextLine();
            
            System.out.print("\nBuyer Address:");
            String Buyer_Address = input.nextLine();
            
            st.executeUpdate("INSERT INTO Buyer(Buyer_Name,Buyer_Gender,Buyer_Email,Buyer_Phone,Buyer_Address) VALUES('" + Buyer_Name + "','" + Buyer_Gender + "','" + Buyer_Email + "','" + Buyer_Phone + "','" + Buyer_Address + "')");
            System.out.println("Buyer info added Succesfully!!");

        } catch (SQLException bug) {
            System.out.println("Error: " + bug);
        }
    }
    
    public void Buyer_Data() {
        try {
            String query = "SELECT * from Buyer";
            int num = 1;
            rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.print("\nBuyer Number: " + num);
                System.out.print("\nBuyer ID: " + rs.getInt("Buyer_ID"));
                System.out.print("\tBuyer Name: " + rs.getString("Buyer_Name"));
                System.out.print("\tBuyer Email: " + rs.getString("Buyer_Email"));
                System.out.print("\tBuyer Phone: " + rs.getString("Buyer_Phone"));
                System.out.print("\tBuyer Address: " + rs.getString("Buyer_Address"));
                System.out.print("\tBuyer Gender: " + rs.getString("Buyer_Gender") + "\n\n");
                num++;
            }

        } catch (SQLException bug) {
            System.out.println("Error: " + bug);
        }

    }
    

    

    public void  Admin_Data(){
        try {
            String query = "SELECT * from Admin";
            rs = st.executeQuery(query);
            while (rs.next()) {

                System.out.print("\nAdmin ID: " + rs.getInt("Admin_ID"));
                System.out.print("\tAdmin Username: " + rs.getString("Admin_Username"));
                System.out.print("\tAdmin Email: " + rs.getString("Admin_Email"));
                System.out.print("\tAdmin Password: " + rs.getString("Admin_Password"));
            }

        } catch (SQLException bug) {
            System.out.println("Error: " + bug);
        }
    }

    public void getData_Admin() {

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("\nAdmin Email: ");
            String Admin_Email = input.nextLine();
            System.out.print("\nAdmin Username: ");
            String Admin_Username = input.nextLine();
            System.out.print("\nAdmin Password: ");
            String Admin_Password = input.nextLine();
            st.executeUpdate("INSERT INTO Admin(Admin_Username,Admin_Email,Admin_Password) VALUES('" + Admin_Username + "','" + Admin_Email + "','" + Admin_Password + "')");
            System.out.println("\nAdmin added Succesfully!!\n");

        } catch (SQLException bug) {
            System.out.println("Error: " + bug);
        }
    }

    
    
    public void Product_Data() {

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("\nProduct Name: ");
            String Product_Name = input.nextLine();
            System.out.print("\nProduct price(Per Unit): ");
            int Product_Price = input.nextInt();
            input.nextLine();
            System.out.print("\nProduct Category: ");
            String Product_Category = input.nextLine();
            st.executeUpdate("INSERT INTO Product(Product_Name,Product_Price,Product_Category) VALUES('" + Product_Name + "','" + Product_Price + "','" + Product_Category + "')");
            System.out.println("Product added Succesfully!!");

        } catch (SQLException bug) {
            System.out.println("Error: " + bug);
        }
    }

    
    public void getData_Product() {
        try {
            String query = "SELECT * from Product";
            int num = 1;
            rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.print("Product Numebr: " + num);
                System.out.print("\tID: " + rs.getInt("Product_ID"));
                System.out.print("\tProduct Name: " + rs.getString("Product_Name"));
                System.out.print("\t\tProduct Price: " + rs.getInt("Product_Price"));
                System.out.print("\t\tProduct Category: " + rs.getString("Product_Category") + "\n");
                num++;
            }

        } catch (SQLException bug) {
            System.out.println("Error: " + bug);
        }
    }
    
    

    public void addToCart() {

        try {

            Scanner sc = new Scanner(System.in);
            int cart = 0;
            System.out.println("Input Product ID:");
            int ID = sc.nextInt();
            System.out.println("Input Quantity:");
            int qnt = sc.nextInt();
            String query = "SELECT * from Product";
            rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("Product_ID");
                int price = rs.getInt("Product_Price");
                if (ID == id) {
                    cart = price;
                }
            }
            int payment = cart * qnt;

            System.out.println("Total Price: " + payment);

        } catch (SQLException bug) {
            System.out.println("Error: " + bug);
        }
    }

    public void upDate() {

        try {

            Scanner sc = new Scanner(System.in);

            System.out.print("\n==== Enter prodect name for Update price ====\n");
            System.out.print("\nProduct Name: ");
            String Product_Name = sc.nextLine();
            System.out.print("\nEnter updated price: ");

            int Product_Price = sc.nextInt();
            st.executeUpdate("UPDATE Product SET Product_Price = '" + Product_Price + "'WHERE Product_Name ='" + Product_Name + "'");
            System.out.println("Update Succesful!!");

        } catch (SQLException bug) {
            System.out.println("Error: " + bug);
        }
    }

    public void delete() {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Item name :");
            String Product_Name = sc.nextLine();

            st.executeUpdate("DELETE FROM Product WHERE Product_Name ='" + Product_Name + "'");
            System.out.println("Product has been1 deleted Succesfully!!");

        } catch (SQLException bug) {
            System.out.println("Error: " + bug);
        }
    }

}

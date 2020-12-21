import java.util.Scanner;

public class ECommerceManagement {

    
    public static void main(String[] args) {
        
        System.out.println("::::::::::::: WELCOME :::::::::::");
        System.out.println(":::::::::: ali Mama.com :::::::::");
        System.out.println("::: Your Favorite Online Shop :::\n");

        OUTER:
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Login as: \n\n1.Admin(Vendor) \n2.Buyer(Customer) \n3.Exit\n");
            System.out.print("Choice: ");
            int option = input.nextInt();
            
            switch (option) {
            // break OUTER;
                case 1:
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Welcome to Admin Mode\n");
                    System.out.println("1.Add Admin");
                    System.out.println("2.Buyer Information");
                    System.out.println("3.Admin List");
                    System.out.println("4.Add Product");
                    System.out.println("5.Product List");
                    System.out.println("6.Update Product");
                    System.out.println("7.Delete Product\n");
                    System.out.print("Choice: ");
                    int option1 = input2.nextInt();
                    switch (option1) {
                        case 1:
                            DbConnect conneco = new DbConnect();
                            conneco.getData_Admin();
                            continue;
                        case 2:
                            DbConnect connec = new DbConnect();
                            connec.Buyer_Data();
                            continue;
                        case 3:
                            DbConnect connect = new DbConnect();
                            connect.Admin_Data();
                            continue;
                        case 4:
                            DbConnect connecx = new DbConnect();
                            connecx.Product_Data();
                            continue;
                        case 5:
                            DbConnect connecu = new DbConnect();
                            connecu.getData_Product();
                            continue;
                        case 6:
                            DbConnect connecte = new DbConnect();
                            connecte.upDate();
                            continue;
                        case 7:
                            DbConnect connected = new DbConnect();
                            connected.delete();
                            continue;
                            
                        default:
                            System.out.println("You have choosen wrong option.");
                            break;
                    }   System.out.println("\n....DonE....\n");
                    break OUTER;
                case 2:
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("\n1.Insert Info \n2.Product List");
                    int option2 = input3.nextInt();
                    switch (option2) {
                        case 1:
                            DbConnect connect2 = new DbConnect();
                            connect2.getData_Buyer();
                            continue;
                        case 2:
                            DbConnect connect = new DbConnect();
                            System.out.println("Tell Us Which Product You Want To Buy!!");
                            connect.getData_Product();
                            connect.addToCart();
                            continue;
                            
                        default:
                            System.out.println("You have choosen wrong option.");
                            break;
                    }
                    //break OUTER;
                    System.out.println("\n....Thank You...\n");
                    break OUTER;
                case 3:
                    System.out.println("\n....Thank You...\n");
                    break OUTER;
                default:
                    break;
            }
        }

    }


        
    }
   

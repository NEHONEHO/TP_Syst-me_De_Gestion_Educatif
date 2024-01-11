package methodesSGE;

import java.sql.*;

import java.util.Scanner; 

import classSGE.Departement;

public class DepartementServices {
	
	public static void showMenuDept() {
		System.out.println("          BIENVENUE SUR ESPACE DEPARTEMENT                ");
    	System.out.println("");
    	System.out.println("     Veuillez choisir une des option suivantes:");
    	System.out.println("");
    	System.out.println("         1. Ajouter un departement");
    	System.out.println("         2. Modifier un departement");
    	System.out.println("         3. Supprimer un departement");
    	System.out.println("         4. Afficher touts les departement");
    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int options = scan.nextInt();
    		switch(options) {
        	case 1:
        		ShowDept();
        		AddDept();
        		ShowDept();
        	break;
        	
        	case 2:
        		ShowDept();
        		UpdateDept();
        		ShowDept();
        	break;
        	
        	case 3:
        		ShowDept();
        		DeleteDept();
        		ShowDept();
        	break;
        	
        	case 4:
        		ShowDept();
        	break;
        	}
	}
	
	public static Departement AddDept(){
        Departement departement = new Departement();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("entrer l'id du departement ");
        int idDep = scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("entrer le titre du departement");
        String intituleDep = scan.nextLine();
        
        System.out.println("entrer le responsable du departement");
        String responsableDep = scan.nextLine();
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
            String sql = "INSERT INTO departements (idDep, intituleDep, responsableDep) VALUES (?, ?, ?)";
            PreparedStatement pstmt = myConn.prepareStatement(sql);
            pstmt.setInt(1, idDep);
            pstmt.setString(2, intituleDep);
            pstmt.setString(3, responsableDep);
            pstmt.executeUpdate();
            pstmt.close();
            myConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Le departement est bien ajouter");
        return(departement);
    }
	
	

    public static Departement UpdateDept(){
    	
        Departement departement = new Departement();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("entrer l'id du departement que vous souhaitez modifier");
        int idDep = scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("entrer le nouveau titre du departement");
        String intituleDep = scan.nextLine();
        
        System.out.println("entrer le nouveau responsable du departement");
        String responsableDep = scan.nextLine();
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
            String sql = "update departements set intituleDep = ?, responsableDep = ? where idDep = ?";
            PreparedStatement pstmt = myConn.prepareStatement(sql);
            pstmt.setString(1, intituleDep);
            pstmt.setString(2, responsableDep);
            pstmt.setInt(3, idDep);
            pstmt.executeUpdate();
            pstmt.close();
            myConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Le departement est bien mis à jour");
        
        return(departement);
    }
    
    public static Departement DeleteDept() {
    	
        Departement departement = new Departement();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("entrer l'id du departement que vous souhaitez supprimer");
        int idDep = scan.nextInt();
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
            String sql = "delete from departements where idDep=?";
            PreparedStatement pstmt = myConn.prepareStatement(sql);
            pstmt.setInt(1, idDep);
            pstmt.executeUpdate();
            pstmt.close();
            myConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Le departement est bien supprimer");
        
        return(departement);
    }
    
    public static void ShowDept() {
    	System.out.println("");
    	System.out.println("              Voici la table departement              ");
    	
    	try {
    		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
    		
            Statement myStmt = myConn.createStatement();
			
			ResultSet myRs = myStmt.executeQuery("select * from departements");
			
			while(myRs.next()) {
				System.out.println(myRs.getInt("idDep")+" , "+myRs.getString("intituleDep")+" , "+myRs.getString("responsableDep"));
				System.out.println("");
			}
    	}
    	catch (Exception e){
    		e.printStackTrace();
    	}
    }
}

package methodesSGE;

import java.util.Scanner;

import classSGE.Filiere;

import java.sql.*;

public class FiliereServices {
	
	public static void showMenuFil() {
		System.out.println("          BIENVENUE SUR ESPACE FILIERE                ");
    	System.out.println("");
    	System.out.println("     Veuillez choisir une des option suivantes:");
    	System.out.println("");
    	System.out.println("         1. Ajouter un filière");
    	System.out.println("         2. Modifier un filière");
    	System.out.println("         3. Supprimer un filière");
    	System.out.println("         4. Afficher touts les filières");
    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int options = scan.nextInt();
    	
    	switch(options) {
    	case 1:
    		AddFil();
    		ShowFil();
    	break;
    	
    	case 2:
    		ShowFil();
    		UpdateFil();
    		ShowFil();
    	break;
    	
    	case 3:
    		ShowFil();
    		DeleteFil();
    		ShowFil();
    	break;
    	
    	case 4:
    		ShowFil();
    	break;
    	}
	}
	
	public static Filiere AddFil(){
		Filiere filiere = new Filiere();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("entrer l'id du Filière ");
        int idFil = scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("entrer le titre du filière");
        String intituleFil = scan.nextLine();
        
        System.out.println("entrer l'id du responsable du filière");
        int idResponsableFil = scan.nextInt();
        
        System.out.println("entrer l'id du departement du filière");
        int idDepartementFil = scan.nextInt();
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
            String sql = "INSERT INTO filieres (idFil, intituleFil, idResponsableFil,idDepartementFil) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = myConn.prepareStatement(sql);
            pstmt.setInt(1, idFil);
            pstmt.setString(2, intituleFil);
            pstmt.setInt(3, idResponsableFil);
            pstmt.setInt(4, idDepartementFil);
            pstmt.executeUpdate();
            pstmt.close();
            myConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("La filière est bien ajouter");
        return(filiere);
    }
	
	

    public static Filiere UpdateFil(){
    	
    	Filiere filiere = new Filiere();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("entrer l'id du filière que vous souhaitez modifier");
        int idFil = scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("entrer le titre du filière");
        String intituleFil = scan.nextLine();
        
        System.out.println("entrer l'id du responsable du filière");
        int idResponsableFil = scan.nextInt();
        
        System.out.println("entrer l'id du departement du filière");
        int idDepartementFil = scan.nextInt();
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
            String sql = "update filieres set intituleFil = ?, idResponsableFil = ?, idDepartementFil = ? where idFil = ?";
            PreparedStatement pstmt = myConn.prepareStatement(sql);
            pstmt.setString(1, intituleFil);
            pstmt.setInt(2, idResponsableFil);
            pstmt.setInt(3, idDepartementFil);
            pstmt.setInt(4, idFil);
            pstmt.executeUpdate();
            pstmt.close();
            myConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("La filière est bien mis à jour");
        
        return(filiere);
    }
    
    public static Filiere DeleteFil() {
    	
    	Filiere filiere = new Filiere();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("entrer l'id du filière que vous souhaitez supprimer");
        int idFil = scan.nextInt();
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
            String sql = "delete from filieres where idFil=?)";
            PreparedStatement pstmt = myConn.prepareStatement(sql);
            pstmt.setInt(1, idFil);
            pstmt.executeUpdate(); 
            pstmt.close();
            myConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("La filière est bien supprimer");
        
        return(filiere);
    }
    
    public static void ShowFil() {
    	System.out.println("              Voici la table filière              ");
    	try {
    		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
    		
            Statement myStmt = myConn.createStatement();
			
			ResultSet myRs = myStmt.executeQuery("select * from filieres");
			
			while(myRs.next()) {
				System.out.println(myRs.getInt("idFil")+" , "+myRs.getString("intituleFil")+" , "+myRs.getInt("idResponsableFil")+" , "+myRs.getString("idDepartementFil"));
			}
    	}
    	catch (Exception e){
    		e.printStackTrace();
    	}
    }
}

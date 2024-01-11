package methodesSGE;

import classSGE.Enseignant;

import java.sql.*;

import java.util.Scanner;

public class EnseignantServices {
	
	public static void showMenuEns() {
		System.out.println("          BIENVENUE SUR ESPACE ENSEIGNANT                ");
    	System.out.println("");
    	System.out.println("     Veuillez choisir une des option suivantes:");
    	System.out.println("");
    	System.out.println("         1. Ajouter un enseignant");
    	System.out.println("         2. Modifier un enseignant");
    	System.out.println("         3. Supprimer un enseignant");
    	System.out.println("         4. Afficher tout les enseignant");
    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int options = scan.nextInt();
    	
    	switch(options) {
    	case 1:
    		AddEns();
    	break;
    	
    	case 2:
    		UpdateEns();
    	break;
    	
    	case 3:
    		DeleteEns();
    	break;
    	
    	case 4:
    		ShowEns();
    	break;
    	}
	}


	public static Enseignant AddEns(){
		Enseignant enseignant = new Enseignant();
	    
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("entrer l'id d'enseignant");
	    int idEns = scan.nextInt();
	    
	    scan.nextLine();
	    
	    System.out.println("entrer le nom d'enseignant");
	    String nomEns = scan.nextLine();
	    
	    System.out.println("entrer le prènom d'enseignant");
	    String prenomEns = scan.nextLine();
	    
	    System.out.println("entrer l'e-mail d'enseignant");
	    String emailEns = scan.nextLine();
	    
	    System.out.println("entrer le grade d'enseignant");
	    String gradeEns = scan.nextLine();
	    
	    System.out.println("entrer l'id du departement d'enseignant");
	    int idDep = scan.nextInt();
	    
	    try {
	        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
	        String sql = "INSERT INTO enseignants (idEns, nomEns, prenomEns, emailEns, gradeEns, idDep) VALUES (?, ?, ?, ?, ?, ?)";
	        PreparedStatement pstmt = myConn.prepareStatement(sql);
	        pstmt.setInt(1, idEns);
	        pstmt.setString(2, nomEns);
	        pstmt.setString(3, prenomEns);
	        pstmt.setString(4, emailEns);
	        pstmt.setString(5, gradeEns);
	        pstmt.setInt(6, idDep);
	        pstmt.executeUpdate();
	        pstmt.close();
	        myConn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    System.out.println("L'enseignant est bien ajouter");
	    return(enseignant);
	}
	
	
	
	public static Enseignant UpdateEns(){
		
		Enseignant enseignant = new Enseignant();
	    
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("entrer l'id d'enseignant que vous souhaitez modifier");
	    int idEns = scan.nextInt();
	    
	    scan.nextLine();
	    
	    System.out.println("entrer le nom d'enseignant");
	    String nomEns = scan.nextLine();
	    
	    System.out.println("entrer le prènom d'enseignant");
	    String prenomEns = scan.nextLine();
	    
	    System.out.println("entrer l'e-mail d'enseignant");
	    String emailEns = scan.nextLine();
	    
	    System.out.println("entrer le grade d'enseignant");
	    String gradeEns = scan.nextLine();
	    
	    System.out.println("entrer l'id du departement d'enseignant");
	    int idDep = scan.nextInt();
	    
	    try {
	        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
	        String sql = "update enseignants set idEns = ? ,nomEns = ? ,prenomEns = ? ,emailEns = ? ,gradeEns = ? ,idDep = ?";
	        PreparedStatement pstmt = myConn.prepareStatement(sql);
	        pstmt.setInt(1, idEns);
	        pstmt.setString(2, nomEns);
	        pstmt.setString(3, prenomEns);
	        pstmt.setString(4, emailEns);
	        pstmt.setString(5, gradeEns);
	        pstmt.setInt(6, idDep);
	        pstmt.executeUpdate();
	        pstmt.close();
	        myConn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    System.out.println("L'enseignant est bien mis à jour");
	    return(enseignant);
	}
	
	public static Enseignant DeleteEns() {
		
		Enseignant enseignant = new Enseignant();
	    
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("entrer l'id d'enseignant que vous souhaitez supprimer");
	    int idEns = scan.nextInt();
	    
	    try {
	        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
	        String sql = "delete from enseignants where idEns=?)";
	        PreparedStatement pstmt = myConn.prepareStatement(sql);
	        pstmt.setInt(1, idEns);
	        pstmt.executeUpdate();
	        pstmt.close();
	        myConn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    System.out.println("L'enseignant est bien supprimer");
	    
	    return(enseignant);
	}
	
	public static void ShowEns() {
		System.out.println("              Voici la table enseignant              ");
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
			
	        Statement myStmt = myConn.createStatement();
			
			ResultSet myRs = myStmt.executeQuery("select * from enseignants");
			
			while(myRs.next()) {
				System.out.println(myRs.getInt("idEns")+" , "+myRs.getString("nomEns")+" , "+myRs.getString("prenomEns")+
						           " , "+myRs.getString("emailEns")+" , "+myRs.getString("gradeEns")+" , "+myRs.getInt("idEns"));
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}

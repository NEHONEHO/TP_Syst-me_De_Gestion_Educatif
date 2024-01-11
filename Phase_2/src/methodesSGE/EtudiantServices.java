package methodesSGE;

import classSGE.Etudiant;

import java.sql.*;

import java.util.Scanner;

public class EtudiantServices {
	
	public static void showMenuEtud() {
		System.out.println("          BIENVENUE SUR ESPACE ETUDIANT                ");
    	System.out.println("");
    	System.out.println("     Veuillez choisir une des option suivantes:");
    	System.out.println("");
    	System.out.println("         1. Ajouter un étudiant");
    	System.out.println("         2. Modifier un étudiant");
    	System.out.println("         3. Supprimer un étudiant");
    	System.out.println("         4. Afficher tout les étudiants");
    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int options = scan.nextInt();
    	
    	switch(options) {
    	case 1:
    		AddEtud();
    	break;
    	
    	case 2:
    		UpdateEtud();
    	break;
    	
    	case 3:
    		DeleteEtud();
    	break;
    	
    	case 4:
    		ShowEtud();
    	break;
    	}
	}
	
	public static Etudiant AddEtud(){
		Etudiant etudiant = new Etudiant();
	    
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("entrer l'id d'étudiant");
	    int idEtu = scan.nextInt();
	    
	    System.out.println("entrer le numéro apogée d'étudiant");
	    int apogee = scan.nextInt();
	    
	    scan.nextLine();
	    
	    System.out.println("entrer le nom d'étudiant");
	    String nomEtud = scan.nextLine();
	    
	    System.out.println("entrer le prènom d'étudiant");
	    String prenomEtud = scan.nextLine();
	    
	    System.out.println("entrer l'e-mail d'étudiant");
	    String emailEtud = scan.nextLine();
	    
	    System.out.println("entrer l'id du filière d'étudiant");
	    int idFiliere = scan.nextInt();
	    
	    try {
	        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
	        String sql = "INSERT INTO etudiants (idEtu, apogee, nomEtud, prenomEtud, emailEtud, idFiliere) VALUES (?, ?, ?, ?, ?, ?)";
	        PreparedStatement pstmt = myConn.prepareStatement(sql);
	        pstmt.setInt(1, idEtu);
	        pstmt.setInt(2, apogee);
	        pstmt.setString(3, nomEtud);
	        pstmt.setString(4, prenomEtud);
	        pstmt.setString(5, emailEtud);
	        pstmt.setInt(6, idFiliere);
	        pstmt.executeUpdate();
	        pstmt.close();
	        myConn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    System.out.println("L'étudiant est bien ajouter");
	    return(etudiant);
	}
	
	
	
	public static Etudiant UpdateEtud(){
		
		Etudiant etudiant = new Etudiant();
	    
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("entrer l'id d'étudiant que vous souhaitez modifier");
	    int idEtu = scan.nextInt();
	    
	    System.out.println("entrer le numéro apogée d'étudiant");
	    int apogee = scan.nextInt();
	    
	    scan.nextLine();
	    
	    System.out.println("entrer le nom d'étudiant");
	    String nomEtud = scan.nextLine();
	    
	    System.out.println("entrer le prènom d'étudiant");
	    String prenomEtud = scan.nextLine();
	    
	    System.out.println("entrer l'e-mail d'étudiant");
	    String emailEtud = scan.nextLine();
	    
	    System.out.println("entrer la filière d'étudiant");
	    int idFiliere = scan.nextInt();
	    
	    try {
	        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
	        String sql = "update etudiants set idEtu = ? ,apogee = ? ,nomEtud = ? ,prenomEtud = ? ,emailEtud = ? ,idFiliere = ?";
	        PreparedStatement pstmt = myConn.prepareStatement(sql);
	        pstmt.setInt(1, idEtu);
	        pstmt.setInt(2, apogee);
	        pstmt.setString(3, nomEtud);
	        pstmt.setString(4, prenomEtud);
	        pstmt.setString(5, emailEtud);
	        pstmt.setInt(6, idFiliere);
	        pstmt.executeUpdate();
	        pstmt.close();
	        myConn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    System.out.println("L'enseignant est bien mis à jour");
	    return(etudiant);
	}
	
	public static Etudiant DeleteEtud() {
		
		Etudiant etudiant = new Etudiant();
	    
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("entrer l'id d'étudiant que vous souhaitez supprimer");
	    int idEtu = scan.nextInt();
	    
	    try {
	        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
	        String sql = "delete from etudiants where idEtu=?)";
	        PreparedStatement pstmt = myConn.prepareStatement(sql);
	        pstmt.setInt(1, idEtu);
	        pstmt.executeUpdate();
	        pstmt.close();
	        myConn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    System.out.println("L'enseignant est bien supprimer");
	    
	    return(etudiant);
	}
	
	public static void ShowEtud() {
		System.out.println("              Voici la table étudiant              ");
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
			
	        Statement myStmt = myConn.createStatement();
			
			ResultSet myRs = myStmt.executeQuery("select * from etudiants");
			
			while(myRs.next()) {
				System.out.println(myRs.getInt("idEtu")+" , "+myRs.getInt("apogee")+" , "+myRs.getString("nomEtud")+
						           " , "+myRs.getString("prenomEtud")+" , "+myRs.getString("emailEtud")+" , "+myRs.getString("filiere"));
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
}

package methodesSGE;

import java.sql.*;

import java.util.Scanner;

import classSGE.Note;

public class NoteServices {
	public static void showMenuNote() {
		System.out.println("          BIENVENUE SUR ESPACE NOTE                ");
    	System.out.println("");
    	System.out.println("     Veuillez choisir une des option suivantes:");
    	System.out.println("");
    	System.out.println("         1. Ajouter une note");
    	System.out.println("         2. Modifier une note");
    	System.out.println("         3. Supprimer une note");
    	System.out.println("         4. Afficher touts les notes");
    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int options = scan.nextInt();
    	
    	switch(options) {
    	case 1:
    		AddNote();
    		ShowNote();
    	break;
    	
    	case 2:
    		ShowNote();
    		UpdateNote();
    		ShowNote();
    	break;
    	
    	case 3:
    		ShowNote();
    		DeleteNote();
    		ShowNote();
    	break;
    	
    	case 4:
    		ShowNote();
    	break;
    	}
	}
	
	public static Note AddNote(){
		Note notes = new Note();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("entrer l'id d'etudiant");
        int idEtudiant = scan.nextInt();
        
        System.out.println("entrer l'id du module");
        int idModule = scan.nextInt();
        
        System.out.println("entrer la note");
        int note = scan.nextInt();
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
            String sql = "INSERT INTO notes (idEtudiant, idModule, note) VALUES (?, ?, ?)";
            PreparedStatement pstmt = myConn.prepareStatement(sql);
            pstmt.setInt(1, idEtudiant);
            pstmt.setInt(2, idModule);
            pstmt.setInt(3, note);
            pstmt.executeUpdate();
            pstmt.close();
            myConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("La note est bien ajouter");
        return(notes);
    }
	
	

    public static Note UpdateNote(){
    	
    	Note notes = new Note();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("entrer l'id d'étudiant");
        int idEtudiant = scan.nextInt();
        
        System.out.println("entrer l'id du module");
        int idModule = scan.nextInt();
        
        System.out.println("entrer la nouvelle note");
        int note = scan.nextInt();
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
            String sql = "update notes set note = ? where idEtudiant = ? and idModule = ?";
            PreparedStatement pstmt = myConn.prepareStatement(sql);
            pstmt.setInt(1, note);
            pstmt.setInt(2, idEtudiant);
            pstmt.setInt(3, idModule);
            pstmt.executeUpdate();
            pstmt.close();
            myConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Le note est bien mis à jour");
        
        return(notes);
    }
    
    public static Note DeleteNote() {
    	
    	Note departement = new Note();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("entrer l'id d'étudiant ");
        int idEtudiant = scan.nextInt();
        
        System.out.println("entrer l'id du module");
        int idModule = scan.nextInt();
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
            String sql = "delete from notes where idEtudiant=? and idModule=?)";
            PreparedStatement pstmt = myConn.prepareStatement(sql);
            pstmt.setInt(1, idEtudiant);
            pstmt.setInt(2, idModule);
            pstmt.executeUpdate();
            pstmt.close();
            myConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("la note est bien supprimer");
        
        return(departement);
    }
    
    public static void ShowNote() {
    	System.out.println("              Voici la table note              ");
    	try {
    		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
    		
            Statement myStmt = myConn.createStatement();
			
			ResultSet myRs = myStmt.executeQuery("select * from notes");
			
			while(myRs.next()) {
				System.out.println(myRs.getInt("idEtudiant")+" , "+myRs.getInt("idModule")+" , "+myRs.getInt("note"));
			}
    	}
    	catch (Exception e){
    		e.printStackTrace();
    	}
    }
}

package methodesSGE;

import java.util.Scanner;

import java.sql.*;

import classSGE.Module;

public class ModuleServices {
	public static void showMenuModule() {
		System.out.println("          BIENVENUE SUR ESPACE MODULE               ");
    	System.out.println("");
    	System.out.println("     Veuillez choisir une des option suivantes:");
    	System.out.println("");
    	System.out.println("         1. Ajouter un module");
    	System.out.println("         2. Modifier un module");
    	System.out.println("         3. Supprimer un module");
    	System.out.println("         4. Afficher touts les modules");
    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int options = scan.nextInt();
    	
    	switch(options) {
    	case 1:
    		AddMod();
    		ShowMod();
    	break;
    	
    	case 2:
    		ShowMod();
    		UpdateMod();
    		ShowMod();
    	break;
    	
    	case 3:
    		ShowMod();
    		DeleteMod();
    		ShowMod();
    	break;
    	
    	case 4:
    		ShowMod();
    	break;
    	}
	}
	
	public static Module AddMod(){
		Module module = new Module();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("entrer l'id de module ");
        int idMod = scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("entrer le titre de module");
        String intituleMod = scan.nextLine();
        
        System.out.println("entrer l'id du filière laquel appartient ce module");
        int idFiliereMod = scan.nextInt();
        
        System.out.println("entrer l'id du proffesseur qui enseigne ce module");
        int idprofesseurMod = scan.nextInt();
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
            String sql = "INSERT INTO modules (idMod, intituleMod, idFiliereMod,idprofesseurMod) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = myConn.prepareStatement(sql);
            pstmt.setInt(1, idMod);
            pstmt.setString(2, intituleMod);
            pstmt.setInt(3, idFiliereMod);
            pstmt.setInt(4, idprofesseurMod);
            pstmt.executeUpdate();
            pstmt.close();
            myConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Le module est bien ajouter");
        return(module);
    }
	
	

    public static Module UpdateMod(){
    	
    	Module module = new Module();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("entrer l'id de module que vous souhaitez modifier");
        int idMod = scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("entrer le titre de module");
        String intituleMod = scan.nextLine();
        
        System.out.println("entrer l'id du filière laquel appartient ce module");
        int idFiliereMod = scan.nextInt();
        
        System.out.println("entrer l'id du proffesseur qui enseigne ce module");
        int idprofesseurMod = scan.nextInt();
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
            String sql = "update modules set intituleMod = ?, idFiliereMod = ?, idprofesseurMod = ? where idMod = ?";
            PreparedStatement pstmt = myConn.prepareStatement(sql);
            pstmt.setString(1, intituleMod);
            pstmt.setInt(3, idFiliereMod);
            pstmt.setInt(4, idprofesseurMod);
            pstmt.setInt(4, idMod);
            pstmt.executeUpdate();
            pstmt.close();
            myConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Le module est bien mis à jour");
        
        return(module);
    }
    
    public static Module DeleteMod() {
    	
    	Module module = new Module();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("entrer l'id du module que vous souhaitez supprimer");
        int idMod = scan.nextInt();
        
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
            String sql = "delete from modules where idMod=?)";
            PreparedStatement pstmt = myConn.prepareStatement(sql);
            pstmt.setInt(1, idMod);
            pstmt.executeUpdate();
            pstmt.close();
            myConn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Le module est bien supprimer");
        
        return(module);
    }
    
    public static void ShowMod() {
    	System.out.println("              Voici la table Module              ");
    	try {
    		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sge","root","");
    		
            Statement myStmt = myConn.createStatement();
			
			ResultSet myRs = myStmt.executeQuery("select * from modules");
			
			while(myRs.next()) {
				System.out.println(myRs.getInt("idMod")+" , "+myRs.getString("intituleMod")+" , "+myRs.getInt("idFiliereMod")+" , "+myRs.getInt("idprofesseurMod"));
			}
    	}
    	catch (Exception e){
    		e.printStackTrace();
    	}
    }
}

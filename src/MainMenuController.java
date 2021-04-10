/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import javafx.fxml.FXML;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;


public class MainMenuController implements Initializable {

    @FXML
    private Pane mainPanel;
    
    @FXML
    private Label actLabel;
    @FXML
    private Button dashboardBtn;
    @FXML
    private Button studentInfoBtn;
    @FXML
    private Button studentsBtn;
    @FXML
    private Button enrollmentBtn;
    @FXML
    private Button adminSettingsBtn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dashboardBtn.getStyleClass().add("buttonSidebarActive");
        try
        {
            loadDashboard();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
    }
    public void loadDashboard() throws Exception
    {
        Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("DashboardPage.fxml"));
        mainPanel.getChildren().setAll(newLoadedPane);
        
        dashboardBtn.getStyleClass().add("buttonSidebarActive");
        
        studentsBtn.getStyleClass().remove("buttonSidebarActive");
        studentInfoBtn.getStyleClass().remove("buttonSidebarActive");
    }
    
    public void loadStudentInfoViwer()throws Exception
    {
        Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("StudentInfoViewer.fxml"));
        mainPanel.getChildren().setAll(newLoadedPane);
        
        studentInfoBtn.getStyleClass().add("buttonSidebarActive");
        
        studentsBtn.getStyleClass().remove("buttonSidebarActive");
        dashboardBtn.getStyleClass().remove("buttonSidebarActive");
    }
    
    public void loadStudents()throws Exception
    {
        Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("Students.fxml"));
        mainPanel.getChildren().setAll(newLoadedPane);
        
        studentsBtn.getStyleClass().add("buttonSidebarActive");
        
        studentInfoBtn.getStyleClass().remove("buttonSidebarActive");
        dashboardBtn.getStyleClass().remove("buttonSidebarActive");
    }
    
    public void loadAdminSettings()
    {
        //actLabel.setText("Admin Settings");
    }
    
    public void loadEnrollment()
    {
        //actLabel.setText("Enrollment");
    }
}

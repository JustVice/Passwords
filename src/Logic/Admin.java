package Logic;

import UI.*;

public class Admin {
    
    public void openCreate() {
        CreateNewP c = new CreateNewP();
        c.setVisible(true);
    }
    
    public void openSeeP() {
        SeePasswords c = new SeePasswords();
        c.setVisible(true);
    }
    
    public void openStart() {
        Start c = new Start();
        c.setVisible(true);
    }
    
    public void openDelete() {
        Delete c = new Delete();
        c.setVisible(true);
    }
    
    public void openEdit() {
        EditPassword c = new EditPassword();
        c.setVisible(true);
    }
    
    public void StartProgram() {
        StaticOld.LoadData();
        StaticOld.setModelsItems();
        StaticOld.admin.openStart();
    }
    
    public void openPrintPasswords() {
        PrintPasswords pp = new PrintPasswords();
        pp.setVisible(true);
    }
    
}
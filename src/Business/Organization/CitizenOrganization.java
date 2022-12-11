/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Citizen.CitizenDirectory;
import Business.Role.Role;
import Business.Role.CitizenRole;
import java.util.ArrayList;

/**
 *
 * @author Pranav
 */
public class CitizenOrganization extends Organization{
    
    public CitizenOrganization() {
        super(Organization.Type.Citizen.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CitizenRole());
        return roles;
    }
    
}

package org.bpm.model;
// Generated May 13, 2023, 9:40:18 AM by Hibernate Tools 5.4.30.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UserRoles generated by hbm2java
 */
@Entity
@Table(name="user_roles"
    ,schema="public"
)
public class UserRoles  implements java.io.Serializable {


     private UserRolesId id;
     private ApplicationUser applicationUser;

    public UserRoles() {
    }

    public UserRoles(UserRolesId id, ApplicationUser applicationUser) {
       this.id = id;
       this.applicationUser = applicationUser;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="userId", column=@Column(name="user_id", nullable=false) ), 
        @AttributeOverride(name="roles", column=@Column(name="roles") ) } )
    public UserRolesId getId() {
        return this.id;
    }
    
    public void setId(UserRolesId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false, insertable=false, updatable=false)
    public ApplicationUser getApplicationUser() {
        return this.applicationUser;
    }
    
    public void setApplicationUser(ApplicationUser applicationUser) {
        this.applicationUser = applicationUser;
    }




}



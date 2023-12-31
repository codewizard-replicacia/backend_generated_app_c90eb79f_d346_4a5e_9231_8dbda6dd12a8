package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.BuildTool;
import com.mycompany.group234.model.UIComp;
import com.mycompany.group234.model.Document;
import com.mycompany.group234.model.FrontendApp;
import com.mycompany.group234.model.Architecture;
import com.mycompany.group234.model.Server;
import com.mycompany.group234.model.PackageManagement;
import com.mycompany.group234.model.FrontendScreen;
import com.mycompany.group234.model.UIField;
import com.mycompany.group234.model.complex.BasicDetails;
import com.mycompany.group234.model.complex.AdvancedDetails;

@Entity(name = "FrontendAppMetaTags")
@Table(schema = "\"generated_app\"", name = "\"FrontendAppMetaTags\"")
@Data
public class FrontendAppMetaTags{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"AppId\"")
	private Long appId;

    
    @Column(name = "\"MetaTags\"")
    private Long metaTags;
}
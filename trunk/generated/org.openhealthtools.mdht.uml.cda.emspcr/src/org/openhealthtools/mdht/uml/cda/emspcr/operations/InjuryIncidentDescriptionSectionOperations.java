/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus;
import org.openhealthtools.mdht.uml.cda.emspcr.DisasterType;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle;
import org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria;
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea;
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Injury Incident Description Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionInjuryCauseCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Injury Cause Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionInjuryMechanism(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Injury Mechanism</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionTraumaCenterCriteria(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Trauma Center Criteria</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionInjuryRiskFactor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Injury Risk Factor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionVehicleImpactArea(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Vehicle Impact Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionPatientLocationInVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Patient Location In Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Vehicle Occupant Safety Equipment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionAirbagDeploymentStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Airbag Deployment Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionHeightOfFall(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Height Of Fall</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionDisasterType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Disaster Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getInjuryCauseCategory() <em>Get Injury Cause Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getInjuryMechanism() <em>Get Injury Mechanism</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getTraumaCenterCriteria() <em>Get Trauma Center Criteria</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getInjuryRiskFactor() <em>Get Injury Risk Factor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getVehicleImpactArea() <em>Get Vehicle Impact Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getPatientLocationInVehicle() <em>Get Patient Location In Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getVehicleOccupantSafetyEquipment() <em>Get Vehicle Occupant Safety Equipment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getAirbagDeploymentStatus() <em>Get Airbag Deployment Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getHeightOfFall() <em>Get Height Of Fall</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getDisasterType() <em>Get Disaster Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InjuryIncidentDescriptionSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InjuryIncidentDescriptionSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryIncidentDescriptionSectionTemplateId(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionTemplateId(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.17')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryIncidentDescriptionSectionTemplateId(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionTemplateId(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryIncidentDescriptionSection The receiving '<em><b>Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryIncidentDescriptionSectionTemplateId(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_INCIDENT_DESCRIPTION_SECTION__INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("InjuryIncidentDescriptionSectionTemplateId"),
						 new Object [] { injuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryIncidentDescriptionSectionCode(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionCode(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '11374-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryIncidentDescriptionSectionCode(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionCode(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryIncidentDescriptionSection The receiving '<em><b>Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryIncidentDescriptionSectionCode(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_INCIDENT_DESCRIPTION_SECTION__INJURY_INCIDENT_DESCRIPTION_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("InjuryIncidentDescriptionSectionCode"),
						 new Object [] { injuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryIncidentDescriptionSectionTitle(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionTitle(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Injury Incident Description Section')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryIncidentDescriptionSectionTitle(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionTitle(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryIncidentDescriptionSection The receiving '<em><b>Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryIncidentDescriptionSectionTitle(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_INCIDENT_DESCRIPTION_SECTION__INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("InjuryIncidentDescriptionSectionTitle"),
						 new Object [] { injuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryIncidentDescriptionSectionText(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionText(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryIncidentDescriptionSectionText(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionText(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryIncidentDescriptionSection The receiving '<em><b>Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryIncidentDescriptionSectionText(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_INCIDENT_DESCRIPTION_SECTION__INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("InjuryIncidentDescriptionSectionText"),
						 new Object [] { injuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryIncidentDescriptionSectionInjuryCauseCategory(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Injury Cause Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionInjuryCauseCategory(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::InjuryCauseCategory) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryIncidentDescriptionSectionInjuryCauseCategory(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Injury Cause Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionInjuryCauseCategory(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryIncidentDescriptionSection The receiving '<em><b>Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryIncidentDescriptionSectionInjuryCauseCategory(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_INCIDENT_DESCRIPTION_SECTION__INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY,
						 EmspcrPlugin.INSTANCE.getString("InjuryIncidentDescriptionSectionInjuryCauseCategory"),
						 new Object [] { injuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryIncidentDescriptionSectionInjuryMechanism(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Injury Mechanism</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionInjuryMechanism(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::InjuryMechanism) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryIncidentDescriptionSectionInjuryMechanism(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Injury Mechanism</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionInjuryMechanism(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryIncidentDescriptionSection The receiving '<em><b>Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryIncidentDescriptionSectionInjuryMechanism(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_INCIDENT_DESCRIPTION_SECTION__INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM,
						 EmspcrPlugin.INSTANCE.getString("InjuryIncidentDescriptionSectionInjuryMechanism"),
						 new Object [] { injuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryIncidentDescriptionSectionTraumaCenterCriteria(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Trauma Center Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionTraumaCenterCriteria(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::TraumaCenterCriteria) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryIncidentDescriptionSectionTraumaCenterCriteria(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Trauma Center Criteria</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionTraumaCenterCriteria(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryIncidentDescriptionSection The receiving '<em><b>Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryIncidentDescriptionSectionTraumaCenterCriteria(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_INCIDENT_DESCRIPTION_SECTION__INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA,
						 EmspcrPlugin.INSTANCE.getString("InjuryIncidentDescriptionSectionTraumaCenterCriteria"),
						 new Object [] { injuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryIncidentDescriptionSectionInjuryRiskFactor(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Injury Risk Factor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionInjuryRiskFactor(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::InjuryRiskFactor) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryIncidentDescriptionSectionInjuryRiskFactor(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Injury Risk Factor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionInjuryRiskFactor(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryIncidentDescriptionSection The receiving '<em><b>Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryIncidentDescriptionSectionInjuryRiskFactor(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_INCIDENT_DESCRIPTION_SECTION__INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR,
						 EmspcrPlugin.INSTANCE.getString("InjuryIncidentDescriptionSectionInjuryRiskFactor"),
						 new Object [] { injuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryIncidentDescriptionSectionVehicleImpactArea(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Vehicle Impact Area</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionVehicleImpactArea(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::VehicleImpactArea) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryIncidentDescriptionSectionVehicleImpactArea(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Vehicle Impact Area</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionVehicleImpactArea(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryIncidentDescriptionSection The receiving '<em><b>Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryIncidentDescriptionSectionVehicleImpactArea(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_INCIDENT_DESCRIPTION_SECTION__INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA,
						 EmspcrPlugin.INSTANCE.getString("InjuryIncidentDescriptionSectionVehicleImpactArea"),
						 new Object [] { injuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryIncidentDescriptionSectionPatientLocationInVehicle(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Patient Location In Vehicle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionPatientLocationInVehicle(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientLocationInVehicle) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryIncidentDescriptionSectionPatientLocationInVehicle(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Patient Location In Vehicle</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionPatientLocationInVehicle(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryIncidentDescriptionSection The receiving '<em><b>Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryIncidentDescriptionSectionPatientLocationInVehicle(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_INCIDENT_DESCRIPTION_SECTION__INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE,
						 EmspcrPlugin.INSTANCE.getString("InjuryIncidentDescriptionSectionPatientLocationInVehicle"),
						 new Object [] { injuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Vehicle Occupant Safety Equipment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::VehicleOccupantSafetyEquipment) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Vehicle Occupant Safety Equipment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryIncidentDescriptionSection The receiving '<em><b>Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_INCIDENT_DESCRIPTION_SECTION__INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT,
						 EmspcrPlugin.INSTANCE.getString("InjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment"),
						 new Object [] { injuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryIncidentDescriptionSectionAirbagDeploymentStatus(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Airbag Deployment Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionAirbagDeploymentStatus(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::AirbagDeploymentStatus) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryIncidentDescriptionSectionAirbagDeploymentStatus(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Airbag Deployment Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionAirbagDeploymentStatus(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryIncidentDescriptionSection The receiving '<em><b>Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryIncidentDescriptionSectionAirbagDeploymentStatus(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_INCIDENT_DESCRIPTION_SECTION__INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS,
						 EmspcrPlugin.INSTANCE.getString("InjuryIncidentDescriptionSectionAirbagDeploymentStatus"),
						 new Object [] { injuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryIncidentDescriptionSectionHeightOfFall(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Height Of Fall</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionHeightOfFall(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::HeightOfFall) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryIncidentDescriptionSectionHeightOfFall(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Height Of Fall</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionHeightOfFall(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryIncidentDescriptionSection The receiving '<em><b>Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryIncidentDescriptionSectionHeightOfFall(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_INCIDENT_DESCRIPTION_SECTION__INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL,
						 EmspcrPlugin.INSTANCE.getString("InjuryIncidentDescriptionSectionHeightOfFall"),
						 new Object [] { injuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryIncidentDescriptionSectionDisasterType(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Disaster Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionDisasterType(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::DisasterType) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryIncidentDescriptionSectionDisasterType(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Disaster Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryIncidentDescriptionSectionDisasterType(InjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryIncidentDescriptionSection The receiving '<em><b>Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryIncidentDescriptionSectionDisasterType(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_INCIDENT_DESCRIPTION_SECTION__INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE,
						 EmspcrPlugin.INSTANCE.getString("InjuryIncidentDescriptionSectionDisasterType"),
						 new Object [] { injuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInjuryCauseCategory(InjuryIncidentDescriptionSection) <em>Get Injury Cause Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryCauseCategory(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INJURY_CAUSE_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::InjuryCauseCategory))->asSequence()->any(true).oclAsType(emspcr::InjuryCauseCategory)";

	/**
	 * The cached OCL query for the '{@link #getInjuryCauseCategory(InjuryIncidentDescriptionSection) <em>Get Injury Cause Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryCauseCategory(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INJURY_CAUSE_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  InjuryCauseCategory getInjuryCauseCategory(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection) {
		if (GET_INJURY_CAUSE_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(69));
			try {
				GET_INJURY_CAUSE_CATEGORY__EOCL_QRY = helper.createQuery(GET_INJURY_CAUSE_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INJURY_CAUSE_CATEGORY__EOCL_QRY);
		return (InjuryCauseCategory) query.evaluate(injuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInjuryMechanism(InjuryIncidentDescriptionSection) <em>Get Injury Mechanism</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryMechanism(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INJURY_MECHANISM__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::InjuryMechanism))->asSequence()->any(true).oclAsType(emspcr::InjuryMechanism)";

	/**
	 * The cached OCL query for the '{@link #getInjuryMechanism(InjuryIncidentDescriptionSection) <em>Get Injury Mechanism</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryMechanism(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INJURY_MECHANISM__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  InjuryMechanism getInjuryMechanism(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection) {
		if (GET_INJURY_MECHANISM__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(70));
			try {
				GET_INJURY_MECHANISM__EOCL_QRY = helper.createQuery(GET_INJURY_MECHANISM__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INJURY_MECHANISM__EOCL_QRY);
		return (InjuryMechanism) query.evaluate(injuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTraumaCenterCriteria(InjuryIncidentDescriptionSection) <em>Get Trauma Center Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraumaCenterCriteria(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TRAUMA_CENTER_CRITERIA__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::TraumaCenterCriteria))->asSequence()->any(true).oclAsType(emspcr::TraumaCenterCriteria)";

	/**
	 * The cached OCL query for the '{@link #getTraumaCenterCriteria(InjuryIncidentDescriptionSection) <em>Get Trauma Center Criteria</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraumaCenterCriteria(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TRAUMA_CENTER_CRITERIA__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TraumaCenterCriteria getTraumaCenterCriteria(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection) {
		if (GET_TRAUMA_CENTER_CRITERIA__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(71));
			try {
				GET_TRAUMA_CENTER_CRITERIA__EOCL_QRY = helper.createQuery(GET_TRAUMA_CENTER_CRITERIA__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TRAUMA_CENTER_CRITERIA__EOCL_QRY);
		return (TraumaCenterCriteria) query.evaluate(injuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInjuryRiskFactor(InjuryIncidentDescriptionSection) <em>Get Injury Risk Factor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryRiskFactor(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INJURY_RISK_FACTOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::InjuryRiskFactor))->asSequence()->any(true).oclAsType(emspcr::InjuryRiskFactor)";

	/**
	 * The cached OCL query for the '{@link #getInjuryRiskFactor(InjuryIncidentDescriptionSection) <em>Get Injury Risk Factor</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryRiskFactor(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INJURY_RISK_FACTOR__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  InjuryRiskFactor getInjuryRiskFactor(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection) {
		if (GET_INJURY_RISK_FACTOR__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(72));
			try {
				GET_INJURY_RISK_FACTOR__EOCL_QRY = helper.createQuery(GET_INJURY_RISK_FACTOR__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INJURY_RISK_FACTOR__EOCL_QRY);
		return (InjuryRiskFactor) query.evaluate(injuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVehicleImpactArea(InjuryIncidentDescriptionSection) <em>Get Vehicle Impact Area</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleImpactArea(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VEHICLE_IMPACT_AREA__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::VehicleImpactArea))->asSequence()->any(true).oclAsType(emspcr::VehicleImpactArea)";

	/**
	 * The cached OCL query for the '{@link #getVehicleImpactArea(InjuryIncidentDescriptionSection) <em>Get Vehicle Impact Area</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleImpactArea(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VEHICLE_IMPACT_AREA__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  VehicleImpactArea getVehicleImpactArea(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection) {
		if (GET_VEHICLE_IMPACT_AREA__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(73));
			try {
				GET_VEHICLE_IMPACT_AREA__EOCL_QRY = helper.createQuery(GET_VEHICLE_IMPACT_AREA__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VEHICLE_IMPACT_AREA__EOCL_QRY);
		return (VehicleImpactArea) query.evaluate(injuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientLocationInVehicle(InjuryIncidentDescriptionSection) <em>Get Patient Location In Vehicle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientLocationInVehicle(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientLocationInVehicle))->asSequence()->any(true).oclAsType(emspcr::PatientLocationInVehicle)";

	/**
	 * The cached OCL query for the '{@link #getPatientLocationInVehicle(InjuryIncidentDescriptionSection) <em>Get Patient Location In Vehicle</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientLocationInVehicle(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PatientLocationInVehicle getPatientLocationInVehicle(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection) {
		if (GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(74));
			try {
				GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_QRY = helper.createQuery(GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_QRY);
		return (PatientLocationInVehicle) query.evaluate(injuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVehicleOccupantSafetyEquipment(InjuryIncidentDescriptionSection) <em>Get Vehicle Occupant Safety Equipment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleOccupantSafetyEquipment(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::VehicleOccupantSafetyEquipment))->asSequence()->any(true).oclAsType(emspcr::VehicleOccupantSafetyEquipment)";

	/**
	 * The cached OCL query for the '{@link #getVehicleOccupantSafetyEquipment(InjuryIncidentDescriptionSection) <em>Get Vehicle Occupant Safety Equipment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleOccupantSafetyEquipment(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  VehicleOccupantSafetyEquipment getVehicleOccupantSafetyEquipment(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection) {
		if (GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(75));
			try {
				GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_QRY = helper.createQuery(GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_QRY);
		return (VehicleOccupantSafetyEquipment) query.evaluate(injuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAirbagDeploymentStatus(InjuryIncidentDescriptionSection) <em>Get Airbag Deployment Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirbagDeploymentStatus(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::AirbagDeploymentStatus))->asSequence()->any(true).oclAsType(emspcr::AirbagDeploymentStatus)";

	/**
	 * The cached OCL query for the '{@link #getAirbagDeploymentStatus(InjuryIncidentDescriptionSection) <em>Get Airbag Deployment Status</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirbagDeploymentStatus(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  AirbagDeploymentStatus getAirbagDeploymentStatus(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection) {
		if (GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(76));
			try {
				GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_QRY = helper.createQuery(GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_QRY);
		return (AirbagDeploymentStatus) query.evaluate(injuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHeightOfFall(InjuryIncidentDescriptionSection) <em>Get Height Of Fall</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightOfFall(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEIGHT_OF_FALL__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::HeightOfFall))->asSequence()->any(true).oclAsType(emspcr::HeightOfFall)";

	/**
	 * The cached OCL query for the '{@link #getHeightOfFall(InjuryIncidentDescriptionSection) <em>Get Height Of Fall</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightOfFall(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEIGHT_OF_FALL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  HeightOfFall getHeightOfFall(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection) {
		if (GET_HEIGHT_OF_FALL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(77));
			try {
				GET_HEIGHT_OF_FALL__EOCL_QRY = helper.createQuery(GET_HEIGHT_OF_FALL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEIGHT_OF_FALL__EOCL_QRY);
		return (HeightOfFall) query.evaluate(injuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDisasterType(InjuryIncidentDescriptionSection) <em>Get Disaster Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisasterType(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISASTER_TYPE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::DisasterType))->asSequence()->any(true).oclAsType(emspcr::DisasterType)";

	/**
	 * The cached OCL query for the '{@link #getDisasterType(InjuryIncidentDescriptionSection) <em>Get Disaster Type</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisasterType(InjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISASTER_TYPE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DisasterType getDisasterType(InjuryIncidentDescriptionSection injuryIncidentDescriptionSection) {
		if (GET_DISASTER_TYPE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(78));
			try {
				GET_DISASTER_TYPE__EOCL_QRY = helper.createQuery(GET_DISASTER_TYPE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISASTER_TYPE__EOCL_QRY);
		return (DisasterType) query.evaluate(injuryIncidentDescriptionSection);
	}

} // InjuryIncidentDescriptionSectionOperations
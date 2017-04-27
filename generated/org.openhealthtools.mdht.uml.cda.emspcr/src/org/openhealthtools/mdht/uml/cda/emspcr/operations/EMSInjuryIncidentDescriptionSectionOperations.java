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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle;
import org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria;
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea;
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Injury Incident Description Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionInjuryCauseCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Injury Cause Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionInjuryMechanism(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Injury Mechanism</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteria(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Trauma Center Criteria</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionInjuryRiskFactor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Injury Risk Factor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionVehicleImpactArea(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Vehicle Impact Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Patient Location In Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Vehicle Occupant Safety Equipment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Airbag Deployment Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionHeightOfFall(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Height Of Fall</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionDisasterType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Disaster Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getInjuryCauseCategory() <em>Get Injury Cause Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getInjuryMechanism() <em>Get Injury Mechanism</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getTraumaCenterCriteria() <em>Get Trauma Center Criteria</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getInjuryRiskFactor() <em>Get Injury Risk Factor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getVehicleImpactArea() <em>Get Vehicle Impact Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getPatientLocationInVehicle() <em>Get Patient Location In Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getVehicleOccupantSafetyEquipment() <em>Get Vehicle Occupant Safety Equipment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getAirbagDeploymentStatus() <em>Get Airbag Deployment Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getHeightOfFall() <em>Get Height Of Fall</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getDisasterType() <em>Get Disaster Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSInjuryIncidentDescriptionSectionOperations extends org.eclipse.mdht.uml.cda.operations.SectionOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSInjuryIncidentDescriptionSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionTemplateId(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionTemplateId(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.17')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionTemplateId(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionTemplateId(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSInjuryIncidentDescriptionSectionTemplateId(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsInjuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEMSInjuryIncidentDescriptionSectionTemplateId"),
						 new Object [] { emsInjuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionCode(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionCode(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67800-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionCode(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionCode(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSInjuryIncidentDescriptionSectionCode(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsInjuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEMSInjuryIncidentDescriptionSectionCode"),
						 new Object [] { emsInjuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionTitle(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionTitle(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Injury Incident Description Section')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionTitle(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionTitle(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSInjuryIncidentDescriptionSectionTitle(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsInjuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEMSInjuryIncidentDescriptionSectionTitle"),
						 new Object [] { emsInjuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionText(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionText(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionText(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionText(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSInjuryIncidentDescriptionSectionText(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsInjuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEMSInjuryIncidentDescriptionSectionText"),
						 new Object [] { emsInjuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionInjuryCauseCategory(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Injury Cause Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionInjuryCauseCategory(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::InjuryCauseCategory) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionInjuryCauseCategory(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Injury Cause Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionInjuryCauseCategory(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSInjuryIncidentDescriptionSectionInjuryCauseCategory(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsInjuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY,
						 EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEMSInjuryIncidentDescriptionSectionInjuryCauseCategory"),
						 new Object [] { emsInjuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionInjuryMechanism(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Injury Mechanism</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionInjuryMechanism(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::InjuryMechanism) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionInjuryMechanism(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Injury Mechanism</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionInjuryMechanism(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSInjuryIncidentDescriptionSectionInjuryMechanism(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsInjuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM,
						 EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEMSInjuryIncidentDescriptionSectionInjuryMechanism"),
						 new Object [] { emsInjuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteria(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Trauma Center Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteria(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::TraumaCenterCriteria) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteria(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Trauma Center Criteria</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteria(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteria(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsInjuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA,
						 EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEMSInjuryIncidentDescriptionSectionTraumaCenterCriteria"),
						 new Object [] { emsInjuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionInjuryRiskFactor(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Injury Risk Factor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionInjuryRiskFactor(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::InjuryRiskFactor) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionInjuryRiskFactor(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Injury Risk Factor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionInjuryRiskFactor(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSInjuryIncidentDescriptionSectionInjuryRiskFactor(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsInjuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR,
						 EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEMSInjuryIncidentDescriptionSectionInjuryRiskFactor"),
						 new Object [] { emsInjuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionVehicleImpactArea(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Vehicle Impact Area</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionVehicleImpactArea(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::VehicleImpactArea) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionVehicleImpactArea(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Vehicle Impact Area</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionVehicleImpactArea(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSInjuryIncidentDescriptionSectionVehicleImpactArea(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsInjuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA,
						 EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEMSInjuryIncidentDescriptionSectionVehicleImpactArea"),
						 new Object [] { emsInjuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicle(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Patient Location In Vehicle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicle(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientLocationInVehicle) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicle(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Patient Location In Vehicle</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicle(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicle(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsInjuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE,
						 EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEMSInjuryIncidentDescriptionSectionPatientLocationInVehicle"),
						 new Object [] { emsInjuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Vehicle Occupant Safety Equipment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::VehicleOccupantSafetyEquipment) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Vehicle Occupant Safety Equipment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsInjuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT,
						 EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment"),
						 new Object [] { emsInjuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Airbag Deployment Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::AirbagDeploymentStatus) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Airbag Deployment Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsInjuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS,
						 EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus"),
						 new Object [] { emsInjuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionHeightOfFall(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Height Of Fall</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionHeightOfFall(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::HeightOfFall) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionHeightOfFall(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Height Of Fall</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionHeightOfFall(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSInjuryIncidentDescriptionSectionHeightOfFall(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsInjuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL,
						 EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEMSInjuryIncidentDescriptionSectionHeightOfFall"),
						 new Object [] { emsInjuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSInjuryIncidentDescriptionSectionDisasterType(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Disaster Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionDisasterType(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::DisasterType) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSInjuryIncidentDescriptionSectionDisasterType(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Disaster Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSInjuryIncidentDescriptionSectionDisasterType(EMSInjuryIncidentDescriptionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsInjuryIncidentDescriptionSection The receiving '<em><b>EMS Injury Incident Description Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSInjuryIncidentDescriptionSectionDisasterType(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION);
			try {
				VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsInjuryIncidentDescriptionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE,
						 EmspcrPlugin.INSTANCE.getString("EMSInjuryIncidentDescriptionSectionEMSInjuryIncidentDescriptionSectionDisasterType"),
						 new Object [] { emsInjuryIncidentDescriptionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInjuryCauseCategory(EMSInjuryIncidentDescriptionSection) <em>Get Injury Cause Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryCauseCategory(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INJURY_CAUSE_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::InjuryCauseCategory))->asSequence()->any(true).oclAsType(emspcr::InjuryCauseCategory)";

	/**
	 * The cached OCL query for the '{@link #getInjuryCauseCategory(EMSInjuryIncidentDescriptionSection) <em>Get Injury Cause Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryCauseCategory(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INJURY_CAUSE_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static InjuryCauseCategory getInjuryCauseCategory(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection) {
	
	
	
		if (GET_INJURY_CAUSE_CATEGORY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(69));
			try {
				GET_INJURY_CAUSE_CATEGORY__EOCL_QRY = helper.createQuery(GET_INJURY_CAUSE_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_INJURY_CAUSE_CATEGORY__EOCL_QRY);
		return (InjuryCauseCategory) query.evaluate(emsInjuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInjuryMechanism(EMSInjuryIncidentDescriptionSection) <em>Get Injury Mechanism</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryMechanism(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INJURY_MECHANISM__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::InjuryMechanism))->asSequence()->any(true).oclAsType(emspcr::InjuryMechanism)";

	/**
	 * The cached OCL query for the '{@link #getInjuryMechanism(EMSInjuryIncidentDescriptionSection) <em>Get Injury Mechanism</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryMechanism(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INJURY_MECHANISM__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static InjuryMechanism getInjuryMechanism(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection) {
	
	
	
		if (GET_INJURY_MECHANISM__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(70));
			try {
				GET_INJURY_MECHANISM__EOCL_QRY = helper.createQuery(GET_INJURY_MECHANISM__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_INJURY_MECHANISM__EOCL_QRY);
		return (InjuryMechanism) query.evaluate(emsInjuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTraumaCenterCriteria(EMSInjuryIncidentDescriptionSection) <em>Get Trauma Center Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraumaCenterCriteria(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TRAUMA_CENTER_CRITERIA__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::TraumaCenterCriteria))->asSequence()->any(true).oclAsType(emspcr::TraumaCenterCriteria)";

	/**
	 * The cached OCL query for the '{@link #getTraumaCenterCriteria(EMSInjuryIncidentDescriptionSection) <em>Get Trauma Center Criteria</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraumaCenterCriteria(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TRAUMA_CENTER_CRITERIA__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static TraumaCenterCriteria getTraumaCenterCriteria(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection) {
	
	
	
		if (GET_TRAUMA_CENTER_CRITERIA__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(71));
			try {
				GET_TRAUMA_CENTER_CRITERIA__EOCL_QRY = helper.createQuery(GET_TRAUMA_CENTER_CRITERIA__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_TRAUMA_CENTER_CRITERIA__EOCL_QRY);
		return (TraumaCenterCriteria) query.evaluate(emsInjuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInjuryRiskFactor(EMSInjuryIncidentDescriptionSection) <em>Get Injury Risk Factor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryRiskFactor(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INJURY_RISK_FACTOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::InjuryRiskFactor))->asSequence()->any(true).oclAsType(emspcr::InjuryRiskFactor)";

	/**
	 * The cached OCL query for the '{@link #getInjuryRiskFactor(EMSInjuryIncidentDescriptionSection) <em>Get Injury Risk Factor</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjuryRiskFactor(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INJURY_RISK_FACTOR__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static InjuryRiskFactor getInjuryRiskFactor(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection) {
	
	
	
		if (GET_INJURY_RISK_FACTOR__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(72));
			try {
				GET_INJURY_RISK_FACTOR__EOCL_QRY = helper.createQuery(GET_INJURY_RISK_FACTOR__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_INJURY_RISK_FACTOR__EOCL_QRY);
		return (InjuryRiskFactor) query.evaluate(emsInjuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVehicleImpactArea(EMSInjuryIncidentDescriptionSection) <em>Get Vehicle Impact Area</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleImpactArea(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VEHICLE_IMPACT_AREA__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::VehicleImpactArea))->asSequence()->any(true).oclAsType(emspcr::VehicleImpactArea)";

	/**
	 * The cached OCL query for the '{@link #getVehicleImpactArea(EMSInjuryIncidentDescriptionSection) <em>Get Vehicle Impact Area</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleImpactArea(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VEHICLE_IMPACT_AREA__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static VehicleImpactArea getVehicleImpactArea(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection) {
	
	
	
		if (GET_VEHICLE_IMPACT_AREA__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(73));
			try {
				GET_VEHICLE_IMPACT_AREA__EOCL_QRY = helper.createQuery(GET_VEHICLE_IMPACT_AREA__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_VEHICLE_IMPACT_AREA__EOCL_QRY);
		return (VehicleImpactArea) query.evaluate(emsInjuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientLocationInVehicle(EMSInjuryIncidentDescriptionSection) <em>Get Patient Location In Vehicle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientLocationInVehicle(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientLocationInVehicle))->asSequence()->any(true).oclAsType(emspcr::PatientLocationInVehicle)";

	/**
	 * The cached OCL query for the '{@link #getPatientLocationInVehicle(EMSInjuryIncidentDescriptionSection) <em>Get Patient Location In Vehicle</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientLocationInVehicle(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PatientLocationInVehicle getPatientLocationInVehicle(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection) {
	
	
	
		if (GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(74));
			try {
				GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_QRY = helper.createQuery(GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PATIENT_LOCATION_IN_VEHICLE__EOCL_QRY);
		return (PatientLocationInVehicle) query.evaluate(emsInjuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVehicleOccupantSafetyEquipment(EMSInjuryIncidentDescriptionSection) <em>Get Vehicle Occupant Safety Equipment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleOccupantSafetyEquipment(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::VehicleOccupantSafetyEquipment))->asSequence()->any(true).oclAsType(emspcr::VehicleOccupantSafetyEquipment)";

	/**
	 * The cached OCL query for the '{@link #getVehicleOccupantSafetyEquipment(EMSInjuryIncidentDescriptionSection) <em>Get Vehicle Occupant Safety Equipment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleOccupantSafetyEquipment(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static VehicleOccupantSafetyEquipment getVehicleOccupantSafetyEquipment(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection) {
	
	
	
		if (GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(75));
			try {
				GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_QRY = helper.createQuery(GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__EOCL_QRY);
		return (VehicleOccupantSafetyEquipment) query.evaluate(emsInjuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAirbagDeploymentStatus(EMSInjuryIncidentDescriptionSection) <em>Get Airbag Deployment Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirbagDeploymentStatus(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::AirbagDeploymentStatus))->asSequence()->any(true).oclAsType(emspcr::AirbagDeploymentStatus)";

	/**
	 * The cached OCL query for the '{@link #getAirbagDeploymentStatus(EMSInjuryIncidentDescriptionSection) <em>Get Airbag Deployment Status</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirbagDeploymentStatus(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AirbagDeploymentStatus getAirbagDeploymentStatus(
			EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection) {
	
	
	
		if (GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(76));
			try {
				GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_QRY = helper.createQuery(GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_AIRBAG_DEPLOYMENT_STATUS__EOCL_QRY);
		return (AirbagDeploymentStatus) query.evaluate(emsInjuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHeightOfFall(EMSInjuryIncidentDescriptionSection) <em>Get Height Of Fall</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightOfFall(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEIGHT_OF_FALL__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::HeightOfFall))->asSequence()->any(true).oclAsType(emspcr::HeightOfFall)";

	/**
	 * The cached OCL query for the '{@link #getHeightOfFall(EMSInjuryIncidentDescriptionSection) <em>Get Height Of Fall</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightOfFall(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEIGHT_OF_FALL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HeightOfFall getHeightOfFall(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection) {
	
	
	
		if (GET_HEIGHT_OF_FALL__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(77));
			try {
				GET_HEIGHT_OF_FALL__EOCL_QRY = helper.createQuery(GET_HEIGHT_OF_FALL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_HEIGHT_OF_FALL__EOCL_QRY);
		return (HeightOfFall) query.evaluate(emsInjuryIncidentDescriptionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDisasterType(EMSInjuryIncidentDescriptionSection) <em>Get Disaster Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisasterType(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISASTER_TYPE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::DisasterType))->asSequence()->any(true).oclAsType(emspcr::DisasterType)";

	/**
	 * The cached OCL query for the '{@link #getDisasterType(EMSInjuryIncidentDescriptionSection) <em>Get Disaster Type</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisasterType(EMSInjuryIncidentDescriptionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISASTER_TYPE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DisasterType getDisasterType(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection) {
	
	
	
		if (GET_DISASTER_TYPE__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION, EmspcrPackage.Literals.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION.getEAllOperations().get(78));
			try {
				GET_DISASTER_TYPE__EOCL_QRY = helper.createQuery(GET_DISASTER_TYPE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DISASTER_TYPE__EOCL_QRY);
		return (DisasterType) query.evaluate(emsInjuryIncidentDescriptionSection);
	}

} // EMSInjuryIncidentDescriptionSectionOperations

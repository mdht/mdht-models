/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

import org.openhealthtools.mdht.uml.cda.vsdr.Injury;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPlugin;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Injury</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Desc</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociationWorkAssociationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociationWorkAssociationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociationWorkAssociationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociationWorkAssociationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociationWorkAssociationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociationWorkAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociationTransportationAssociationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociationTransportationAssociationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociationTransportationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTransportationRelationshipValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTransportationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InjuryOperations extends OrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InjuryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryTemplateId(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryTemplateId(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.9')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryTemplateId(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryTemplateId(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryTemplateId(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				VALIDATE_INJURY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injury)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_TEMPLATE_ID,
						 VsdrPlugin.INSTANCE.getString("InjuryTemplateId"),
						 new Object [] { injury }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryClassCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				VALIDATE_INJURY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injury)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_CLASS_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryClassCode"),
						 new Object [] { injury }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryMoodCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				VALIDATE_INJURY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injury)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_MOOD_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryMoodCode"),
						 new Object [] { injury }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '71481-6' and value.codeSystem = '2.16.840.1.113883.6.1'";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				VALIDATE_INJURY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injury)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryCode"),
						 new Object [] { injury }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryCodeP(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				VALIDATE_INJURY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injury)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_CODE_P,
						 VsdrPlugin.INSTANCE.getString("InjuryCodeP"),
						 new Object [] { injury }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryStatusCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryStatusCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryStatusCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryStatusCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryStatusCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				VALIDATE_INJURY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injury)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_STATUS_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryStatusCode"),
						 new Object [] { injury }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryComponentInjuryInformation(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injury)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformation"),
						 new Object [] { injury }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentWorkAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentWorkAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryComponentWorkAssociation(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injury)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_WORK_ASSOCIATION,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentWorkAssociation"),
						 new Object [] { injury }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryComponentTransportationAssociation(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injury)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationAssociation"),
						 new Object [] { injury }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationRelationship(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationship(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationRelationship(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationship(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryComponentTransportationRelationship(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(injury)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationRelationship"),
						 new Object [] { injury }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null).scopingEntity->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClassRoot::PLC)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_CLASS_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Determiner Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null).scopingEntity->excluding(null)->reject(isDefined('determinerCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Determiner Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DETERMINER_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Desc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DESC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null).scopingEntity->excluding(null)->reject((desc.oclIsUndefined() or desc.isNullFlavorUndefined()) implies (not desc.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Desc</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DESC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DESC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DESC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DESC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DESC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DESC,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_ADDR,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassRoot::ISDLOC)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_CLASS_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null)->reject(scopingEntity->one(scopingEntity : cda::Entity | not scopingEntity.oclIsUndefined() and scopingEntity.oclIsKindOf(cda::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null).participant->excluding(null)->reject(typeCode=vocab::ParticipationType::LOC)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_TYPE_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null).participant->excluding(null)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationClassCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CLASS_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationMoodCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_MOOD_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationMoodCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationCodeP(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE_P,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationCodeP"),
						 new Object [] { eObject }));
				}
				
				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.vsdr.InjuryComponentInjuryInformationInjuryInformationCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put("org.openhealthtools.mdht.uml.cda.vsdr.InjuryComponentInjuryInformationInjuryInformationCodeP", passToken);
					}
					passToken.addAll(oclResultSet);
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = '11374-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			Object passFilter = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.vsdr.InjuryComponentInjuryInformationInjuryInformationCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}
	  		
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationText(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationText(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationText(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationText(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationText(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_TEXT,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationText"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_EFFECTIVE_TIME,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationEffectiveTime"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BL))))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationValue(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_VALUE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationValue"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformationLocationParticipation"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipHasComponent::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationTypeCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_TYPE_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentInjuryInformationInjuryInformation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentInjuryInformationInjuryInformation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentInjuryInformationInjuryInformation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentInjuryInformationInjuryInformation(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentInjuryInformationInjuryInformation"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentWorkAssociationWorkAssociationClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociationWorkAssociationClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentWorkAssociationWorkAssociationClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociationWorkAssociationClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentWorkAssociationWorkAssociationClassCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CLASS_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentWorkAssociationWorkAssociationClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentWorkAssociationWorkAssociationMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociationWorkAssociationMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentWorkAssociationWorkAssociationMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociationWorkAssociationMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentWorkAssociationWorkAssociationMoodCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_MOOD_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentWorkAssociationWorkAssociationMoodCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentWorkAssociationWorkAssociationCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociationWorkAssociationCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentWorkAssociationWorkAssociationCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociationWorkAssociationCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentWorkAssociationWorkAssociationCodeP(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE_P,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentWorkAssociationWorkAssociationCodeP"),
						 new Object [] { eObject }));
				}
				
				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.vsdr.InjuryComponentWorkAssociationWorkAssociationCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put("org.openhealthtools.mdht.uml.cda.vsdr.InjuryComponentWorkAssociationWorkAssociationCodeP", passToken);
					}
					passToken.addAll(oclResultSet);
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentWorkAssociationWorkAssociationCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociationWorkAssociationCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = '69444-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentWorkAssociationWorkAssociationCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociationWorkAssociationCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentWorkAssociationWorkAssociationCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			Object passFilter = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.vsdr.InjuryComponentWorkAssociationWorkAssociationCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}
	  		
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentWorkAssociationWorkAssociationCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentWorkAssociationWorkAssociationValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociationWorkAssociationValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BL))))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentWorkAssociationWorkAssociationValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociationWorkAssociationValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentWorkAssociationWorkAssociationValue(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_VALUE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentWorkAssociationWorkAssociationValue"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentWorkAssociationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipHasComponent::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentWorkAssociationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentWorkAssociationTypeCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_TYPE_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentWorkAssociationTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentWorkAssociationWorkAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociationWorkAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentWorkAssociationWorkAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentWorkAssociationWorkAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentWorkAssociationWorkAssociation(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentWorkAssociationWorkAssociation"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CLASS_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationAssociationTransportationAssociationClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_MOOD_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationAssociationTransportationAssociationMoodCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE_P,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationAssociationTransportationAssociationCodeP"),
						 new Object [] { eObject }));
				}
				
				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.vsdr.InjuryComponentTransportationAssociationTransportationAssociationCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put("org.openhealthtools.mdht.uml.cda.vsdr.InjuryComponentTransportationAssociationTransportationAssociationCodeP", passToken);
					}
					passToken.addAll(oclResultSet);
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationAssociationTransportationAssociationCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociationTransportationAssociationCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = '69448-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationAssociationTransportationAssociationCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociationTransportationAssociationCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationAssociationTransportationAssociationCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			Object passFilter = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.vsdr.InjuryComponentTransportationAssociationTransportationAssociationCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}
	  		
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationAssociationTransportationAssociationCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationAssociationTransportationAssociationValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociationTransportationAssociationValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BL))))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationAssociationTransportationAssociationValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociationTransportationAssociationValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationAssociationTransportationAssociationValue(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_VALUE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationAssociationTransportationAssociationValue"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationAssociationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipHasComponent::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationAssociationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociationTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationAssociationTypeCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TYPE_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationAssociationTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationAssociationTransportationAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociationTransportationAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationAssociationTransportationAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationAssociationTransportationAssociation(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationAssociationTransportationAssociation(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationAssociationTransportationAssociation"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CLASS_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationRelationshipTransportationRelationshipClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_MOOD_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationRelationshipTransportationRelationshipMoodCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE_P,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationRelationshipTransportationRelationshipCodeP"),
						 new Object [] { eObject }));
				}
				
				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.vsdr.InjuryComponentTransportationRelationshipTransportationRelationshipCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put("org.openhealthtools.mdht.uml.cda.vsdr.InjuryComponentTransportationRelationshipTransportationRelationshipCodeP", passToken);
					}
					passToken.addAll(oclResultSet);
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = '69451-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			Object passFilter = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.vsdr.InjuryComponentTransportationRelationshipTransportationRelationshipCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}
	  		
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationRelationshipTransportationRelationshipCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '303980003' or value.code = '257500003' or value.code = '257518000'))))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationRelationshipTransportationRelationshipValue"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationRelationshipTransportationRelationshipValueP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTransportationRelationshipValueP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationRelationshipTransportationRelationshipValueP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTransportationRelationshipValueP(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipValueP(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE_P,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationRelationshipTransportationRelationshipValueP"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationRelationshipTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipHasComponent::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationRelationshipTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTypeCode(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationRelationshipTypeCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TYPE_CODE,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationRelationshipTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryComponentTransportationRelationshipTransportationRelationship(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTransportationRelationship(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryComponentTransportationRelationshipTransportationRelationship(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryComponentTransportationRelationshipTransportationRelationship(Injury, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injury The receiving '<em><b>Injury</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateInjuryComponentTransportationRelationshipTransportationRelationship(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.INJURY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(injury);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP,
						 VsdrPlugin.INSTANCE.getString("InjuryComponentTransportationRelationshipTransportationRelationship"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // InjuryOperations
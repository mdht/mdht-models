/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.ReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyArm;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nonhuman Subject Demographics</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsStudyArm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Study Arm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsReferencePeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Reference Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationSubjectStrain(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Association Subject Strain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsageAssociationSubjectAgeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsageAssociationSubjectAgeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsageAssociationSubjectAgeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsageAssociationSubjectAgeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsageAssociationSubjectAgeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsageAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsageAssociationSubjectAge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationSubjectSpecies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Association Subject Species</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationSetMembership(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Association Set Membership</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#getStudyArms() <em>Get Study Arms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#getReferencePeriod() <em>Get Reference Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonhumanSubjectDemographicsOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonhumanSubjectDemographicsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsTemplateId(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsTemplateId(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.60')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsTemplateId(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsTemplateId(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsTemplateId(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsClassCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsMoodCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsCodeP(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'DMGtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsStudyArm(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Study Arm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsStudyArm(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::StudyArm) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)->size() = 2";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsStudyArm(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Study Arm</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsStudyArm(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsStudyArm(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_STUDY_ARM,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsStudyArm", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsComment(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsComment(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsComment(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsComment(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsComment(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsDomainAssignment(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsDomainAssignment(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsDomainAssignment(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsDomainAssignment(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsDomainAssignment(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsRelatedRecord(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsRelatedRecord(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsRelatedRecord(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsRelatedRecord(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsRelatedRecord(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsSupplementalValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsSupplementalValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsSupplementalValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsSupplementalValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsSupplementalValue(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsReferencePeriod(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsReferencePeriod(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::ReferencePeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsReferencePeriod(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Reference Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsReferencePeriod(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsReferencePeriod(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_REFERENCE_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICS_REFERENCE_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsReferencePeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'SStbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationsubjectStrainCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined())))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationsubjectStrainValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValueP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValueP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValueP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValueP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValueP(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationsubjectStrainValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationsubjectStrainText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsstrainAssociationTypeCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationSubjectStrain(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Association Subject Strain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationSubjectStrain(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_SUBJECT_STRAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsstrainAssociationSubjectStrain(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Association Subject Strain</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsstrainAssociationSubjectStrain(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_SUBJECT_STRAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsstrainAssociationSubjectStrain(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_SUBJECT_STRAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_SUBJECT_STRAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_SUBJECT_STRAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_SUBJECT_STRAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_SUBJECT_STRAIN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsstrainAssociationSubjectStrain", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsageAssociationSubjectAgeClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsageAssociationSubjectAgeClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsageAssociationSubjectAgeClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsageAssociationSubjectAgeClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeClassCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsageAssociationSubjectAgeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsageAssociationSubjectAgeCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsageAssociationSubjectAgeCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsageAssociationSubjectAgeCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsageAssociationSubjectAgeCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeCodeP(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsageAssociationSubjectAgeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsageAssociationSubjectAgeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsageAssociationSubjectAgeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C25150' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsageAssociationSubjectAgeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsageAssociationSubjectAgeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsageAssociationSubjectAgeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsageAssociationSubjectAgeMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsageAssociationSubjectAgeMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsageAssociationSubjectAgeMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsageAssociationSubjectAgeMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeMoodCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsageAssociationSubjectAgeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsageAssociationSubjectAgeValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsageAssociationSubjectAgeValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::PQ))))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsageAssociationSubjectAgeValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsageAssociationSubjectAgeValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsageAssociationSubjectAgeValue(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsageAssociationSubjectAgeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsageAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsageAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsageAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsageAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsageAssociationTypeCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsageAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsageAssociationSubjectAge(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsageAssociationSubjectAge(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsageAssociationSubjectAge(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsage Association Subject Age</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsageAssociationSubjectAge(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsageAssociationSubjectAge(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSAGE_ASSOCIATION_SUBJECT_AGE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsageAssociationSubjectAge", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'SPCtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined())))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValueP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValueP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValueP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValueP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValueP(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsspeciesAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationSubjectSpecies(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Association Subject Species</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationSubjectSpecies(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_SUBJECT_SPECIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicsspeciesAssociationSubjectSpecies(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Association Subject Species</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicsspeciesAssociationSubjectSpecies(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_SUBJECT_SPECIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicsspeciesAssociationSubjectSpecies(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_SUBJECT_SPECIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_SUBJECT_SPECIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_SUBJECT_SPECIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_SUBJECT_SPECIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_SUBJECT_SPECIES,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicsspeciesAssociationSubjectSpecies", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicssetMembershipAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationSetMembership(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Association Set Membership</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicssetMembershipAssociationSetMembership(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_SET_MEMBERSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanSubjectDemographicssetMembershipAssociationSetMembership(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Association Set Membership</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanSubjectDemographicssetMembershipAssociationSetMembership(NonhumanSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_SET_MEMBERSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanSubjectDemographics The receiving '<em><b>Nonhuman Subject Demographics</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanSubjectDemographicssetMembershipAssociationSetMembership(NonhumanSubjectDemographics nonhumanSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_SET_MEMBERSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS);
			try {
				VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_SET_MEMBERSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_SET_MEMBERSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_SET_MEMBERSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanSubjectDemographics)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_SUBJECT_DEMOGRAPHICS__NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_SET_MEMBERSHIP,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanSubjectDemographicssetMembershipAssociationSetMembership", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanSubjectDemographics, context) }),
						 new Object [] { nonhumanSubjectDemographics }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyArms(NonhumanSubjectDemographics) <em>Get Study Arms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyArms(NonhumanSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_ARMS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::StudyArm)).oclAsType(sdtm::StudyArm)";

	/**
	 * The cached OCL query for the '{@link #getStudyArms(NonhumanSubjectDemographics) <em>Get Study Arms</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyArms(NonhumanSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_ARMS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<StudyArm> getStudyArms(NonhumanSubjectDemographics nonhumanSubjectDemographics) {
		if (GET_STUDY_ARMS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(93));
			try {
				GET_STUDY_ARMS__EOCL_QRY = helper.createQuery(GET_STUDY_ARMS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_ARMS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StudyArm> result = (Collection<StudyArm>) query.evaluate(nonhumanSubjectDemographics);
		return new BasicEList.UnmodifiableEList<StudyArm>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(NonhumanSubjectDemographics) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(NonhumanSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(NonhumanSubjectDemographics) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(NonhumanSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(NonhumanSubjectDemographics nonhumanSubjectDemographics) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(94));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(nonhumanSubjectDemographics);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(NonhumanSubjectDemographics) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(NonhumanSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(NonhumanSubjectDemographics) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(NonhumanSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(NonhumanSubjectDemographics nonhumanSubjectDemographics) {
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(95));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(nonhumanSubjectDemographics);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(NonhumanSubjectDemographics) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(NonhumanSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(NonhumanSubjectDemographics) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(NonhumanSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(NonhumanSubjectDemographics nonhumanSubjectDemographics) {
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(96));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(nonhumanSubjectDemographics);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(NonhumanSubjectDemographics) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(NonhumanSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(NonhumanSubjectDemographics) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(NonhumanSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(NonhumanSubjectDemographics nonhumanSubjectDemographics) {
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(97));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(nonhumanSubjectDemographics);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getReferencePeriod(NonhumanSubjectDemographics) <em>Get Reference Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePeriod(NonhumanSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REFERENCE_PERIOD__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::ReferencePeriod))->asSequence()->any(true).oclAsType(sdtm::ReferencePeriod)";

	/**
	 * The cached OCL query for the '{@link #getReferencePeriod(NonhumanSubjectDemographics) <em>Get Reference Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePeriod(NonhumanSubjectDemographics)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REFERENCE_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ReferencePeriod getReferencePeriod(NonhumanSubjectDemographics nonhumanSubjectDemographics) {
		if (GET_REFERENCE_PERIOD__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.NONHUMAN_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(98));
			try {
				GET_REFERENCE_PERIOD__EOCL_QRY = helper.createQuery(GET_REFERENCE_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REFERENCE_PERIOD__EOCL_QRY);
		return (ReferencePeriod) query.evaluate(nonhumanSubjectDemographics);
	}

} // NonhumanSubjectDemographicsOperations
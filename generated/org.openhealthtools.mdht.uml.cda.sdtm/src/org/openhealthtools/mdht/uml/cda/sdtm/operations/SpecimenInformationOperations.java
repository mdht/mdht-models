/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Specimen Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationParticipatingSpecimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Participating Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationEventStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationPortionAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Portion Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationUsabilityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Usability Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationConditionAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Condition Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimen Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenroleOfSpecimenId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimen Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimen Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimen Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenRoleOfSpecimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimen Role Of Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationportionAssociationportionOrTotalityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationportionAssociationportionOrTotalityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationportionAssociationportionOrTotalityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationportionAssociationportionOrTotalityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationportionAssociationportionOrTotalityValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationportionAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationportionAssociationSpecimenCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Association Specimen Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationusabilityAssociationspecimenUsabilityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationusabilityAssociationspecimenUsabilityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationusabilityAssociationspecimenUsabilityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationusabilityAssociationspecimenUsabilityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationusabilityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationusabilityAssociationSpecimenUsability(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Association Specimen Usability</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationconditionAssociationspecimenConditionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationconditionAssociationspecimenConditionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationconditionAssociationspecimenConditionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationconditionAssociationspecimenConditionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationconditionAssociationspecimenConditionValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationconditionAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationconditionAssociationSpecimenCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Association Specimen Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#getEventStudyDay() <em>Get Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#getTimingReference() <em>Get Timing Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecimenInformationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenInformationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationTemplateId(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationTemplateId(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.78')";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationTemplateId(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationTemplateId(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationTemplateId(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationClassCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationClassCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::PROC";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationClassCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationClassCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationClassCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATION_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentProcedureMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationMoodCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATION_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'SCLtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationCodeP(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationEffectiveTime(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationEffectiveTime(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationEffectiveTime(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationEffectiveTime(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationEffectiveTime(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATION_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationTargetSiteCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationTargetSiteCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationTargetSiteCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationTargetSiteCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationTargetSiteCodeP(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATION_TARGET_SITE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationTargetSiteCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationTargetSiteCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationTargetSiteCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationTargetSiteCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationTargetSiteCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationTargetSiteCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATION_TARGET_SITE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationTargetSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationParticipatingSpecimen(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Participating Specimen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationParticipatingSpecimen(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATION_PARTICIPATING_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->one(specimen : cda::Specimen | not specimen.oclIsUndefined() and specimen.oclIsKindOf(cda::Specimen))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationParticipatingSpecimen(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Participating Specimen</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationParticipatingSpecimen(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATION_PARTICIPATING_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationParticipatingSpecimen(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATION_PARTICIPATING_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATION_PARTICIPATING_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATION_PARTICIPATING_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATION_PARTICIPATING_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATION_PARTICIPATING_SPECIMEN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationParticipatingSpecimen", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationEventStudyDay(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Event Study Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationEventStudyDay(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATION_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventStudyDay) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationEventStudyDay(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Event Study Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationEventStudyDay(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATION_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationEventStudyDay(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATION_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATION_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATION_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATION_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATION_EVENT_STUDY_DAY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationEventStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationTimingReference(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Timing Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationTimingReference(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::TimingReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationTimingReference(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Timing Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationTimingReference(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationTimingReference(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATION_TIMING_REFERENCE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationPortionAssociation(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Portion Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationPortionAssociation(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATION_PORTION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationPortionAssociation(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Portion Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationPortionAssociation(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATION_PORTION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationPortionAssociation(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATION_PORTION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATION_PORTION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATION_PORTION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATION_PORTION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATION_PORTION_ASSOCIATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationPortionAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationUsabilityAssociation(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Usability Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationUsabilityAssociation(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATION_USABILITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationUsabilityAssociation(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Usability Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationUsabilityAssociation(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATION_USABILITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationUsabilityAssociation(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATION_USABILITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATION_USABILITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATION_USABILITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATION_USABILITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATION_USABILITY_ASSOCIATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationUsabilityAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationConditionAssociation(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Condition Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationConditionAssociation(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATION_CONDITION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationConditionAssociation(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Condition Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationConditionAssociation(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATION_CONDITION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationConditionAssociation(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATION_CONDITION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATION_CONDITION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATION_CONDITION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATION_CONDITION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATION_CONDITION_ASSOCIATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationConditionAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null).->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Determiner Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null).->reject(isDefined('determinerCode') and determinerCode=vocab::EntityDeterminer::INSTANCE)";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Determiner Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_DETERMINER_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null).->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null).->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCodeP(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimen Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null)->reject(classCode=vocab::RoleClassSpecimen::SPEC)";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimen Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenId(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimen Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenId(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenId(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimen Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenroleOfSpecimenId(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenId(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationparticipatingSpecimenroleOfSpecimenId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationparticipatingSpecimenTemplateId(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimen Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenTemplateId(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null)->reject(templateId->exists(id : datatypes::II | id.root = 'null'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationparticipatingSpecimenTemplateId(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimen Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenTemplateId(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationparticipatingSpecimenTemplateId(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationparticipatingSpecimenTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationparticipatingSpecimenTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimen Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null)->reject(typeCode=vocab::ParticipationType::SPC)";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationparticipatingSpecimenTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimen Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationparticipatingSpecimenTypeCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationparticipatingSpecimenTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationparticipatingSpecimenRoleOfSpecimen(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimen Role Of Specimen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenRoleOfSpecimen(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_ROLE_OF_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null)->reject(specimenRole->one(specimenRole : cda::SpecimenRole | not specimenRole.oclIsUndefined() and specimenRole.oclIsKindOf(cda::SpecimenRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationparticipatingSpecimenRoleOfSpecimen(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimen Role Of Specimen</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationparticipatingSpecimenRoleOfSpecimen(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_ROLE_OF_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationparticipatingSpecimenRoleOfSpecimen(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_ROLE_OF_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_ROLE_OF_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_ROLE_OF_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_ROLE_OF_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_ROLE_OF_SPECIMEN,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationparticipatingSpecimenRoleOfSpecimen", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationportionAssociationportionOrTotalityMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationportionAssociationportionOrTotalityMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationportionAssociationportionOrTotalityMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationportionAssociationportionOrTotalityMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationportionAssociationportionOrTotalityMoodCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationportionAssociationportionOrTotalityMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationportionAssociationportionOrTotalityCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationportionAssociationportionOrTotalityCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationportionAssociationportionOrTotalityCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationportionAssociationportionOrTotalityCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationportionAssociationportionOrTotalityCodeP(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationportionAssociationportionOrTotalityCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationportionAssociationportionOrTotalityCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationportionAssociationportionOrTotalityCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'POTtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationportionAssociationportionOrTotalityCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationportionAssociationportionOrTotalityCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationportionAssociationportionOrTotalityCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationportionAssociationportionOrTotalityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationportionAssociationportionOrTotalityValue(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationportionAssociationportionOrTotalityValue(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'CA' or value.code = 'BD' or value.code = 'DIS' or value.code = 'DTH' or value.code = 'HOSP' or value.code = 'LT' or value.code = 'OD' or value.code = 'OTH'))))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationportionAssociationportionOrTotalityValue(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationportionAssociationportionOrTotalityValue(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationportionAssociationportionOrTotalityValue(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationportionAssociationportionOrTotalityValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationportionAssociationportionOrTotalityValueP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationportionAssociationportionOrTotalityValueP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationportionAssociationportionOrTotalityValueP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationportionAssociationportionOrTotalityValueP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationportionAssociationportionOrTotalityValueP(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationportionAssociationportionOrTotalityValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationportionAssociationTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationportionAssociationTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationportionAssociationTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationportionAssociationTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationportionAssociationTypeCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPORTION_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationportionAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationportionAssociationSpecimenCondition(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Association Specimen Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationportionAssociationSpecimenCondition(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATION_SPECIMEN_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationportionAssociationSpecimenCondition(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Association Specimen Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationportionAssociationSpecimenCondition(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATION_SPECIMEN_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationportionAssociationSpecimenCondition(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATION_SPECIMEN_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATION_SPECIMEN_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATION_SPECIMEN_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATION_SPECIMEN_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONPORTION_ASSOCIATION_SPECIMEN_CONDITION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationportionAssociationSpecimenCondition", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationusabilityAssociationspecimenUsabilityMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationusabilityAssociationspecimenUsabilityMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationusabilityAssociationspecimenUsabilityMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationusabilityAssociationspecimenUsabilityMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationusabilityAssociationspecimenUsabilityMoodCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationusabilityAssociationspecimenUsabilityMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationusabilityAssociationspecimenUsabilityCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationusabilityAssociationspecimenUsabilityCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationusabilityAssociationspecimenUsabilityCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationusabilityAssociationspecimenUsabilityCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationusabilityAssociationspecimenUsabilityCodeP(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationusabilityAssociationspecimenUsabilityCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationusabilityAssociationspecimenUsabilityCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationusabilityAssociationspecimenUsabilityCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'SUtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationusabilityAssociationspecimenUsabilityCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationusabilityAssociationspecimenUsabilityCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationusabilityAssociationspecimenUsabilityCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationusabilityAssociationspecimenUsabilityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationusabilityAssociationspecimenUsabilityValue(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationusabilityAssociationspecimenUsabilityValue(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationusabilityAssociationspecimenUsabilityValue(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationusabilityAssociationspecimenUsabilityValue(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationusabilityAssociationspecimenUsabilityValue(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationusabilityAssociationspecimenUsabilityValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationusabilityAssociationTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationusabilityAssociationTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationusabilityAssociationTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationusabilityAssociationTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationusabilityAssociationTypeCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationusabilityAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationusabilityAssociationSpecimenUsability(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Association Specimen Usability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationusabilityAssociationSpecimenUsability(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_SPECIMEN_USABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationusabilityAssociationSpecimenUsability(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Association Specimen Usability</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationusabilityAssociationSpecimenUsability(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_SPECIMEN_USABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationusabilityAssociationSpecimenUsability(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_SPECIMEN_USABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_SPECIMEN_USABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_SPECIMEN_USABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_SPECIMEN_USABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_SPECIMEN_USABILITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationusabilityAssociationSpecimenUsability", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationconditionAssociationspecimenConditionMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationconditionAssociationspecimenConditionMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationconditionAssociationspecimenConditionMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationconditionAssociationspecimenConditionMoodCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationconditionAssociationspecimenConditionMoodCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationconditionAssociationspecimenConditionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationconditionAssociationspecimenConditionCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationconditionAssociationspecimenConditionCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationconditionAssociationspecimenConditionCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationconditionAssociationspecimenConditionCodeP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationconditionAssociationspecimenConditionCodeP(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationconditionAssociationspecimenConditionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationconditionAssociationspecimenConditionCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationconditionAssociationspecimenConditionCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C78733' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationconditionAssociationspecimenConditionCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationconditionAssociationspecimenConditionCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationconditionAssociationspecimenConditionCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationconditionAssociationspecimenConditionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationconditionAssociationspecimenConditionValue(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationconditionAssociationspecimenConditionValue(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined())))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationconditionAssociationspecimenConditionValue(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationconditionAssociationspecimenConditionValue(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationconditionAssociationspecimenConditionValue(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationconditionAssociationspecimenConditionValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationconditionAssociationspecimenConditionValueP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationconditionAssociationspecimenConditionValueP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationconditionAssociationspecimenConditionValueP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationconditionAssociationspecimenConditionValueP(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationconditionAssociationspecimenConditionValueP(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationconditionAssociationspecimenConditionValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationconditionAssociationTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationconditionAssociationTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationconditionAssociationTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationconditionAssociationTypeCode(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationconditionAssociationTypeCode(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationconditionAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSpecimenInformationconditionAssociationSpecimenCondition(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Association Specimen Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationconditionAssociationSpecimenCondition(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_SPECIMEN_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSpecimenInformationconditionAssociationSpecimenCondition(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Association Specimen Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSpecimenInformationconditionAssociationSpecimenCondition(SpecimenInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_SPECIMEN_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param specimenInformation The receiving '<em><b>Specimen Information</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSpecimenInformationconditionAssociationSpecimenCondition(SpecimenInformation specimenInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_SPECIMEN_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.SPECIMEN_INFORMATION);
			try {
				VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_SPECIMEN_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_SPECIMEN_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_SPECIMEN_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(specimenInformation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.SPECIMEN_INFORMATION__SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_SPECIMEN_CONDITION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SpecimenInformationconditionAssociationSpecimenCondition", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(specimenInformation, context) }),
						 new Object [] { specimenInformation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventStudyDay(SpecimenInformation) <em>Get Event Study Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventStudyDay(SpecimenInformation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventStudyDay))->asSequence()->any(true).oclAsType(sdtm::EventStudyDay)";

	/**
	 * The cached OCL query for the '{@link #getEventStudyDay(SpecimenInformation) <em>Get Event Study Day</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventStudyDay(SpecimenInformation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_STUDY_DAY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventStudyDay getEventStudyDay(SpecimenInformation specimenInformation) {
		if (GET_EVENT_STUDY_DAY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SPECIMEN_INFORMATION, SdtmPackage.Literals.SPECIMEN_INFORMATION.getEAllOperations().get(94));
			try {
				GET_EVENT_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_EVENT_STUDY_DAY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_STUDY_DAY__EOCL_QRY);
		return (EventStudyDay) query.evaluate(specimenInformation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTimingReference(SpecimenInformation) <em>Get Timing Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingReference(SpecimenInformation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::TimingReference))->asSequence()->any(true).oclAsType(sdtm::TimingReference)";

	/**
	 * The cached OCL query for the '{@link #getTimingReference(SpecimenInformation) <em>Get Timing Reference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingReference(SpecimenInformation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TimingReference getTimingReference(SpecimenInformation specimenInformation) {
		if (GET_TIMING_REFERENCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.SPECIMEN_INFORMATION, SdtmPackage.Literals.SPECIMEN_INFORMATION.getEAllOperations().get(95));
			try {
				GET_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_TIMING_REFERENCE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TIMING_REFERENCE__EOCL_QRY);
		return (TimingReference) query.evaluate(specimenInformation);
	}

} // SpecimenInformationOperations
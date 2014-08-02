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

import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Microscopic Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Method Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingStudyTestPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Study Test Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingStudyFindingEvaluator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Study Finding Evaluator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingEventSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingMassIdentification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Mass Identification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingDeathRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Death Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getEventSeverity() <em>Get Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getResultCategory() <em>Get Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getDeathRelationship() <em>Get Death Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MicroscopicFindingOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroscopicFindingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingTemplateId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingTemplateId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.55')";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingTemplateId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingTemplateId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingTemplateId(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingClassCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingClassCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingClassCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingClassCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingClassCode(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingMoodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingMoodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingMoodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingMoodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingMoodCode(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingId(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingId(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingCodeP(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingCodeP(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingCodeP(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingCodeP(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingCodeP(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = 'unknown' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingCode(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingStatusCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingStatusCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingStatusCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingStatusCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingStatusCode(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingValue(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingMethodCodeP(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingMethodCodeP(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingMethodCodeP(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingMethodCodeP(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingMethodCodeP(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_METHOD_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingMethodCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingMethodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingMethodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingMethodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingMethodCode(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingMethodCode(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_METHOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingNonPerformanceReason(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingNonPerformanceReason(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonPerformanceReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingNonPerformanceReason(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Non Performance Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingNonPerformanceReason(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingNonPerformanceReason(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingStudyTestPerformer(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Study Test Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingStudyTestPerformer(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::StudyTestOrganization))";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingStudyTestPerformer(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Study Test Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingStudyTestPerformer(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingStudyTestPerformer(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_STUDY_TEST_PERFORMER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingStudyTestPerformer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingSpecimenInformation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Specimen Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingSpecimenInformation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::SpecimenInformation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingSpecimenInformation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Specimen Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingSpecimenInformation(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingSpecimenInformation(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_SPECIMEN_INFORMATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingStudyFindingEvaluator(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Study Finding Evaluator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingStudyFindingEvaluator(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::StudyFindingEvaluator))";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingStudyFindingEvaluator(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Study Finding Evaluator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingStudyFindingEvaluator(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingStudyFindingEvaluator(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_STUDY_FINDING_EVALUATOR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingStudyFindingEvaluator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingEventSeverity(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Event Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingEventSeverity(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventorFindingSeverity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingEventSeverity(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Event Severity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingEventSeverity(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingEventSeverity(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_EVENT_SEVERITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingEventSeverity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingDataCollection(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingDataCollection(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::DataCollection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingDataCollection(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Data Collection</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingDataCollection(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingDataCollection(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_DATA_COLLECTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingGroupIdentifier(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingGroupIdentifier(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::GroupIdentifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingGroupIdentifier(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Group Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingGroupIdentifier(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingGroupIdentifier(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_GROUP_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingMassIdentification(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Mass Identification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingMassIdentification(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::MassIdentification))";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingMassIdentification(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Mass Identification</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingMassIdentification(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingMassIdentification(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_MASS_IDENTIFICATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingMassIdentification", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingBodySystemorOrganClass(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Body Systemor Organ Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingBodySystemorOrganClass(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::BodySystemorOrganClass) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingBodySystemorOrganClass(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Body Systemor Organ Class</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingBodySystemorOrganClass(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingBodySystemorOrganClass(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingBodySystemorOrganClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingComment(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingComment(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingComment(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingComment(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingComment(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingDomainAssignment(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingDomainAssignment(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingDomainAssignment(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingDomainAssignment(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingDomainAssignment(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingRelatedRecord(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingRelatedRecord(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingRelatedRecord(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingRelatedRecord(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingRelatedRecord(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingSupplementalValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingSupplementalValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingSupplementalValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingSupplementalValue(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingSupplementalValue(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingResultCategory(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Result Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingResultCategory(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::ResultCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingResultCategory(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Result Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingResultCategory(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingResultCategory(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_RESULT_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingResultCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicroscopicFindingDeathRelationship(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Death Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingDeathRelationship(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROSCOPIC_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DeathRelationship) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicroscopicFindingDeathRelationship(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Death Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicroscopicFindingDeathRelationship(MicroscopicFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MICROSCOPIC_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microscopicFinding The receiving '<em><b>Microscopic Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicroscopicFindingDeathRelationship(MicroscopicFinding microscopicFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MICROSCOPIC_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROSCOPIC_FINDING);
			try {
				VALIDATE_MICROSCOPIC_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MICROSCOPIC_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MICROSCOPIC_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(microscopicFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROSCOPIC_FINDING__MICROSCOPIC_FINDING_DEATH_RELATIONSHIP,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicroscopicFindingDeathRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microscopicFinding, context) }),
						 new Object [] { microscopicFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonPerformanceReason(MicroscopicFinding) <em>Get Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonPerformanceReason))->asSequence()->any(true).oclAsType(sdtm::NonPerformanceReason)";

	/**
	 * The cached OCL query for the '{@link #getNonPerformanceReason(MicroscopicFinding) <em>Get Non Performance Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonPerformanceReason getNonPerformanceReason(MicroscopicFinding microscopicFinding) {
		if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(76));
			try {
				GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
		return (NonPerformanceReason) query.evaluate(microscopicFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSpecimenInformation(MicroscopicFinding) <em>Get Specimen Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenInformation(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::SpecimenInformation))->asSequence()->any(true).oclAsType(sdtm::SpecimenInformation)";

	/**
	 * The cached OCL query for the '{@link #getSpecimenInformation(MicroscopicFinding) <em>Get Specimen Information</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenInformation(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SpecimenInformation getSpecimenInformation(MicroscopicFinding microscopicFinding) {
		if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(77));
			try {
				GET_SPECIMEN_INFORMATION__EOCL_QRY = helper.createQuery(GET_SPECIMEN_INFORMATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SPECIMEN_INFORMATION__EOCL_QRY);
		return (SpecimenInformation) query.evaluate(microscopicFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventSeverity(MicroscopicFinding) <em>Get Event Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSeverity(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventorFindingSeverity))->asSequence()->any(true).oclAsType(sdtm::EventorFindingSeverity)";

	/**
	 * The cached OCL query for the '{@link #getEventSeverity(MicroscopicFinding) <em>Get Event Severity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventSeverity(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_SEVERITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventorFindingSeverity getEventSeverity(MicroscopicFinding microscopicFinding) {
		if (GET_EVENT_SEVERITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(78));
			try {
				GET_EVENT_SEVERITY__EOCL_QRY = helper.createQuery(GET_EVENT_SEVERITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_SEVERITY__EOCL_QRY);
		return (EventorFindingSeverity) query.evaluate(microscopicFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDataCollection(MicroscopicFinding) <em>Get Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::DataCollection))->asSequence()->any(true).oclAsType(sdtm::DataCollection)";

	/**
	 * The cached OCL query for the '{@link #getDataCollection(MicroscopicFinding) <em>Get Data Collection</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DataCollection getDataCollection(MicroscopicFinding microscopicFinding) {
		if (GET_DATA_COLLECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(79));
			try {
				GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DATA_COLLECTION__EOCL_QRY);
		return (DataCollection) query.evaluate(microscopicFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGroupIdentifier(MicroscopicFinding) <em>Get Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::GroupIdentifier))->asSequence()->any(true).oclAsType(sdtm::GroupIdentifier)";

	/**
	 * The cached OCL query for the '{@link #getGroupIdentifier(MicroscopicFinding) <em>Get Group Identifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GroupIdentifier getGroupIdentifier(MicroscopicFinding microscopicFinding) {
		if (GET_GROUP_IDENTIFIER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(80));
			try {
				GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
		return (GroupIdentifier) query.evaluate(microscopicFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getBodySystemorOrganClass(MicroscopicFinding) <em>Get Body Systemor Organ Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySystemorOrganClass(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::BodySystemorOrganClass))->asSequence()->any(true).oclAsType(sdtm::BodySystemorOrganClass)";

	/**
	 * The cached OCL query for the '{@link #getBodySystemorOrganClass(MicroscopicFinding) <em>Get Body Systemor Organ Class</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySystemorOrganClass(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  BodySystemorOrganClass getBodySystemorOrganClass(MicroscopicFinding microscopicFinding) {
		if (GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(81));
			try {
				GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY = helper.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY);
		return (BodySystemorOrganClass) query.evaluate(microscopicFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(MicroscopicFinding) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(MicroscopicFinding) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(MicroscopicFinding microscopicFinding) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(82));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(microscopicFinding);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(MicroscopicFinding) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(MicroscopicFinding) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(MicroscopicFinding microscopicFinding) {
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(83));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(microscopicFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(MicroscopicFinding) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(MicroscopicFinding) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(MicroscopicFinding microscopicFinding) {
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(84));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(microscopicFinding);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(MicroscopicFinding) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(MicroscopicFinding) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(MicroscopicFinding microscopicFinding) {
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(85));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(microscopicFinding);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultCategory(MicroscopicFinding) <em>Get Result Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCategory(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULT_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ResultCategory))->asSequence()->any(true).oclAsType(sdtm::ResultCategory)";

	/**
	 * The cached OCL query for the '{@link #getResultCategory(MicroscopicFinding) <em>Get Result Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCategory(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULT_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ResultCategory getResultCategory(MicroscopicFinding microscopicFinding) {
		if (GET_RESULT_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(86));
			try {
				GET_RESULT_CATEGORY__EOCL_QRY = helper.createQuery(GET_RESULT_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULT_CATEGORY__EOCL_QRY);
		return (ResultCategory) query.evaluate(microscopicFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDeathRelationship(MicroscopicFinding) <em>Get Death Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathRelationship(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DEATH_RELATIONSHIP__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DeathRelationship))->asSequence()->any(true).oclAsType(sdtm::DeathRelationship)";

	/**
	 * The cached OCL query for the '{@link #getDeathRelationship(MicroscopicFinding) <em>Get Death Relationship</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathRelationship(MicroscopicFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DEATH_RELATIONSHIP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DeathRelationship getDeathRelationship(MicroscopicFinding microscopicFinding) {
		if (GET_DEATH_RELATIONSHIP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROSCOPIC_FINDING, SdtmPackage.Literals.MICROSCOPIC_FINDING.getEAllOperations().get(87));
			try {
				GET_DEATH_RELATIONSHIP__EOCL_QRY = helper.createQuery(GET_DEATH_RELATIONSHIP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DEATH_RELATIONSHIP__EOCL_QRY);
		return (DeathRelationship) query.evaluate(microscopicFinding);
	}

} // MicroscopicFindingOperations
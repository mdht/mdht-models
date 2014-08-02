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

import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tumor Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Method Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingMassIdentification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Mass Identification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingStudyTestPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Study Test Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingDetectionDelayAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Detection Delay Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingDeathRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Death Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingdetectionDelayAssociationdetectionDelayClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Associationdetection Delay Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingdetectionDelayAssociationdetectionDelayCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Associationdetection Delay Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingdetectionDelayAssociationdetectionDelayMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Associationdetection Delay Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingdetectionDelayAssociationdetectionDelayValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Associationdetection Delay Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingdetectionDelayAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#getComment() <em>Get Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#getRelatedRecord() <em>Get Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#getSupplementalValue() <em>Get Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#getResultCategory() <em>Get Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#getDeathRelationship() <em>Get Death Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TumorFindingOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TumorFindingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingTemplateId(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingTemplateId(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.99')";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingTemplateId(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingTemplateId(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingTemplateId(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingId(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingId(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingId(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingId(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingId(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingCodeP(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingCodeP(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingCodeP(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingCodeP(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingCodeP(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = 'unknown' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingCode(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingStatusCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingStatusCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingStatusCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingStatusCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingStatusCode(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingValue(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingValue(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingValue(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingValue(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingValue(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingMethodCodeP(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingMethodCodeP(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingMethodCodeP(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingMethodCodeP(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingMethodCodeP(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_METHOD_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingMethodCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingMethodCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingMethodCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingMethodCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingMethodCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingMethodCode(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_METHOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingGroupIdentifier(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingGroupIdentifier(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::GroupIdentifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingGroupIdentifier(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Group Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingGroupIdentifier(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingGroupIdentifier(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_GROUP_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingSpecimenInformation(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Specimen Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingSpecimenInformation(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::SpecimenInformation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingSpecimenInformation(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Specimen Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingSpecimenInformation(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingSpecimenInformation(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_SPECIMEN_INFORMATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingMassIdentification(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Mass Identification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingMassIdentification(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::MassIdentification))";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingMassIdentification(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Mass Identification</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingMassIdentification(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingMassIdentification(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_MASS_IDENTIFICATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingMassIdentification", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingNonPerformanceReason(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingNonPerformanceReason(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonPerformanceReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingNonPerformanceReason(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Non Performance Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingNonPerformanceReason(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingNonPerformanceReason(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_NON_PERFORMANCE_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingStudyTestPerformer(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Study Test Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingStudyTestPerformer(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::StudyTestOrganization))";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingStudyTestPerformer(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Study Test Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingStudyTestPerformer(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingStudyTestPerformer(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_STUDY_TEST_PERFORMER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingStudyTestPerformer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingDetectionDelayAssociation(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Detection Delay Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingDetectionDelayAssociation(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_DETECTION_DELAY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingDetectionDelayAssociation(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Detection Delay Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingDetectionDelayAssociation(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_DETECTION_DELAY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingDetectionDelayAssociation(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_DETECTION_DELAY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_DETECTION_DELAY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_DETECTION_DELAY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_DETECTION_DELAY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_DETECTION_DELAY_ASSOCIATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingDetectionDelayAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingComment(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingComment(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingComment(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingComment(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingComment(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingDomainAssignment(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingDomainAssignment(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingDomainAssignment(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingDomainAssignment(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingDomainAssignment(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingRelatedRecord(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingRelatedRecord(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingRelatedRecord(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingRelatedRecord(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingRelatedRecord(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingSupplementalValue(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingSupplementalValue(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingSupplementalValue(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingSupplementalValue(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingSupplementalValue(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingResultCategory(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Result Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingResultCategory(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::ResultCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingResultCategory(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Result Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingResultCategory(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingResultCategory(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_RESULT_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingResultCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingDeathRelationship(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Death Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingDeathRelationship(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DeathRelationship) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingDeathRelationship(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Death Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingDeathRelationship(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingDeathRelationship(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDING_DEATH_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDING_DEATH_RELATIONSHIP,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingDeathRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingdetectionDelayAssociationdetectionDelayClassCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Associationdetection Delay Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingdetectionDelayAssociationdetectionDelayClassCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingdetectionDelayAssociationdetectionDelayClassCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Associationdetection Delay Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingdetectionDelayAssociationdetectionDelayClassCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingdetectionDelayAssociationdetectionDelayClassCode(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingdetectionDelayAssociationdetectionDelayClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingdetectionDelayAssociationdetectionDelayCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Associationdetection Delay Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingdetectionDelayAssociationdetectionDelayCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingdetectionDelayAssociationdetectionDelayCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Associationdetection Delay Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingdetectionDelayAssociationdetectionDelayCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingdetectionDelayAssociationdetectionDelayCode(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingdetectionDelayAssociationdetectionDelayCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingdetectionDelayAssociationdetectionDelayMoodCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Associationdetection Delay Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingdetectionDelayAssociationdetectionDelayMoodCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingdetectionDelayAssociationdetectionDelayMoodCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Associationdetection Delay Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingdetectionDelayAssociationdetectionDelayMoodCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingdetectionDelayAssociationdetectionDelayMoodCode(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingdetectionDelayAssociationdetectionDelayMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingdetectionDelayAssociationdetectionDelayValue(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Associationdetection Delay Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingdetectionDelayAssociationdetectionDelayValue(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingdetectionDelayAssociationdetectionDelayValue(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Associationdetection Delay Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingdetectionDelayAssociationdetectionDelayValue(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingdetectionDelayAssociationdetectionDelayValue(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDINGDETECTION_DELAY_ASSOCIATIONDETECTION_DELAY_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingdetectionDelayAssociationdetectionDelayValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTumorFindingdetectionDelayAssociationTypeCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingdetectionDelayAssociationTypeCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateTumorFindingdetectionDelayAssociationTypeCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingdetection Delay Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTumorFindingdetectionDelayAssociationTypeCode(TumorFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tumorFinding The receiving '<em><b>Tumor Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTumorFindingdetectionDelayAssociationTypeCode(TumorFinding tumorFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TUMOR_FINDING);
			try {
				VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUMOR_FINDINGDETECTION_DELAY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tumorFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TUMOR_FINDING__TUMOR_FINDINGDETECTION_DELAY_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TumorFindingdetectionDelayAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tumorFinding, context) }),
						 new Object [] { tumorFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getGroupIdentifier(TumorFinding) <em>Get Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::GroupIdentifier))->asSequence()->any(true).oclAsType(sdtm::GroupIdentifier)";

	/**
	 * The cached OCL query for the '{@link #getGroupIdentifier(TumorFinding) <em>Get Group Identifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GroupIdentifier getGroupIdentifier(TumorFinding tumorFinding) {
		if (GET_GROUP_IDENTIFIER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.TUMOR_FINDING, SdtmPackage.Literals.TUMOR_FINDING.getEAllOperations().get(76));
			try {
				GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
		return (GroupIdentifier) query.evaluate(tumorFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSpecimenInformation(TumorFinding) <em>Get Specimen Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenInformation(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::SpecimenInformation))->asSequence()->any(true).oclAsType(sdtm::SpecimenInformation)";

	/**
	 * The cached OCL query for the '{@link #getSpecimenInformation(TumorFinding) <em>Get Specimen Information</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenInformation(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SpecimenInformation getSpecimenInformation(TumorFinding tumorFinding) {
		if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.TUMOR_FINDING, SdtmPackage.Literals.TUMOR_FINDING.getEAllOperations().get(77));
			try {
				GET_SPECIMEN_INFORMATION__EOCL_QRY = helper.createQuery(GET_SPECIMEN_INFORMATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SPECIMEN_INFORMATION__EOCL_QRY);
		return (SpecimenInformation) query.evaluate(tumorFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonPerformanceReason(TumorFinding) <em>Get Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonPerformanceReason))->asSequence()->any(true).oclAsType(sdtm::NonPerformanceReason)";

	/**
	 * The cached OCL query for the '{@link #getNonPerformanceReason(TumorFinding) <em>Get Non Performance Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonPerformanceReason getNonPerformanceReason(TumorFinding tumorFinding) {
		if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.TUMOR_FINDING, SdtmPackage.Literals.TUMOR_FINDING.getEAllOperations().get(78));
			try {
				GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
		return (NonPerformanceReason) query.evaluate(tumorFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComment(TumorFinding) <em>Get Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment))->asSequence()->any(true).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComment(TumorFinding) <em>Get Comment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Comment getComment(TumorFinding tumorFinding) {
		if (GET_COMMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.TUMOR_FINDING, SdtmPackage.Literals.TUMOR_FINDING.getEAllOperations().get(79));
			try {
				GET_COMMENT__EOCL_QRY = helper.createQuery(GET_COMMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENT__EOCL_QRY);
		return (Comment) query.evaluate(tumorFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(TumorFinding) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(TumorFinding) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(TumorFinding tumorFinding) {
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.TUMOR_FINDING, SdtmPackage.Literals.TUMOR_FINDING.getEAllOperations().get(80));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(tumorFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecord(TumorFinding) <em>Get Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecord(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORD__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord))->asSequence()->any(true).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecord(TumorFinding) <em>Get Related Record</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecord(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  RelatedRecord getRelatedRecord(TumorFinding tumorFinding) {
		if (GET_RELATED_RECORD__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.TUMOR_FINDING, SdtmPackage.Literals.TUMOR_FINDING.getEAllOperations().get(81));
			try {
				GET_RELATED_RECORD__EOCL_QRY = helper.createQuery(GET_RELATED_RECORD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RELATED_RECORD__EOCL_QRY);
		return (RelatedRecord) query.evaluate(tumorFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValue(TumorFinding) <em>Get Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValue(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue))->asSequence()->any(true).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValue(TumorFinding) <em>Get Supplemental Value</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValue(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SupplementalValue getSupplementalValue(TumorFinding tumorFinding) {
		if (GET_SUPPLEMENTAL_VALUE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.TUMOR_FINDING, SdtmPackage.Literals.TUMOR_FINDING.getEAllOperations().get(82));
			try {
				GET_SUPPLEMENTAL_VALUE__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLEMENTAL_VALUE__EOCL_QRY);
		return (SupplementalValue) query.evaluate(tumorFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultCategory(TumorFinding) <em>Get Result Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCategory(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULT_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ResultCategory))->asSequence()->any(true).oclAsType(sdtm::ResultCategory)";

	/**
	 * The cached OCL query for the '{@link #getResultCategory(TumorFinding) <em>Get Result Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCategory(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULT_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ResultCategory getResultCategory(TumorFinding tumorFinding) {
		if (GET_RESULT_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.TUMOR_FINDING, SdtmPackage.Literals.TUMOR_FINDING.getEAllOperations().get(83));
			try {
				GET_RESULT_CATEGORY__EOCL_QRY = helper.createQuery(GET_RESULT_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULT_CATEGORY__EOCL_QRY);
		return (ResultCategory) query.evaluate(tumorFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDeathRelationship(TumorFinding) <em>Get Death Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathRelationship(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DEATH_RELATIONSHIP__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DeathRelationship))->asSequence()->any(true).oclAsType(sdtm::DeathRelationship)";

	/**
	 * The cached OCL query for the '{@link #getDeathRelationship(TumorFinding) <em>Get Death Relationship</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathRelationship(TumorFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DEATH_RELATIONSHIP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DeathRelationship getDeathRelationship(TumorFinding tumorFinding) {
		if (GET_DEATH_RELATIONSHIP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.TUMOR_FINDING, SdtmPackage.Literals.TUMOR_FINDING.getEAllOperations().get(84));
			try {
				GET_DEATH_RELATIONSHIP__EOCL_QRY = helper.createQuery(GET_DEATH_RELATIONSHIP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DEATH_RELATIONSHIP__EOCL_QRY);
		return (DeathRelationship) query.evaluate(tumorFinding);
	}

} // TumorFindingOperations
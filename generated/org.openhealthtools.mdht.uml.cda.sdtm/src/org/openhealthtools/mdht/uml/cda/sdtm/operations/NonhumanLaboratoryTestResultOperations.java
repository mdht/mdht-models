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

import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.FastingStatus;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.Toxicity;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nonhuman Laboratory Test Result</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Method Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultStudyTestPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Study Test Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultExclusionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Exclusion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultToxicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Toxicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultFastingStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Fasting Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getExclusionIndicator() <em>Get Exclusion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getToxicity() <em>Get Toxicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getCategory() <em>Get Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getSubCategory() <em>Get Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getFastingStatus() <em>Get Fasting Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonhumanLaboratoryTestResultOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonhumanLaboratoryTestResultOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultTemplateId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultTemplateId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.59')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultTemplateId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultTemplateId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultTemplateId(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultClassCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultClassCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultCodeP(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultId(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultId(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultMoodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultMoodCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultStatusCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultStatusCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultStatusCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultStatusCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultStatusCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultValue(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultMethodCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultMethodCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultMethodCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultMethodCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultMethodCodeP(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultMethodCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultMethodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultMethodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultMethodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultMethodCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultMethodCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultInterpretationCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Interpretation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultInterpretationCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultInterpretationCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Interpretation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultInterpretationCodeP(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultInterpretationCodeP(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultInterpretationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultInterpretationCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultInterpretationCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (self.interpretationCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'C78802' or value.code = 'C78800' or value.code = '78801' or value.code = '78727' or value.code = 'CXXXXX' or value.code = 'CXXXXX' or value.code = 'CXXXXX')))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultInterpretationCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultInterpretationCode(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultInterpretationCode(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultGroupIdentifier(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultGroupIdentifier(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::GroupIdentifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultGroupIdentifier(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Group Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultGroupIdentifier(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultGroupIdentifier(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultSpecimenInformation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Specimen Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultSpecimenInformation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::SpecimenInformation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultSpecimenInformation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Specimen Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultSpecimenInformation(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultSpecimenInformation(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultNonPerformanceReason(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultNonPerformanceReason(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonPerformanceReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultNonPerformanceReason(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Non Performance Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultNonPerformanceReason(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultNonPerformanceReason(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultStudyTestPerformer(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Study Test Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultStudyTestPerformer(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::StudyTestOrganization))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultStudyTestPerformer(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Study Test Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultStudyTestPerformer(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultStudyTestPerformer(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_STUDY_TEST_PERFORMER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultStudyTestPerformer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultExclusionIndicator(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Exclusion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultExclusionIndicator(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::ExclusionReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultExclusionIndicator(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Exclusion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultExclusionIndicator(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultExclusionIndicator(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultExclusionIndicator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultPlannedStudyDay(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Planned Study Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultPlannedStudyDay(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::PlannedStudyDay) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultPlannedStudyDay(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Planned Study Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultPlannedStudyDay(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultPlannedStudyDay(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultPlannedStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultStudyDayPeriod(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultStudyDayPeriod(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StudyDayPeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultStudyDayPeriod(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Study Day Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultStudyDayPeriod(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultStudyDayPeriod(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultTimingReference(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Timing Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultTimingReference(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::TimingReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultTimingReference(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Timing Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultTimingReference(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultTimingReference(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultComment(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultComment(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultComment(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultComment(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultComment(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultDomainAssignment(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultDomainAssignment(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultDomainAssignment(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultDomainAssignment(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultDomainAssignment(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultRelatedRecord(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultRelatedRecord(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultRelatedRecord(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultRelatedRecord(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultRelatedRecord(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultSupplementalValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultSupplementalValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultSupplementalValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultSupplementalValue(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultSupplementalValue(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultToxicity(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Toxicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultToxicity(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Toxicity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultToxicity(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Toxicity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultToxicity(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultToxicity(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TOXICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_TOXICITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultToxicity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Category) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultCategory(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultSubCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultSubCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SubCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultSubCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Sub Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultSubCategory(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultSubCategory(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_SUB_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonhumanLaboratoryTestResultFastingStatus(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Fasting Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultFastingStatus(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FastingStatus) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNonhumanLaboratoryTestResultFastingStatus(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Fasting Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonhumanLaboratoryTestResultFastingStatus(NonhumanLaboratoryTestResult, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonhumanLaboratoryTestResult The receiving '<em><b>Nonhuman Laboratory Test Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonhumanLaboratoryTestResultFastingStatus(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT);
			try {
				VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(nonhumanLaboratoryTestResult)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NONHUMAN_LABORATORY_TEST_RESULT__NONHUMAN_LABORATORY_TEST_RESULT_FASTING_STATUS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonhumanLaboratoryTestResultFastingStatus", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonhumanLaboratoryTestResult, context) }),
						 new Object [] { nonhumanLaboratoryTestResult }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getGroupIdentifier(NonhumanLaboratoryTestResult) <em>Get Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::GroupIdentifier))->asSequence()->any(true).oclAsType(sdtm::GroupIdentifier)";

	/**
	 * The cached OCL query for the '{@link #getGroupIdentifier(NonhumanLaboratoryTestResult) <em>Get Group Identifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GroupIdentifier getGroupIdentifier(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_GROUP_IDENTIFIER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(79));
			try {
				GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
		return (GroupIdentifier) query.evaluate(nonhumanLaboratoryTestResult);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSpecimenInformation(NonhumanLaboratoryTestResult) <em>Get Specimen Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenInformation(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::SpecimenInformation))->asSequence()->any(true).oclAsType(sdtm::SpecimenInformation)";

	/**
	 * The cached OCL query for the '{@link #getSpecimenInformation(NonhumanLaboratoryTestResult) <em>Get Specimen Information</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenInformation(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SpecimenInformation getSpecimenInformation(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(80));
			try {
				GET_SPECIMEN_INFORMATION__EOCL_QRY = helper.createQuery(GET_SPECIMEN_INFORMATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SPECIMEN_INFORMATION__EOCL_QRY);
		return (SpecimenInformation) query.evaluate(nonhumanLaboratoryTestResult);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonPerformanceReason(NonhumanLaboratoryTestResult) <em>Get Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonPerformanceReason))->asSequence()->any(true).oclAsType(sdtm::NonPerformanceReason)";

	/**
	 * The cached OCL query for the '{@link #getNonPerformanceReason(NonhumanLaboratoryTestResult) <em>Get Non Performance Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonPerformanceReason getNonPerformanceReason(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(81));
			try {
				GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
		return (NonPerformanceReason) query.evaluate(nonhumanLaboratoryTestResult);
	}

	/**
	 * The cached OCL expression body for the '{@link #getExclusionIndicator(NonhumanLaboratoryTestResult) <em>Get Exclusion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusionIndicator(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXCLUSION_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ExclusionReason))->asSequence()->any(true).oclAsType(sdtm::ExclusionReason)";

	/**
	 * The cached OCL query for the '{@link #getExclusionIndicator(NonhumanLaboratoryTestResult) <em>Get Exclusion Indicator</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusionIndicator(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXCLUSION_INDICATOR__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ExclusionReason getExclusionIndicator(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_EXCLUSION_INDICATOR__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(82));
			try {
				GET_EXCLUSION_INDICATOR__EOCL_QRY = helper.createQuery(GET_EXCLUSION_INDICATOR__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXCLUSION_INDICATOR__EOCL_QRY);
		return (ExclusionReason) query.evaluate(nonhumanLaboratoryTestResult);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedStudyDay(NonhumanLaboratoryTestResult) <em>Get Planned Study Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedStudyDay(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PlannedStudyDay))->asSequence()->any(true).oclAsType(sdtm::PlannedStudyDay)";

	/**
	 * The cached OCL query for the '{@link #getPlannedStudyDay(NonhumanLaboratoryTestResult) <em>Get Planned Study Day</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedStudyDay(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_STUDY_DAY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PlannedStudyDay getPlannedStudyDay(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_PLANNED_STUDY_DAY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(83));
			try {
				GET_PLANNED_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_PLANNED_STUDY_DAY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_STUDY_DAY__EOCL_QRY);
		return (PlannedStudyDay) query.evaluate(nonhumanLaboratoryTestResult);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyDayPeriod(NonhumanLaboratoryTestResult) <em>Get Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudyDayPeriod))->asSequence()->any(true).oclAsType(sdtm::StudyDayPeriod)";

	/**
	 * The cached OCL query for the '{@link #getStudyDayPeriod(NonhumanLaboratoryTestResult) <em>Get Study Day Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StudyDayPeriod getStudyDayPeriod(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(84));
			try {
				GET_STUDY_DAY_PERIOD__EOCL_QRY = helper.createQuery(GET_STUDY_DAY_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_DAY_PERIOD__EOCL_QRY);
		return (StudyDayPeriod) query.evaluate(nonhumanLaboratoryTestResult);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTimingReference(NonhumanLaboratoryTestResult) <em>Get Timing Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingReference(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::TimingReference))->asSequence()->any(true).oclAsType(sdtm::TimingReference)";

	/**
	 * The cached OCL query for the '{@link #getTimingReference(NonhumanLaboratoryTestResult) <em>Get Timing Reference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingReference(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TimingReference getTimingReference(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_TIMING_REFERENCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(85));
			try {
				GET_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_TIMING_REFERENCE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TIMING_REFERENCE__EOCL_QRY);
		return (TimingReference) query.evaluate(nonhumanLaboratoryTestResult);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(NonhumanLaboratoryTestResult) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(NonhumanLaboratoryTestResult) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(86));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(nonhumanLaboratoryTestResult);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(NonhumanLaboratoryTestResult) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(NonhumanLaboratoryTestResult) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(87));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(nonhumanLaboratoryTestResult);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(NonhumanLaboratoryTestResult) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(NonhumanLaboratoryTestResult) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(88));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(nonhumanLaboratoryTestResult);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(NonhumanLaboratoryTestResult) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(NonhumanLaboratoryTestResult) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(89));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(nonhumanLaboratoryTestResult);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getToxicity(NonhumanLaboratoryTestResult) <em>Get Toxicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToxicity(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TOXICITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Toxicity))->asSequence()->any(true).oclAsType(sdtm::Toxicity)";

	/**
	 * The cached OCL query for the '{@link #getToxicity(NonhumanLaboratoryTestResult) <em>Get Toxicity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToxicity(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TOXICITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Toxicity getToxicity(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_TOXICITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(90));
			try {
				GET_TOXICITY__EOCL_QRY = helper.createQuery(GET_TOXICITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TOXICITY__EOCL_QRY);
		return (Toxicity) query.evaluate(nonhumanLaboratoryTestResult);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCategory(NonhumanLaboratoryTestResult) <em>Get Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Category))->asSequence()->any(true).oclAsType(sdtm::Category)";

	/**
	 * The cached OCL query for the '{@link #getCategory(NonhumanLaboratoryTestResult) <em>Get Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Category getCategory(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(91));
			try {
				GET_CATEGORY__EOCL_QRY = helper.createQuery(GET_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CATEGORY__EOCL_QRY);
		return (Category) query.evaluate(nonhumanLaboratoryTestResult);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubCategory(NonhumanLaboratoryTestResult) <em>Get Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUB_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubCategory))->asSequence()->any(true).oclAsType(sdtm::SubCategory)";

	/**
	 * The cached OCL query for the '{@link #getSubCategory(NonhumanLaboratoryTestResult) <em>Get Sub Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUB_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SubCategory getSubCategory(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_SUB_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(92));
			try {
				GET_SUB_CATEGORY__EOCL_QRY = helper.createQuery(GET_SUB_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUB_CATEGORY__EOCL_QRY);
		return (SubCategory) query.evaluate(nonhumanLaboratoryTestResult);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFastingStatus(NonhumanLaboratoryTestResult) <em>Get Fasting Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastingStatus(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FASTING_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FastingStatus))->asSequence()->any(true).oclAsType(sdtm::FastingStatus)";

	/**
	 * The cached OCL query for the '{@link #getFastingStatus(NonhumanLaboratoryTestResult) <em>Get Fasting Status</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastingStatus(NonhumanLaboratoryTestResult)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FASTING_STATUS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  FastingStatus getFastingStatus(NonhumanLaboratoryTestResult nonhumanLaboratoryTestResult) {
		if (GET_FASTING_STATUS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT, SdtmPackage.Literals.NONHUMAN_LABORATORY_TEST_RESULT.getEAllOperations().get(93));
			try {
				GET_FASTING_STATUS__EOCL_QRY = helper.createQuery(GET_FASTING_STATUS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FASTING_STATUS__EOCL_QRY);
		return (FastingStatus) query.evaluate(nonhumanLaboratoryTestResult);
	}

} // NonhumanLaboratoryTestResultOperations